import java.util.ArrayList;
import java.util.Collections;
public class ReverseArraylist {
    static void reverse(ArrayList<Integer> List){
        int i=0;
        int j=List.size()-1;
        while(i<j){
            Integer temp=Integer.valueOf(List.get(i));
            List.set(i,List.get(j));
            List.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[]args){
        ArrayList<Integer> List= new ArrayList<>();
        List.add(0);
        List.add(10);
        List.add(3);
        List.add(5);
        List.add(22);
        List.add(10);
//        reverse(List);
        Collections.reverse(List); //Using collection library
        System.out.print("Reverse ArrayList "+ List);
    }

}
