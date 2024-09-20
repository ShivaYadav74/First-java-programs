import java.util.Scanner;
class NonDecarr{
    int []sqArr(int []arr){
        int n=arr.length;
        int []ans =new int[n];
        int i=0;
        int j=n-1;
        int k=n-1;
        while(i<=j){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                ans[k]=arr[i]*arr[i];
                k--;
                i++;
            }
            else{
                ans[k]=arr[j]*arr[j]; // Corrected line
                k--;
                j--;
            }
        }
        return ans;
    }
//    int []swap(int []ans){
//        int n=ans.length;
//        int i=0;
//        int j=n-1;
//        while(i<=j){
//            int temp=ans[i];
//            ans[i]=ans[j];
//            ans[j]=temp;
//            i++;
//            j--;
//        }
//        return ans;
//    }

}
public class arrayOfSqinNonDecOdr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n= s.nextInt();
        System.out.println("Enter the elements of the array : ");
        int []arr=new int[n];
        int []ans= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        NonDecarr obj=new NonDecarr();
        ans=obj.sqArr(arr);
//        ans = obj.swap(ans);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
