import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter 1st number : ");
        int p = s.nextInt();
        System.out.println("enter 2nd number : ");
        int q = s.nextInt();
        int sum = p+q;
        System.out.println("the sum is "+sum);
    }
}
