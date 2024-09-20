

import java.util.Scanner;
class occurances{
    int occurances(int[]arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
}

public class occurancesOfElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[6];
        System.out.println("enter x");
        int x=sc.nextInt();
        System.out.println("the the elements of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        occurances obj=new occurances();
        System.out.println("the count of the element is "+obj.occurances(arr,x));

    }


}
