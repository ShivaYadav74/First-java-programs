import java.util.Scanner;
public class age_group_condition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter age : ");
        int age = s.nextInt();
        if(age<=12){
            System.out.println("child");
        }
        else if(age>12 && age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("adult");
        }
    }
}
