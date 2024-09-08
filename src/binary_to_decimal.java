import java.util.Scanner;
public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a binary number : ");
        int bn = s.nextInt();
        int ans =0;
        int pw = 1;
        while(bn>0)
        {
            int r = bn%10;
            ans+=(r*pw);
            bn/=10;
            pw*=2;
        }
        System.out.println("the decimal number is : "+ans);
    }
}
