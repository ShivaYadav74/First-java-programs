import java.util.Scanner;
public class SumOfElementsOfTheArray {
    static int sumofelements(int []arr,int idx){
        int n= arr.length;
        if(idx==n) return 0; // ANOTHER BASE CASE: if(idx==n-1) return arr[idx];
        else return sumofelements(arr,idx+1)+arr[idx];
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n= s.nextInt();
        int idx=0;
        System.out.println("Enter the elements of the array : ");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("The sum of the elements of the array is : "+sumofelements(arr,idx));
    }
}
