import java.util.Scanner;
class sortingarr{
    boolean check = true;
    boolean issorted(int[]arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]) {
                check = false;
            }


        }
        return check;
    }
    }
public class checkArray {
    public static void main(String[] args) {
        sortingarr obj=new sortingarr();
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[5];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(obj.issorted(arr));

    }
}
