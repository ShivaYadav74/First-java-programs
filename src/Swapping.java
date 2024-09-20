import java.util.Scanner;
class interchange{
    void swap(int a,int b){
//        USING TEMP VARIABLE
//        int temp=a;
//        a=b;
//        b=temp;

        // USING WITHOUT TEMP VARIABLE

        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("Values after swapping : ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

}
public class Swapping {
    public static void main(String []args){
        int a=9;
        int b=3;
        System.out.println("Values before swapping : ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        interchange obj=new interchange();
        obj.swap(a,b);
    }
}
