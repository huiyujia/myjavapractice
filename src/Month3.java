import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.jar.JarEntry;

/**
 * Created by jiahuiyu on 2017/8/17.
 */
public final class Month3 {
    private String name;
    private Month3(String nn){nn=name;}//构造函数
    public String toString(){return name;}
    static final Month3
    J= new Month3("一月"),
    FE= new Month3("二月");
    public final static Month3[] month={
            J,FE
    };
    public static void main(String[] args){
        Month3 m=Month3.FE;
        Month3 M=Month3.month[1];
        System.out.println(Month3.FE);
    }
}

