package javaapplication25;
public class LongestWord {
    public static void main(String[] args) {
        String str = "java is a high level programming language";
        int len =0,maxcount =0;
        String longstr="";
        String str1[]=str.split("");
        maxcount=str1[0].length();
        for(String s:str1 ){
            len = s.length();
            if(maxcount <len){
                maxcount = len;
                longstr =s;
            }
        }
        System.out.println(longstr+"....."+maxcount);
    }
    
}
