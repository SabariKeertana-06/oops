package javaapplication18;
interface Resizable{
    void resize(int x);
}
class rectangle implements Resizable{
        int width;
        int height;
        rectangle(int w,int h){
            width=w;
            height=h;
    }
    public void resize(int x){
        width = width*x;
        height = height*x;
    }
    public void getPerimeter(){
        double p= 2*(width+height);
        System.out.println("Perimeter:"+p);
    }
    public void getArea(){
        double a = width*height;
        System.out.println("Area:"+a);
    }
}
class circle implements Resizable{
    int radius;
    circle(int r){
        radius = r;
    }
    public void getPerimeter(){
        double p = 2*3.14*radius;
        System.out.println("Perimeter:"+p);
    }
    public void getArea(){
        double a = 3.14*radius*radius;
        System.out.println("Area:"+a);
    }
    public void resize(int x){
        radius = radius *x;
    }
}
public class JavaApplication18 {
    public static void main(String[] args) {
      rectangle r = new rectangle(5,10);
      System.out.println("Rectangle:");
      System.out.println("Before Resizing:");
      r.getPerimeter();
      r.getArea();
      System.out.println("After Resizing:");
      r.resize(5);
      r.getPerimeter();
      r.getArea();
      circle c = new circle(10);
      System.out.println("Circle:");
      System.out.println("Before Resizing:");
      c.getPerimeter();
      c.getArea();
      System.out.println("After Resizing:");
      c.resize(5);
      c.getPerimeter();
      c.getArea();
    }
    
}
