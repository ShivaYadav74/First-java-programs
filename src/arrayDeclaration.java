class array{
    void demoarray(){
        int arr[]={1,2,3,4};
        System.out.println(arr[0]);
        System.out.println(arr[2]);
        System.out.println(arr[1]);
        System.out.println(arr.length);


    }
}
public class arrayDeclaration {
    public static void main(String[] args) {
       array obj=new array();
       obj.demoarray();
    }
}
