package javaapplication25;
public class Capitalize {
    public static void main(String[] args) {
        String str = "have a nice day";
        String s[]=str.split(" ");
        String temp ="";
        for(String news:s){
            String c = news.charAt(0)+"";
            temp += c.toUpperCase()+news.substring(1)+" ";
        }
        System.out.println(temp);
    }    
}
