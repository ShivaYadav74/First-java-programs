import java.util.Scanner;
public class ArmstrongNumberUsingRecursion {
   static int order(int n){
        int x=0;
        while(n>0){
            x++;
            n=n/10;
        }
        return x;
    }

//    static int power(int a,int b){
//        int ans;
//        if(b==0) return 1;
//        else {
//            int hf= power(a,b/2);
//            if(b%2==0){
//                ans= hf*hf;
//            }
//            else{
//                 ans = a*hf*hf;
//            }
//            return ans;
//        }
//
//    }

    static int Armstrong(int n,int order){
        if(n>=0 && n<=9) return (int)Math.pow(n,order);
        else
            return Armstrong(n/10,order)+(int)Math.pow(n%10,order);
    }

    static boolean isarmstrong(int n){
       int order=order(n);
       int sum= Armstrong(n,order);
       return (sum==n);
    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number n : ");
        int n= s.nextInt();
        System.out.println(isarmstrong(n));
    }
}
