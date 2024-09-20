public class Insertion_sort {
    static void Ins(int []arr){
        int n= arr.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public static void main(String[]args){
        int []arr={8,3,6,5,4,2};
        Ins(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
