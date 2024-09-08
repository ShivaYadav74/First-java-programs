import java.util.Scanner;
public class divisibleby3_or_even {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = s.nextInt();
        if(n%2==0 && n%3==0){
            System.out.println("value : "+n);
        }
        else{
            System.out.println("invalid");
        }
    }
}
