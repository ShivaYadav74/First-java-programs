import java.sql.SQLOutput;
import java.util.Scanner;
class arrangenums{
    int []EvenOdd(int []arr){
        int n = arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]%2!=0 && arr[j]%2==0){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[i]%2==0)
                i++;
            if(arr[j]%2!=0)
                j--;
        }
        return arr;
    }
}
public class moveEvenAndOdd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n= s.nextInt();
        System.out.println("Enter the elements of the array : ");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        arrangenums obj= new arrangenums();
        arr= obj.EvenOdd(arr);
        System.out.println("The resultant array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
