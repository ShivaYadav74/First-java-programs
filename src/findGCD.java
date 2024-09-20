import java.util.Scanner;
public class findGCD {
//    static int GCD(int x,int y){
//        while(x%y!=0){
//            int rem= x%y;
//            x=y;
//            y= rem;
//        }
//        return y;
//    }

    //USING RECURSION......

    static int GCD(int x,int y){
        if(x%y==0) return y;
        else
            return GCD(y,x%y);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the num x and y : ");
        int x=s.nextInt(),y=s.nextInt();
        System.out.println(GCD(x,y));
    }
}
