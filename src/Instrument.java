/**
 * Created by jiahuiyu on 2017/8/16.
 */
public class Instrument {
    public void play() {
        System.out.println("play a instrument~");
    }

    static void tune(Instrument i) {
        i.play();
    }
    //static void turn(Wind s){
    // s.play();
//}
}
    class Wind extends Instrument {
        public static void main(String[] args){
            Wind d=new Wind();
            Instrument.tune(d);
        }
    }
/**
 * tune()为基础类中定义的方法
 * tune()方法接受一个对象句柄作为参数
 * 在继承类中，同样接受了继承类的对象句柄作为参数
 * 继承类的对象也属于基础类的对象
 */
