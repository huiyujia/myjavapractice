//import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

import java.util.*;

/**
 * Created by jiahuiyu on 2017/8/25.
 */
public class ListPerformance {
    private static final int p=100;
    private static abstract  class Tester{
        String name;
        int size;
        Tester(String name,int size){
            this.name=name;
            this.size=size;
        }
        abstract void test(List a);
    }
    private static Tester[] tests={
            new Tester("get",30){
                void test(List a){
                    for(int i=0;i<p;i++){
                        for(int j=0;j<a.size();j++){
                            a.get(j);
                        }
                    }
            }
                },
            new Tester("iterator",300){
                void test(List a){
                    for(int i=0;i<p;i++){
                        Iterator it=a.iterator();
                        if(it.hasNext()){
                            System.out.println(it.next());
                        }
                    }
                }
            },
            new Tester("insert",100) {
                void test(List a){
                    int half=a.size()*(1/2);
                    String s="test";
                    ListIterator it =a.listIterator(half);
                    for(int i=0;i<size*10;i++){
                        it.add(s);
                    }

                }

                },
            new Tester("remove",500){
                void test(List a){
                    ListIterator it=a.listIterator(5);
                    while(it.hasNext()){
                        it.next();
                        it.remove();
                    }
                }
            }
            };
    public static void test(List a){
        System.out.println("Testing " +
                a.getClass().getName());
        for(int i = 0; i < tests.length; i++) {
            Collection1.fill(a, tests[i].size);
            System.out.print(tests[i].name);
            long t1 = System.currentTimeMillis();
            tests[i].test(a);
            long t2 = System.currentTimeMillis();
            System.out.println(": " + (t2 -t1));
        }
    }
    public static void main(String[] args) {
        test(new ArrayList());
        test(new LinkedList());
    }

    }


