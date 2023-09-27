package pack3;
public class Calculator {
    int a,b;
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void multiply(int a,int b){
        System.out.println( a*b);
    }
    public void divide(int a,int b){
        if(b==0){
            try{
                int c = a/b;
            }
            catch(ArithmeticException e){
                System.out.println("Denominator is 0");
            }
        }
        else
            System.out.println(a/b);
    } 
}         

