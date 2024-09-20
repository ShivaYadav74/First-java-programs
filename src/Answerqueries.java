import java.util.Scanner;
class sumQueries{
    int []sumofrange(int []arr){
        int n = arr.length ;
//        arr=new int[n+1];
            for(int i=1;i<n;i++) {
                if(i==1)
                    arr[i]=arr[1];
                else
                    arr[i]=arr[i-1] + arr[i];
            }
        return arr;
    }
}
public class Answerqueries {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        sumQueries obj=new sumQueries();
        System.out.println("Enter the size of the array : ");
        int n = s.nextInt();
        System.out.println("Enter the elements of the array : ");
        int []arr=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=s.nextInt();
        }
        arr = obj.sumofrange(arr);
        System.out.println("Enter number of quries : ");
        int q = s.nextInt();
        System.out.println("Enter queries : ");
        while(q>0){
            System.out.println("Enter starting index : ");
            int l=s.nextInt();
           int r=s.nextInt();
            int ans = arr[r]-arr[l-1];
            System.out.println(ans);
            q--;
        }
    }
}
