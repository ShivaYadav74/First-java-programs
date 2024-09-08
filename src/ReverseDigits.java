import java.util.Scanner;
public class ReverseDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rev =0;
        System.out.println("enter a number : ");
        int n =s.nextInt();
        while(n>0)
        {
         int r =n%10;
         rev=rev*10+r;
         n=n/10;
        }
        System.out.println("Reverse of the number is "+rev);
    }
}
