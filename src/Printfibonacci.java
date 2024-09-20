import java.util.Scanner;
public class Printfibonacci {
    static  int fibonacci(int n){
        int fib;
        if(n==0) return 0;
        if(n==1) return 1;
        else fib= fibonacci(n-2)+fibonacci(n-1);
        return fib;
    }
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number n : ");
        int n= s.nextInt();
        System.out.println("The "+n+"th term of the fibonacci series is : "+fibonacci(n));
    }
}
