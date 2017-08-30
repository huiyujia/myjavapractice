import java.io.*;
import java.util.Properties;

/**
 * Created by jiahuiyu on 2017/8/30.
 */
public class PrinterDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new FileWriter("C:/Users/jiahuiyu/Desktop/info.txt"),true);
        String line =null;
        while ((line = bufer.readLine()) != null) {
            if ("over".equals(line)) {
                break;
            }
            out.println(line.toUpperCase());
        }
        out.close();
        bufer.close();
    }
    public static void sop(Object object) {
        System.out.println(object.toString());
    }
}
