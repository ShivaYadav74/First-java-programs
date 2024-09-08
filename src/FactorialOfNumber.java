import java.util.Scanner;
public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int fact =1;
        System.out.println("enter number : ");
        int n = s.nextInt();
        for(int i =1;i<=n;i++)
        {
            fact*=i;
            System.out.println("The factorial of "+i+"= "+fact);
        }
    }
}
