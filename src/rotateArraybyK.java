import java.util.Scanner;

class rotatea{
    int []rotate(int[]a,int k){
        int n=a.length;
        k=k%n;
        int []arr=new int[n];
        for(int i=0;i<k;i++){
            arr[i]=a[n-k+i];
        }
        for(int i=0;i<n-k;i++){
            arr[k+i]=a[i];
        }
        return arr;
    }
}
public class rotateArraybyK {
    public static void main(String[]args){

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = s.nextInt();
        System.out.println("Enter the number of rotations : ");
        int k = s.nextInt();
        System.out.println("Enter the elements of the array : ");
        int []a=new int[n];
        for(int i =0;i<n;i++){
            a[i]=s.nextInt();
        }
        int []arr=new int[n];
        rotatea obj=new rotatea();
        arr=obj.rotate(a,k);
        System.out.println("The array after rotation is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
