import java.security.cert.PolicyNode;
import java.util.Scanner;
class printnums{
    static void PN(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        PN(n-1);
        System.out.println(n);
    }
}
public class printNaturalNumbers {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        printnums.PN(n);
    }
}
