

import java.util.Scanner;
class occurance{
    int occurances(int[]arr,int x){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                index=i;
            }
        }
        return index;
    }
}

public class last_occurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[6];
        System.out.println("enter x");
        int x=sc.nextInt();
        System.out.println("the the elements of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        occurance obj=new occurance();
        System.out.println("the  of last index of the element is "+obj.occurances(arr,x));

    }


}

