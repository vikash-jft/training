import java.util.function.Predicate;

/**
 * Created by vikash on 4/10/17.
 */
public class lamdaExpressionInRunnable {

    public static void main(String[] args) throws InterruptedException {
        /*Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<3;i++){
                    System.out.println("hello World form thread "+Thread.currentThread().getName());
                }
            }
        };*/
        Runnable runnable1=() ->  {
                for (int i=0;i<3;i++){
                    System.out.println("hello World form thread "+Thread.currentThread().getName());
                }
        };

        //Thread thread=new Thread(runnable);
        Thread thread=new Thread(runnable1);
            thread.start();
            thread.join();
    }
}
