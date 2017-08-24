/**
 * Created by jiahuiyu on 2017/8/15.
 */
public class Tree {
    int height;
    Tree(){
        System.out.println("planting a seeding");
        height=0;
    }
    Tree(int i){
        System.out.println("tree is"+i+"feet tall");
    }
    void info(){
        System.out.println("tree is"+height+"feet tall");
    }
    void info(String s){
        System.out.println(s+"tree is"+height+"feet fall");
    }
    public static void main(String[] args){
        new Tree();
        for(int i=0;i<5;i++){
            Tree t=new Tree(i);
            t.info();
            t.info("method is overload");
            //System.out.println();
        }
    }
}

