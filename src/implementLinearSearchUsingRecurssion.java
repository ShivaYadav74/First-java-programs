import java.util.Scanner;
public class implementLinearSearchUsingRecurssion {
    static boolean findnum(int[]arr,int idx,int x){
        int n=arr.length;
        if(idx==n) return false;
        if(arr[idx]==x) {
            return true;
        }

        return findnum(arr,idx+1,x);

    }

    //RETURN INDEX....

    static int findidx(int[]arr,int idx,int x){
        int n=arr.length;
        if(idx==n) return -1;
        if(arr[idx]==x) {
            return idx;
        }

        return findidx(arr,idx+1,x);

    }
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n= s.nextInt();
        int idx=0;
        int[]arr=new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the number to be searched : ");
        int x= s.nextInt();
        System.out.println(findnum(arr,idx,x));
        System.out.println(findidx(arr,idx,x));
    }
}
