public class Compression {
    public static String stringCompress(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            int j = i + 1;
            sb.append(str.charAt(i));
            int count = 1;
            while (j<str.length()&&str.charAt(i) == str.charAt(j)) {
                count++;
                i++;
                j++;
            }
            if(count>1){
                sb.append(count);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringCompress("aaabbcccddefg"));
    }
}