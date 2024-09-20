import java.util.ArrayList;
import java.util.Scanner;
public class returnListOfIndices {
    static ArrayList<Integer> findindeces(int []arr,int idx,int x){
        int n= arr.length;
        ArrayList<Integer> ans= new ArrayList<>();
        if(idx==n) return ans;
        if(arr[idx]==x) ans.add(idx);
        ArrayList<Integer> smallans= findindeces(arr,idx+1,x);
        ans.addAll(smallans);
        return ans;
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
        ArrayList<Integer> ans= findindeces(arr,idx,x);
        for(Integer i: ans){
            System.out.print(i+" ");
        }
    }
}
