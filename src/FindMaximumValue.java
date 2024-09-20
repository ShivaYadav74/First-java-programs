import java.util.Scanner;
public class FindMaximumValue {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[5];
        int max=0;
        System.out.println("enter the elements of array ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= s.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
