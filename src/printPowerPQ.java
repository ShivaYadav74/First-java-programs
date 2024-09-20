import java.util.Scanner;
public class printPowerPQ {
    static int power(int p,int q){
        int ans;
        if(q==0) return 1;
        else {
            ans=power(p,q-1)*p;
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number p : ");
        int p= s.nextInt();
        System.out.println("Enter the power : ");
        int q=s.nextInt();
        System.out.println(power(p,q));
    }
}
