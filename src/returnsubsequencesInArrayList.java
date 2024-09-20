import java.lang.reflect.Array;
import java.util.ArrayList;

public class returnsubsequencesInArrayList {

    static ArrayList<String> ssq(String s){
        int n= s.length();
        ArrayList<String> ans= new ArrayList<>();
        if(n==0){
            ans.add(" ");
            return ans;
        }
        char curr= s.charAt(0);
        ArrayList<String> smallans= ssq(s.substring(1));

        for(String ss: smallans){
            ans.add(ss);
            ans.add(curr+ss);
        } 
         return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> ans=ssq("abc");
        for(String ss: ans){
            System.out.println(ss);
        }
    }
}
