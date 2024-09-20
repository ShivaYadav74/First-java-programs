import java.util.Scanner;
public class multiplicationOfTwoNumber {
   static int multiply(int a,int b){
        if(b==0) return 0;
        if(b==1) return a;
        else return multiply(a,b-1)+a;
    }
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the numbers a and b : ");
        int a=s.nextInt(),b=s.nextInt();
        System.out.println("The multiplication of the two numbers is : "+multiply(a,b));
    }
}
