/**
 * Created by jiahuiyu on 2017/8/30.
 */
import java.io.*;
import java.util.*;

public class SplitDemo {

    public static void main(String args[]) throws Exception {
        splitFile();
        merge();
    }

    public static void splitFile() throws Exception {
        FileInputStream fis = new FileInputStream("Demo.mp3");
        FileOutputStream fos = null;
        byte[] buf = new byte[1024 * 1024];
        int len = 0;
        int count = 1;
        while ((len = fis.read(buf)) != -1) {
            fos = new FileOutputStream("Demo-" + (count++) + ".part");
            fos.write(buf, 0, len);
            fos.close();
        }
        fis.close();
    }

    public static void merge() throws Exception {
        ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
        for (int x = 1; x < 10; x++) {
            al.add(new FileInputStream("Demo-" + x + ".part"));
        }
        final Iterator<FileInputStream> it = al.iterator();
        Enumeration<FileInputStream> en = new Enumeration<FileInputStream>() {
            public boolean hasMoreElements() {
                return it.hasNext();
            }

            public FileInputStream nextElement() {
                return it.next();
            }
        };
        SequenceInputStream sis = new SequenceInputStream(en);
        FileOutputStream fos = new FileOutputStream("Demo_part.mp3");
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = sis.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }
        fos.close();
        sis.close();
    }

    public static void sop(Object obj) {
        System.out.println(obj.toString());
    }

}
