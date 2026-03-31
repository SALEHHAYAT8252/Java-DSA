public class Permutation {
    public static void allPermutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }


        for(int i=0;i<str.length();i++){
            char currentChar=str.charAt(i);
            allPermutation(str.substring(0,i)+str.substring(i+1), ans+currentChar);
        }


    }

    public static void main(String[] args) {
        allPermutation("abc", "");
    }
}
