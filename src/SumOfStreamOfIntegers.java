import java.util.Scanner;
public class SumOfStreamOfIntegers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int sum=0;
        while(n!=0)
        {
            sum = sum+n;
            n =s.nextInt();
        }
        System.out.println("the sum is = "+sum);
    }
}
