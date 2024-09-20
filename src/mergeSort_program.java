public class mergeSort_program {
    static void print_arr(int []arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
    static void mergeSort(int[] arr, int s, int l) {
        if(s>=l) return;
        int mid = (s + l) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, l);
        merge(arr, s, mid, l);
    }

    static void merge(int[] arr, int s, int mid, int l) {

        int n1= mid-s+1;
        int n2=l-mid;
        int []lrr=new int[n1];
        int []rrr=new int[n2];
        for(int i=0;i<n1;i++){
            lrr[i]=arr[s+i];
        }
        for(int j=0;j<n2;j++){
            rrr[j]=arr[mid+1+j];
        }
        int i = 0;
        int j = 0;
        int k = s;
        while(i<n1 && j<n2){
            if(lrr[i]<=rrr[j]){
                arr[k]=lrr[i];
                k++;
                i++;
            }
            else{
                arr[k]=rrr[j];
                k++;
                j++;
            }
        }
        while (i <n1) {
            arr[k] = lrr[i];
            k++;
            i++;
        }
        while (j <n2) {
            arr[k] = rrr[j];
            k++;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 20, 4, 11, 8, 2};
        int n = arr.length;
        int s = 0;
        int l = n - 1;
        mergeSort(arr,s,l);
        System.out.println("Array after sorting : ");
       print_arr(arr);
    }
}
