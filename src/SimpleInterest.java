import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         System.out.println("enter principle : ");
         int p = s.nextInt();
        System.out.println("enter rate : ");
        int r = s.nextInt();
        System.out.println("enter time : ");
        int t = s.nextInt();
        int Si = (p*r*t)/100;
        System.out.println("Si is "+Si);
    }
}
