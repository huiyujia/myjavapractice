/**
 * Created by jiahuiyu on 2017/8/16.
 */
public class Music{
    public static void tune(Instruments i){
        i.play(Note.c);
    }
    public static void main(String[] args){
        Winds g=new Winds();
        tune(g);
    }
}

