/**
 * Created by jiahuiyu on 2017/8/17.
 */
//abstract class Contents{
    //abstract public int value();
//}//已存在
//interface Destination{
    //String readLable();
//}//已存在
public class Parcel10{
    private static class PContents extends Contents{
        private int i=11;
        public int value(){return i;}
    }
    protected static class PDestination implements Destination{
        private String lable;
        private PDestination(String whereTo){
            lable=whereTo;
        }
        public String readLable(){return lable;}
    }
        public static Destination dest(String s){
            return new PDestination(s);
        }
        public static Contents cont(){
            return new PContents();
        }
        public static void main(String[] args){
            Contents C=cont();
            Destination D=dest("taiwan");
        }
    }

