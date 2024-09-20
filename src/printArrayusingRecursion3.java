import java.util.Scanner;
public class printArrayusingRecursion3 {
     static void printArray(int []arr,int idx){
        int n = arr.length;
        if(idx==n) return;
        else {
            System.out.print(arr[idx]+" ");
            printArray(arr,idx+1);
        }
    }
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n= s.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Ehter the index number from where you wanna print the array : ");
        int idx=s.nextInt();
        printArray(arr,idx);
    }
}
