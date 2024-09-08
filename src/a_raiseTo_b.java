import java.util.Scanner;
public class a_raiseTo_b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ans =1;
        System.out.println("enter a and b: ");
        int a = s.nextInt(),b=s.nextInt();
        for(int i = 1;i<=b;i++)
        {
            ans *=a;
        }
        System.out.println("the answer is : "+ans);
    }
}
