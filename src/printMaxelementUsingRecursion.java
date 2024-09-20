import java.util.Scanner;
public class printMaxelementUsingRecursion {
    static int maxElement(int []arr,int idx){
        int n = arr.length;
        if(idx==n-1) return arr[idx];
        return Math.max(arr[idx],maxElement(arr,idx+1));
    }
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n= s.nextInt();
        int idx=0;
        int []arr= new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(maxElement(arr,idx));
    }
}
