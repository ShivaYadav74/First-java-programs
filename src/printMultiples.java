import java.util.Scanner;
public class printMultiples {
    static void multiples(int n,int k){
        if(k==1) {
            System.out.print(n + "\t");
            return;
        }
        else {
            multiples(n,k-1);
            System.out.print(n*k+"\t");

        }
    }
    public static void main(String []args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter any number n ; ");
        int n= s.nextInt();
        System.out.println("Enter the no. of multiples : ");
        int k= s.nextInt();
        multiples(n,k);
    }
}
