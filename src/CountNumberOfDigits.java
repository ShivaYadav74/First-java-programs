import java.util.Scanner;
public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int count =0;
        System.out.println("enter a number : ");
        int n =s.nextInt();
        int num =n;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println("Total number of digits in"+num+"= "+count);
    }
}
