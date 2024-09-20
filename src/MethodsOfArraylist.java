import java.util.ArrayList;
public class MethodsOfArraylist {
    public static void main(String[] args) {
        ArrayList <Integer>l1=new ArrayList<>();

        //METHODS OF ARRAY LIST....

        //Add element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(6);

        // get element at index i
        System.out.println(l1.get(0));
        System.out.println(l1.get(2));

        //Print array list with loop
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+"  \n");
        }

        //Print arraylist directly/without using loop

        System.out.println(l1);

        //adding element at some index i
        l1.add(1,100);
        System.out.println(l1);//[5,100,6,7,8]

        //Modifying element at index i
        l1.set(1,69);
        System.out.println(l1);//[5,69,6,7,8]

        //Remove an element at index i
        l1.remove(1);
        System.out.println(l1);

        // Remove an element e
        l1.remove(Integer.valueOf(6));
        System.out.println(l1);

        //checking if an element exists
        boolean ans= l1.contains(Integer.valueOf(9));
        System.out.println(ans);

        //If you don't specify class, you can put anything inside
        ArrayList c= new ArrayList();
        c.add("p");
        c.add(5.5f);
        c.add(true);
        c.add(6);
        System.out.println(c);
    }
}
