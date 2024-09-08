import java.util.Scanner;
public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a decimal number : ");
        int dn=s.nextInt();
        int bn=0;
        int pw=1;
        while(dn>0)
        {
            int r =dn%2;
            bn=(bn*10)+r;
            dn/=2;
        }
        System.out.println("The binary number is : "+bn);
    }
}