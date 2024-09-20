import java.util.Scanner;
public class checkpalindromeusignTwoPointer {
    static boolean checkpalindrome(String s,int i,int j){
        if(i>=j) return true;
        return (s.charAt(i)==s.charAt(j) && checkpalindrome(s,i+1,j-1));
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s= sc.nextLine();
        int i=0;
        int j=s.length()-1;
        System.out.println(checkpalindrome(s,i,j));
    }
}
