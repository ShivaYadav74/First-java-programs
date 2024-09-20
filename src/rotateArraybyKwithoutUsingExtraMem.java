import java.util.Scanner;
class rotateArray{
    int []rotate(int []arr,int k){
        int n=arr.length;
        k=k%n;
        for(int i=0;i<k;i++){
            int i1=(n-k)+i;
            int i2=n-(i+1);
            if(i1>=i2){
                break;
            }
            int temp=arr[i1];
            arr[i1]=arr[i2];
            arr[i2]=temp;
        }
        for(int i=0;i<n-k;i++){
            if(i>=k-(i+1)){
                break;
            }
            int temp=arr[i];
            arr[i]=arr[k-(i+1)];
            arr[k-(i+1)]=temp;
        }
        for(int i=0;i<n;i++){
            if(i>=n-(i+1)){
                break;
            }
            int temp=arr[i];
            arr[i]=arr[n-(i+1)];
            arr[n-(i+1)]=temp;
        }
        return arr;
    }
}
public class rotateArraybyKwithoutUsingExtraMem {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = s.nextInt();
        System.out.println("Enter the number of rotations : ");
        int k = s.nextInt();
        System.out.println("Enter the elements of the array : ");
        int []arr=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=s.nextInt();
        }
        rotateArray obj=new rotateArray();
        arr=obj.rotate(arr,k);
        for(int i=0;i<n;i++) {
            System.out.print( arr[i]+" ");
        }
    }
}
