import java.sql.SQLOutput;
import java.util.Scanner;
class printDes{
    static void printNatNums(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        else{
            System.out.println(n);
            printNatNums(n-1);
        }
    }
}
public class printNaturalNumbersinDescendingOrder {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number n : ");
        int n= s.nextInt();
        printDes.printNatNums(n);
    }
}
