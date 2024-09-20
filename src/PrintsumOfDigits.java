import java.util.Scanner;
public class PrintsumOfDigits {
    static int sumOfdigits(int n){
        int sum=0;
        if(n%10==0) {
            return 0 ;
        }
        else{
            sum= sumOfdigits(n/10)+ n%10;
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter any number n : ");
        int n=s.nextInt();
        System.out.println(sumOfdigits(n));
    }
}
