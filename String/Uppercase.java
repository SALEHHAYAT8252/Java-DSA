public class Uppercase {
    public static String eachWordtoUpperCase(String str){
        StringBuilder newSb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        newSb.append(Character.toUpperCase(str.charAt(0)));
       for(int i=1;i<str.length();i++){
        if(str.charAt(i)==' '&&i<str.length()-1){
            newSb.append(str.charAt(i));
            i++;
            newSb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            newSb.append(str.charAt(i));
        }
       }
       return newSb.toString();
    }

    public static void main(String[] args) {
        String str = new String("i am saleh hayat  ");
        System.out.println(eachWordtoUpperCase(str));
    }
}
