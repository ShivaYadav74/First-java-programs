import java.util.Scanner;
public class ReadCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a string : ");
        char ch =s.next().charAt(1);
        System.out.println("hte character is : "+ch);
    }
}
