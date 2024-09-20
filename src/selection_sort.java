public class selection_sort {
    static void ss(int []arr){
        int n= arr.length;

        for(int i=0;i<n-1;i++){
//            int min=arr[i];
            int idx=i;
            for(int j=i+1;j<n;j++){
                if (arr[j] < arr[idx]) {
//                    min= arr[j];
                    idx=j;
                }
//                if(arr[j]==min){
//                    min=arr[j];
//                    idx=j;
//                }
            }
            int temp=arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[]args){
        int []arr={8,5,3,4,9,1};
        ss(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
