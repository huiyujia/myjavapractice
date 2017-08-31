import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by jiahuiyu on 2017/8/31.
 */
class StringAdress{
    private String s;
    public StringAdress(String s){
        this.s=s;
    }
    public String toString(){
        return super.toString()+" "+s;
    }
}
public class FillingList {
    public static void main(String[] args) {
        //List<StringAdress> sa = new ArrayList<StringAdress>(
            //Collections.nCopies(4,new StringAdress("hello")));
            //System.out.println(sa);
            //Collections.fill(sa,new StringAdress("world!"));
            //System.out.println(sa);
            List<StringAdress> list=new ArrayList<StringAdress>(
                    Collections.nCopies(8,new StringAdress("code")));
        HashMap maps=new HashMap();
        for(int i=0;i<list.size();i++){
            maps.put(i,list);}
        //System.out.println(i);
        //System.out.println(list);
        System.out.println(maps);
    }
        }
