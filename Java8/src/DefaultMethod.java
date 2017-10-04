/**
 * Created by vikash on 3/10/17.
 */


interface left{
    default void print(){
        System.out.println("Left Method");
    }
}

interface  right{
    default void print(){
        System.out.println("Right Method");
    }
}



public class DefaultMethod implements left,right {
    @Override
    public void print() {
        //System.out.println("Hello");
        left.super.print();
        right.super.print();
    }
    public static void main(String[] args) {
        DefaultMethod method=new DefaultMethod();
        method.print();
    }
}
