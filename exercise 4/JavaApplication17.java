package javaapplication17;
import java.util.*;
abstract class shape{
    int numSides;
    shape(int numSides){
        this.numSides = numSides;
    }
    int getside(){
        return numSides;
    }
    abstract void getPerimeter();
    abstract void getArea();
}
class rectangle extends shape{
    int width;
    int height;
    rectangle(int w,int h){
        super(4);
        width=w;
        height=h;
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
class triangle extends shape{
    int width;
    int height;
    triangle(int w,int h){
        super(3);
        width=w;
        height=h;
    }
     public void getPerimeter(){
        double p=(width+height);
        System.out.println("Perimeter:"+p);
    }
    public void getArea(){
        double a = 0.5*width*height;
        System.out.println("Area:"+a);
}
}
public class JavaApplication17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the width and height:");
        int w = s.nextInt();
        int h = s.nextInt();
        rectangle r = new rectangle(w,h);
        triangle t= new triangle(w,h);
        System.out.println("Rectangle:");
        System.out.println("Number of sides:"+r.getside());
        r.getPerimeter();
        r.getArea();
        System.out.println("Triangle:");
        System.out.println("Number of sides:"+t.getside());
        t.getPerimeter();
        t.getArea();
}
}
