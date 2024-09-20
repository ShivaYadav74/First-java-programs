import java.util.Scanner;
public class CopyArray {
    void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CopyArray obj = new CopyArray();
        int n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int[] arr=new int[n],arr2=new int[10];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        // trying to copy
//         arr2=arr;

        // by cloning array
        arr2=arr.clone();
        System.out.println("Original array : ");
        obj.printarray(arr);

        System.out.println("Copied array: ");
        obj.printarray(arr2);

        arr2[0]=0;
        arr2[1]=0;

        System.out.println("orginal array after changing the value: ");
        obj.printarray(arr);

        System.out.println("copied array after the changing the values:");
        obj.printarray(arr2);
    }
}
