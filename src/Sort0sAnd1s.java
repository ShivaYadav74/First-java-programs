import java.util.Scanner;
class sort0and1{
    int []sort(int []arr){
        int n=arr.length;
        int zeros=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) zeros++;
        }
        for(int i=0;i<n;i++){
            if(i<zeros)
                arr[i]=0;
            else
                arr[i]=1;
        }
        return arr;
    }

    // USING TWO POINTERS.......

    int []sortarr(int []arr){
        int n =arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
                if(arr[i]==0){
                    i++;
                }
                if(arr[j]==1){
                    j--;
                }
            }
        return arr;
        }
    }
public class Sort0sAnd1s {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=s.nextInt();
        System.out.println("Enter the elements of the array : ");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        sort0and1 obj=new sort0and1();
        arr=obj.sortarr(arr);
        System.out.println("The array after the sorting is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
