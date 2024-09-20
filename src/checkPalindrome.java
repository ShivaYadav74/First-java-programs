import java.util.Scanner;
public class checkPalindrome {
    static String reverse(String s,int idx){
        int n= s.length();
        if(idx==n) return "";
        return reverse(s,idx+1)+s.charAt(idx);
    }

     static boolean ispalindrome(String s){
        int idx=0;
        String reversestring=reverse(s,idx);
        return reversestring.equals(s);
    }
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the string : ");
    String s=sc.nextLine();
    int idx=0;
    boolean ans= ispalindrome(s);
    System.out.println(ans);
    }
}
