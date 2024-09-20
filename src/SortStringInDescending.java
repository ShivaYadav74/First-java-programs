import java.util.ArrayList;
import java.util.Collections;
public class SortStringInDescending {
    public static void main(String[]args){
        ArrayList<String> l1= new ArrayList<>();
        l1.add("Welcome");
        l1.add("to");
        l1.add("Abu");
        l1.add("Dhabi");
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);
    }
}
