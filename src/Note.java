/**
 * Created by jiahuiyu on 2017/8/16.
 */
public class Note {
    private int a;
    private Note(int val){
        a=val;
    }
    public static final Note
        b=new Note(3),
        c=new Note(4);
}
class Instruments{
    public void play(Note c){
        System.out.println("play!");
    }
}


