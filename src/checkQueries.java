import java.util.Scanner;
class makingfreqArr{
    int []freqArr(int[]arr){
        int[]freq=new int [100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
}
public class checkQueries {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        makingfreqArr obj=new makingfreqArr();
        System.out.println("Enter the size of the arrray : ");
        int n=s.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int []freq= obj.freqArr(arr);
        System.out.println("Enter the number of queries : ");
        int q=s.nextInt();
        System.out.println("Enter quries : ");
        while(q>0){
            int x=s.nextInt();

            if(freq[x]>0){
                System.out.println(x +" = YES");
            }
            else {
                System.out.println(x +" = NO");

            }
            q--;
        }
    }
}
