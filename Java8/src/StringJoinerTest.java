import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * Created by vikash on 4/10/17.
 */
public class StringJoinerTest {

    public static void main(String[] args) {

        // 1) Join String by a Seperator
        StringJoiner sj=new StringJoiner(",");
            sj.add("aaa");
            sj.add("bbb");
            sj.add("ccc");
            sj.add("ddd");
            sj.add("eee");

        System.out.println(sj);
        // Converting StringJoiner to String
        String s=sj.toString();
        System.out.println(s);


        // 2) Join String by a delimiter and starting with a supplied prefix and ending with a supplied suffix.
        StringJoiner stringJoiner=new StringJoiner("-","prefix {","} Suffix");
                stringJoiner.add("2017");
                stringJoiner.add("10");
                stringJoiner.add("04");
        System.out.println(stringJoiner);


        // 3) String.join()
        String s1=String.join("-","2017","10","04");
        System.out.println(s1);


        // 4) Join a list by Seprator
        List<String> list= Arrays.asList("Vikash","Mukesh","Suresh","Haresh");
        String s2=String.join(",",list);
        System.out.println(s2);



        // 5) Collectors.joining
        List<String> list1 = Arrays.asList("java", "python", "nodejs", "ruby");

        String result = list.stream().map(x -> x).collect(Collectors.joining(" | "));
        System.out.println(result);   //java | python | nodejs | ruby
    }
}
