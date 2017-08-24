/**
 * Created by jiahuiyu on 2017/8/17.
 */
public class Music5 {
    static void tune(Instrument5 i) {
        i.play();
    }

    static void tuneAll(Instrument5[] e) {
        for (int i = 0; i < e.length; i++) {
            tune(e[i]);
        }
    }

    public static void main(String[] args) {
        int i = 0;
        Instrument5[] tools = new Instrument5[1];
        tools[i++] = new Brass5();
        tuneAll(tools);
    }
}
