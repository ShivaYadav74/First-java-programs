import java.util.Scanner;
class checksubarrays{
//    boolean value(int []arr){
//        boolean check = false;
//        int n = arr.length;
//        int s=0;
//        int j=n-1;
//        for(int i=0;i<n;i++){
//            if(i==0){
//                arr[i]=arr[0];
//            }
//            else
//                arr[i]=arr[i-1]+arr[i];
//        }
//        while(s!=j){
//            int ans = arr[j]-arr[s];
//            if(arr[s]==ans){
//                check = true;
//            }
//            s++;
//        }
//        return check;
//    }
    static int totalsum(int []arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static boolean value(int []arr){
        int totalsum = totalsum(arr);
        int prefsum=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            prefsum+=arr[i];
            int suffixsum=totalsum-prefsum;
            if(prefsum==suffixsum)
                return true;
        }
        return false;
    }
}
public class checkTwoSubarrays {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = s.nextInt();
        System.out.println("Enter the elements of the array : ");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
//        checksubarrays obj=new checksubarrays();
        boolean res= checksubarrays.value(arr);
        System.out.println(res);
    }
}
