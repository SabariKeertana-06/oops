package javaapplication25;
public class RemoveDuplicate {
    public static void main(String[] args) {
       String str = "have a nice day";
       boolean flag;
       char c[]= str.toCharArray();
       StringBuffer sb = new StringBuffer();
       for(int i=0;i<c.length;i++){
           flag = false;
           for(int j=i+1;j<c.length;j++){
               if(c[i]==c[j]){
                   flag=true;
                   break;
               }
           }
           if(!flag){
               sb.append(c[i]);
           }
       }
       System.out.println(sb);
    }
    
}
