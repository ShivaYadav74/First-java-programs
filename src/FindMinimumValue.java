import java.util.Scanner;
public class FindMinimumValue {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int[]arr = new int[4];
        int i,pos=0;
        System.out.println("enter the elements of array ");
        for( i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        int min = arr[0];
        for( i =0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
                pos=i;
            }
        }
        System.out.println("The minimum value in the array is "+min);
        System.out.println("the position of  the smallest of is "+pos);
    }
}
