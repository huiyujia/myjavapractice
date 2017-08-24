/**
 * Created by jiahuiyu on 2017/8/17.
 */
public class Parcel1 {
    class Contents{
        private int i=11;
        public int value(){return i;}
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            label=whereTo;
        }
        String readLable(){return label;}
    }
    //TODO 特殊方法，返回一个指向内部类的句柄
    public Destination to(String s){
        return new Destination(s);
    }
    public void ship(String dest){
        Contents C=new Contents();
        Destination D=to(dest);
    }
    public static void main(String[] args){
        Parcel1 P=new Parcel1();
        P.ship("TAIWAN");
        Parcel1 Q=new Parcel1();
        //Parcel1.Contents CC=Q.Contents();找不到符号
        Parcel1.Destination DD=P.to("borneo");
        //System.out.println(P.ship("TAIWAN"));
    }
}
