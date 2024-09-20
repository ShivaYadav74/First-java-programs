public class optimized_Bubble_sort {
    static void optimized_BS(int []arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag= false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag= true;
                }
            }
            if(flag==false){
                return;
            }
        }
    }
    public static void main(String []args){
        int []arr={2,1,3,4,5};
        optimized_BS(arr);
        for(int x:arr){
            System.out.print(x+"\t");
        }
    }
}
