import java.util.Scanner;
public class removeOccurances {
    static String removeoccurances(String s,int idx){
        int n= s.length();
        if(idx==n) return "";
        if(s.charAt(idx)!='a')
            return s.charAt(idx)+removeoccurances(s,idx+1);
        else
            return removeoccurances(s,idx+1);
    }

    // USING SUBSTRING METHOD.....
    static String ro2(String s){
        int n= s.length();
        if(n==0) return "";
        if(s.charAt(0)!='a')
            return s.charAt(0)+ro2(s.substring(1));
        else
            return ro2(s.substring(1));
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s= sc.nextLine();
        int n= s.length();
        int idx=0;
        String finalans= removeoccurances(s,idx);
        String finalans2= ro2(s);

            System.out.println(finalans);
        System.out.println(finalans2);

    }
}
