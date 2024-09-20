import java.util.Scanner;
public class printNaturalNumswithAlterSigns {
    static int evaluateNums(int n){
        if(n==0) return 0;
        else {
            if(n%2==0) return evaluateNums(n-1)-n;
            else return evaluateNums(n-1)+n;
        }
    }
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= s.nextInt();
        System.out.println(evaluateNums(n));
    }
}
