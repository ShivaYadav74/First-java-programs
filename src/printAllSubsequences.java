import java.util.Scanner;
public class printAllSubsequences {
    static void printssq(String s,String currAns){
        int n= s.length();
        if(n==0){
            System.out.println(currAns);
            return;
        }
        char curr=s.charAt(0);
        printssq(s.substring(1),currAns+curr);
        printssq(s.substring(1),currAns);
    }
    public static void main(String[]args){
        String currAns=" ";
        printssq("abc"," ");
    }
}