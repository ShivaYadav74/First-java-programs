class firstvalue{
    int returnFV(int[]a){
        int ans=-1;
       // outerLoop://label
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
//                    ans =a[i];
                   // break outerLoop;//terminate using label
                    return a[i];
                }
            }
        }
        return ans;
    }
}
public class return1Value {
    public static void main(String[]args){
        firstvalue obj=new firstvalue();
        int []a={1,5,3,4,6,3,4};
        System.out.println(obj.returnFV(a));

    }
}
