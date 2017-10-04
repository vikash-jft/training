import java.util.function.Supplier;

/**
 * Created by vikash on 3/10/17.
 */
public class SupplierFunctionInterface
{
    public static void main(String[] args) {
        Supplier<String> s= () ->
        {
          String[]  n={"Vikash","Mukesh","Rakesh","Haresh"};

          int i=(int)(Math.random()*3+1);    // It will always return value between 0 to 3.
            return n[i];
        };
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
