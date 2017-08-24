import java.util.Stack;

/**
 * Created by jiahuiyu on 2017/8/19.
 */
public class Stacks{
    static String[] months={"11","22","33","44","55","66","77","88","99","10","11","12"};
    public static void main(String[] args){
        Stack stk=new Stack();
        for(int i=0;i<months.length;i++){
            stk.push(months[i]+"");
        }
            System.out.println("stk="+stk);
        stk.addElement("the stk lastline");
        System.out.println("element 5="+stk.elementAt(11));
        while(!stk.empty())
            System.out.println(stk.pop());
    }
}
