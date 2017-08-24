/**
 * Created by jiahuiyu on 2017/8/17.
 */
abstract class Contents{
    abstract public int value();
}
interface Destination{
    String readLable();
}
public class Parcel3 {
    private class PContents extends Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    protected abstract class PDestination implements Destination {
        private String lable;
        private  PDestination(String whereTo) {
            lable = whereTo;
        }
        public String readLine() {
            return lable;
        }
    }
        public Destination dest(String d) {
            return new PDestination(d) {
                @Override
                public String readLable() {
                    return null;
                }
            };
        }

        public Contents cont() {
            return new PContents();
        }
    }

class Test{
    public static void main(String[] args){
        Parcel3 P=new Parcel3();
        Contents c=P.cont();
        Destination C=P.dest("HUASHENGDUN");
        }
    }
