import java.util.Arrays;
class findseclar{
    int seclarge(int[]arr){
        Arrays.sort(arr);
        int max=0;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                index=i;
                break;
            }
        }
        return arr[index-1];
    }
}
public class second_LargestNum {
    public static void main(String[]args){
        findseclar obj=new findseclar();
        int []arr={9,8,9,6,9,5,8};
        int ans=obj.seclarge(arr);
        System.out.println("The second largest number is ="+ans);

    }
}
