class SolutionCompression {
    public static  int compress(char[] chars) {
          StringBuilder sb = new StringBuilder("");
       for(int i=0;i<chars.length;i++){
            sb.append(chars[i]);
            int j=i+1;
            int count=1;
            while(j<chars.length&&chars[i]==chars[j]){
                count++;
                i++;
                j++;
            }

            if(count>1){
                sb.append(count);
            }
       }
       System.out.println(sb);
       char[] array = new char[sb.length()];
      for(int i =0;i<sb.length();i++){
        array[i]=sb.charAt(i);
      }
      return array.length;
    }
    public static void main(String[] args) {
        char[] chars ={'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
}