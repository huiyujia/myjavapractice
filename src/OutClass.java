/**
 * Created by jiahuiyu on 2017/8/18.
 */
public class OutClass {
    private static int a =11;
    private void adjust(){
        for(int i=0;i<11;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        OutClass s=new OutClass();
        s.adjust();
    }
}
