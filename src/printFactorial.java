import java.util.Scanner;
class findfactorial{
    static int factorial(int n){
        int fact;
        if(n==1) return 1;
        else {
            fact= factorial(n-1)*n;
        }
        return fact;
    }
}
public class printFactorial {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= s.nextInt();
        System.out.println("The factorial of the number is : "+findfactorial.factorial(n));
    }
}
