//import java.util.Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

/**
 * Created by vikash on 3/10/17.
 */

interface Intf {
  public void m1();
}


public class LambdaExample {

        // Instance Variable
        int x=10;
        Intf intf = new Intf() {
            @Override
            public void m1() {
                System.out.println("hello bhushan");
            }
        };


       public void m2() {
           intf.m1();
 /*           int y=5;
            Intf i = () ->
            {
                System.out.println(x);
                // Local variable referenced from Lambda Expresion must be final, or effective final
                // y is a Local Variable so that is bydefault y is Final Variable.
                System.out.println(y);
            };
            i.m1();*/
        }

    public static void main(String[] args) {
        System.out.println("See Some Lambda Expressions Example here\n");

        /*LambdaExample lambda=new LambdaExample();
        lambda.m2();


        LambdaExample example=new LambdaExample();
        Random random=new Random();
        random.ints().limit(10).forEach(System.out :: println);*/

        List<String> list= Arrays.asList("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten");

         list.forEach(System.out::print);
        List<String> list1=new ArrayList<>();

        Consumer<String> c=System.out::println;
        Consumer<String> c1=list1::add;
        list.forEach(c.andThen(c1));


    }
}
