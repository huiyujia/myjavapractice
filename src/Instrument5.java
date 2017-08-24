/**
 * Created by jiahuiyu on 2017/8/17.
 */
interface Instrument5{
    int i=5;
    void play();
    String what();
    void adjust();
}
class Wind5 implements Instrument5{
    public void play(){
        System.out.println("play");
    }
    public String what(){
        return "what()";
    }
    public void adjust(){}
}
class Percussion5 implements Instrument5{
    public void play(){
        System.out.println("percussion5.play()");
    }
    public String what(){
        return "perssions5.what()";
    }
    public void adjust(){
        System.out.println("percussion5.adjust()");
    }
}
class Brass5 extends Wind5{
    public void play(){
        System.out.println("Brass5.play()");
    }
    public String what(){
        return "Brass5.what()";
    }
    public void adjust(){
        System.out.println("Brass5.adjust()");
    }
}
