import java.util.Scanner;
public class sumofElements{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[] = new int[4];
        System.out.println("enter the elements ");
        for(int i=0;i<arr.length;i++)
        {
              arr[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("the sum is "+sum);
    }
}
