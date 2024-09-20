import java.util.Scanner;
class reversearr{
    int []reverse(int []arr){
        int n=arr.length;
        int i;
        for( i=0;i<n;i++){
            if(i>=(n-(i+1))){
                break;
            }

            int temp= arr[i];
            arr[i]=arr[n-(i+1)];
            arr[n-(i+1)]=temp;

        }
        return arr;
    }
}
public class reversearray {
    public static void main(String []args){
        Scanner s= new Scanner(System.in);
        reversearr obj= new reversearr();
        System.out.println("enter the size of array : ");
        int n= s.nextInt();
        int []arr= new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        arr=obj.reverse(arr);
        System.out.println("The reverse of the array is : ");
        for(int i=0;i<n;i++) {
            System.out.print( arr[i]+" ");
        }
    }
}
