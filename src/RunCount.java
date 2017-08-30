/**
 * Created by jiahuiyu on 2017/8/30.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 问题：有些软件下载后，会限制使用次数，满一定使用次数后要求注册。这种情况如何实现呢？
        思考：记录应用程序运行次数，如果次数已到，那么给出注册提示。我们很容易想到的是：计数器。
        该计数器定义在程序中，随着程序的运行而在内存中存在，并进行自增。
        可是，随着该应用程序的退出，该计数器也会在内存中消失了。
        下一次在启动该程序，又重新开始从0计数，这不是我们想要的。
        我们想要程序即使结束，该计数器的值也存在，下次程序启动在会先加载该计数器的值并加1后再重新存储起来。
        所以，可以通过建立一个配置文件，用于记录该软件的使用次数。
    该配置文件使用键值对的形式，这样方便阅读数据，并操作数据。
 * 键值对数据用到map集合，数据是以文件形式存储要用到IO技术    →   properties
 */
public class RunCount {
    public static void main(String[] args)throws IOException{
        Properties prop=new Properties();
        File file=new File("C:/Users/jiahuiyu/Desktop/configcount.ini");
        if(!file.exists())
            file.createNewFile();
        FileInputStream fis=new FileInputStream(file);
        prop.load(fis);
        int count=0;
        String value=prop.getProperty("time");
        if(value!=null){
            count=Integer.parseInt(value);
            if(count>=5){
                System.out.println("使用次数已达上限，请注册");
                return;
            }
        }
        count++;
        prop.setProperty("time",count+"");
        FileOutputStream fio=new FileOutputStream(file);
        prop.store(fio,"");
        fio.close();
    }
}
