import java.util.Scanner;
public class findIndicesOfX {
    static void printidx(int []arr,int idx,int x){
        int n= arr.length;
        if(idx==n) return;
        if(arr[idx]==x) System.out.print(idx+" ");
        printidx(arr,idx+1,x);
    }
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n= s.nextInt();
        int idx=0;
        int []arr=new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the number which is to be found : ");
        int x= s.nextInt();
        printidx(arr,idx,x);

    }
}
