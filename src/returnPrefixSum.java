import java.util.Scanner;
class returnarr{
    int []prefixSum(int []arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(i==0){
                arr[i]=arr[0];
            }
            else
                arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
}
public class returnPrefixSum {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = s.nextInt();
        System.out.println("Enter the elements of the array : ");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        returnarr obj=new returnarr();
        arr=obj.prefixSum(arr);
        System.out.println("The array of prefix sum is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
