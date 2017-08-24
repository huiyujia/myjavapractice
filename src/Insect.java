/**
 * Created by jiahuiyu on 2017/8/16.
 */
public class Insect {
    int i=9;
    int j;
    Insect(){
       prt("i="+i+",j="+j);
       j=40;
    }
    static int x1=prt("you can~");
    static int  prt(String s){
        //s="sssss";
        System.out.println(s);
        return 4;
    }
}

