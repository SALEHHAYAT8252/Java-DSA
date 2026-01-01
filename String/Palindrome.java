public class Palindrome{
    public static boolean isPalindrom(String str){
        int s=0;
        int end =str.length()-1;
            while(s<end){
                if(str.charAt(s)!=str.charAt(end)){
                    return false;
                }
                s++;
                end--;
            }
            return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom("racecar"));
    }
}