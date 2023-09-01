/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;
import java.util.*;
class consumer
{
    int cno;
    String cname;
    double pmr;
    double cmr;
    double uc = cmr-pmr;
   consumer(int no,String n,double pmr1,double cmr1,double uc1)
   {
       cno = no;
       cname = n;
       pmr1 = pmr;
       cmr1 = cmr;
       uc1 = uc;
    }
   
}
public class JavaApplication13 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner (System.in);
        System.out.println("Enter the no of consumers:");
        int n = s1.nextInt();
        consumer obj[] = new consumer[n];
        int cno;
        String cname;
        double pmr;
        double cmr;
        double bill = 0;
        double uc = 0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the details:");
            System.out.println("No:");
            cno = s1.nextInt();
            System.out.println("Name:");
            cname = s1.next();
            System.out.println("prev month reading:");
            pmr = s1.nextDouble();
            System.out.println("current month reading:");
            cmr = s1.nextDouble();
            uc = cmr-pmr;
            obj[i]= new consumer(cno,cname,pmr,cmr,uc);
        System.out.println("Enter D for Domestic and C for commercial:");
        String c=s1.next();
        switch(c)
        {
            case "D":
                if(uc<=100)
                {
                    bill = uc*1;
                }
                if(uc>100 && uc<=200)
                {
                   bill = 100*1+(uc)*2.5;        
                }
                if(uc>200 && uc<=500)
                {
                    bill = 100*1+100*2.5+(uc)*4;
                }
                else
                {
                    bill = 100*1+100*2.5+300*4+(uc)*6;
                }
            case "C":
                if(uc<=100)
                {
                    bill = uc*2;
                }
                if(uc>100 && uc<=200)
                {
                   bill = 100*2+(uc)*4.5;        
                }
                if(uc>200 && uc<=500)
                {
                    bill = 100*2+100*4.5+(uc)*6;
                }
                else
                {
                    bill = 100*2+100*4.5+300*6+(uc)*7;
                }
            }
        System.out.println("Total bill:"+bill);    
    }
    }
    }
    

