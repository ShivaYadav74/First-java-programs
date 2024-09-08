// 1-2+3-4........n;
import java.util.Scanner;
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int even =0,odd =0;
        System.out.println("enter n : ");
        int n = s.nextInt();
        for(int i =1;i<=n;i++)
        {
            if(i%2==0)
            {
                even+=i;
            }
            else {
                odd+=i;
            }
        }
        int sum = odd -even;
        System.out.println("the sum of the given series is : "+sum);
    }
}
