import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum =0;
        System.out.println("enter a number : ");
        int n = s.nextInt();
        while(n>0)
        {
            int r =n%10;
            sum +=r;
            n=n/10;
        }
        System.out.println("The sum of the digits : "+sum);
    }
}
