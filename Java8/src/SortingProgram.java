import java.util.*;

/**
 * Created by vikash on 3/10/17.
 */


// We will see here about that Lambda Expressions of main difference between java7 and java8 behalf of that sorting program.
public class SortingProgram {
    public static void main(String[] args) {
        List<String> male=new ArrayList<String>();
            male.add("Ram");
            male.add("Shyam");
            male.add("Mohan");
            male.add("Sohan");
            male.add("Rohan");
            male.add("Kunal");

        List<String> femail =new ArrayList<String >();
            femail.add("Sita");
            femail.add("Gita");
            femail.add("Sangita");
            femail.add("Radha");
            femail.add("Meena");
            femail.add("Reena");

        SortingProgram sm=new SortingProgram();

        System.out.println("Sorting Using Java7");
            sm.sortUnsingJava7(male);
        System.out.println(male);

        System.out.println("Sorting Using Java8");
            sm.sortUsingJava8(femail);
        System.out.println(femail);


    }
    // Sort using Java7
    private void sortUnsingJava7(List<String> gender){
        Collections.sort(gender, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

   // Sort using java8
   private void sortUsingJava8(List<String> gender){
      Collections.sort(gender, (a,b) -> a.compareTo(b));
   }
}
