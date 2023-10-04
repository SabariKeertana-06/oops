package javaapplication23;
import java.util.*;
class Apartment{
    String add,apno;
    int bno,rent;

    public Apartment(String add, String apno, int bno, int rent){
        this.add = add;
        this.apno = apno;
        this.bno = bno;
        this.rent = rent;
        try{
            if(apno.length()!=3){
              throw new ApartmentNoException("Apartment no Erro");
            }
            if(bno<1||bno>4){
              throw new BedRoomNoException("Bed room error");
            }
            if(rent<500||rent>2500){
                throw new RentException("Rent error");
            }
        }
    catch(ApartmentNoException e){
        System.out.println(e);
    }
    catch(BedRoomNoException e){
        System.out.println(e);
    }
    catch(RentException e){
        System.out.println(e);
    }
}
}
class ApartmentNoException extends Exception{
    ApartmentNoException(String msg){
        super(msg);
    }
}
class BedRoomNoException extends Exception{
    BedRoomNoException(String msg){
        super(msg);
    }
}
class RentException extends Exception{
    RentException(String msg){
        super(msg);
    }
}
public class JavaApplication23 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String add,apno;
        int bno,rent;
        System.out.println("Enter Street Address:");
        add = Sc.next();
        System.out.println("Enter Apartment no:");
        apno = Sc.next();
        System.out.println("Enter no of bedrooms:");
        bno = Sc.nextInt();
        System.out.println("Enter Apartment Rent:");
        rent = Sc.nextInt();
        Apartment ap = new Apartment(add,apno,bno,rent);
    }
}
