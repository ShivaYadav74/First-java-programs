class Unique{
    int Uniquenum(int[] arr){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
                else{
                    index=i;
                }
            }
        }
        return arr[index];
    }
}
public class findUniqueNum {
    public static void main(String[] args) {
        Unique obj=new Unique();
        int[] arr={1,2,3,4,2,1,3};
        int ans=obj.Uniquenum(arr);
        System.out.println("The unique value is ="+ans);
    }
}
