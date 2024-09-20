public class keypadcombinations {
    static void combinations(String digits,String[]kp,String res){  //23
        if(digits.length()==0){
            System.out.print(res+" ");
            return;
        }
        int currNum=digits.charAt(0)-'0';   //2
        String currChoice=kp[currNum];  //abc
        for(int i=0;i<currChoice.length();i++){
            combinations(digits.substring(1),kp,res+currChoice.charAt(i));
        }
    }
    public static void main(String[] args) {
        String digit="23";
        String []kp={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combinations(digit,kp," ");
    }
}
