import java.util.Scanner;
public class reverseOfAString {
    static String printreverse(String s,int idx){
        int n= s.length();
        if(idx==n) return "" ;
       return printreverse(s,idx+1)+s.charAt(idx);

    }
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the String : ");
    String s= sc.nextLine();
    int idx=0;
    String ans= printreverse(s,idx);
    System.out.println(ans);
    }
}
