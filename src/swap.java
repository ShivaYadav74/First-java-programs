import java.util.Scanner;
class interchange_Largest_and_smallest_number{
    void swapping(){
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        int i,max=0,min=arr[0],sPos=0,lPos=0;
        System.out.println("Enter elements of array : ");
        for(i=0;i<arr.length;i++){
            arr[i]= s.nextInt();
        }
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                lPos=i;
                if(arr[i]<min)
                {
                    min=arr[i];
                    sPos = i;
                }
            }
        }
         int temp = arr[lPos];
        arr[lPos] = arr[sPos];
        arr[sPos] = temp;
        System.out.println("The new array is : ");
        for(i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
        }
    }
}
public class swap {
    public static void main(String[] args) {
        interchange_Largest_and_smallest_number obj = new interchange_Largest_and_smallest_number();
        obj.swapping();
    }
}
