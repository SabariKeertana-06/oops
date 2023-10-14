package javaapplication25;
public class Substring {
    public static void main(String[] args) {
        String str = "This sentance contains find me string";
        System.out.println(str);
        String find = "find me";
        int i = str.indexOf(find);
        if(i>0){
            System.out.println(str.substring(i, i+find.length()));
        }
        else{ 
            System.out.println("string not found");
        }
}

}
