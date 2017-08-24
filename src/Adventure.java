

/**
 * Created by jiahuiyu on 2017/8/17.
 */
interface Monster{
    void meance();
}
interface  DangerousMonster extends Monster{
    void destroy();
}
interface Lethal{
    void kill();
}
class DragonZilla implements DangerousMonster{
    public void meance(){};
    public void destroy(){};
}
interface Vampire extends DangerousMonster,Lethal{
    void drinkblood();
}
class Adventure {
    static void b(Monster U){U.meance();}
    static void c(DangerousMonster v){v.destroy();}
    public static void main(String[] args){
        DragonZilla m2=new DragonZilla();
        b(m2);
        c(m2);
    }
}

