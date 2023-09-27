package pack2;
public class StringOperations {
    String str1,str2,str;
    public StringOperations(String str1, String str2,String str) {
        this.str1 = str1;
        this.str2 = str2;
        this.str=str;
    }
   public void concatenate(String str1, String str2){
       System.out.println(str1+str2);
   }
   public void reverse(String str){
       char ch[]=str.toCharArray();
       String rev="";
       for(int i= ch.length-1;i>=0;i--){
           rev+=ch[i];
   }
        System.out.println(rev);
   }
}
