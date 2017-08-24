/**
 * Created by jiahuiyu on 2017/8/16.
 */

public class Beetle extends Insect{
    int k=prt("Beetle.k initialized");
    Beetle(){
        prt("k="+k);
        prt("j="+j);
    }
    static int x2=prt("static beetle.x2 inialize");
    static int prt(String s){
        System.out.println("dddd");
        return 5;
    }
    public static void main(String[] args){
        Beetle B=new Beetle();
        prt("Beetle constructor!");
    }
}
