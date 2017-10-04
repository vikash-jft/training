import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by vikash on 4/10/17.
 */

// There is a requirement that if I have a List of some numbers in a arrayList
// and I want to perform some operation like odd,even or any type of operation
// and then that result should be store in new Array list.

// Let See solution of that Example in Both way First way is Without Stream (Untill 1.8) and Second way is with Stream (from 1.8 onwords).


public class StreamConcept {
    public static void main(String[] args) {
        List<Integer> listst=new ArrayList<Integer>();
                listst.add(25);
                listst.add(66);
                listst.add(48);
                listst.add(93);
                listst.add(20);


        // Without Stream (Untill 1.8)
        List<Integer> list2 = new ArrayList<Integer>();
            for(int i : listst){
                if(i%2==0){
                    list2.add(i);
                }
            }
        System.out.println(list2);


        // With Stream (From 1.8 onWords)
        // To Find even Number in gievn list.
        List<Integer> list3=list2.stream().filter(a -> a%2==0).collect(Collectors.toList());
        list3.forEach(System.out::println);




        Stream<String> stream=Stream.of("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten");
       // Siplest print without any condition
        // stream.forEach(System.out::println);


        // 1) First store in List and then perform some operation then print with forEach
        //List<String> l=stream.filter((str1) -> str1.length()<=4).collect(Collectors.toList());
        //l.forEach(System.out::println);

        //  2) Same here to print with forEach but not store in any ArrayList but perform some Condition
        stream.filter((str1) -> str1.length()<=4).forEach(System.out::println);
    }
}
