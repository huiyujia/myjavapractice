/**
 * Created by jiahuiyu on 2017/8/30.
 */
import java.io.*;
import java.util.*;

public class Demo {
    public static void main(String args[]) throws IOException {
        loadDemo();
        method();
    }

    /**
     * 下载原有文件，往此文件中写入信息
     * @throws IOException
     */

    public static void loadDemo() throws IOException {
        FileInputStream fis = new FileInputStream("C:/Users/jiahuiyu/Desktop/info.txt");
        Properties prop = new Properties();
        prop.load(fis);// 将流中的数据加载进集合
        sop(prop);
        FileOutputStream fos = new FileOutputStream("C:/Users/jiahuiyu/Desktop/info1.txt");
        prop.store(fos, "haha,i am jia hui yu");// 将此 Properties 表中的属性列表（键和元素对）写入输出流
        prop.list(System.out);
        fos.close();
        fis.close();
    }

    // 设置和获取元素

    /**
     * 读取文件内容，读取为map的hashtable格式
     * @throws IOException
     */
    public static void method() throws IOException {
        BufferedReader bufr = new BufferedReader(new FileReader("C:/Users/jiahuiyu/Desktop/info.txt"));
        String line = null;
        Properties prop = new Properties();
        while ((line = bufr.readLine()) != null) {
            String[] arr = line.split(" ");
            prop.setProperty(arr[0], arr[1]);
            sop(prop);
        }
    }

    public static void sop(Object obj) {
        System.out.println(obj.toString());
    }
}

