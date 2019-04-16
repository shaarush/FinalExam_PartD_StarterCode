/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilemanufactureunit;

import java.util.Scanner;

/**
 * Question for Final Exam Part D.
 * Manufactures a Mobile of a given type based on the purchase orders.
 * @author Sivagama Srinivasan
 */
public class MobileView 
{

public static MobileManufactureLocation Brampton = new MobileManufactureLocation();//we only ever want one 
   // of these. The Mobile manufacture unit is located only in one location Brampton 
   //and all mobiles are manufactured in the same location.
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Mobile shop");
        System.out.println("What kind of Mobile do you want?");
        System.out.println("Please enter exactly iphone or samsung");
        String type = sc.nextLine();
        MobileFactory pf = new MobileFactory();
        Mobile mobile= pf.createMobile(type);
        System.out.println("how many mobiles would you like?");
        int numMobiles = sc.nextInt();
        Brampton.numofMobile=numMobiles;
        if (mobile!=null)
        {
            System.out.println("Great job, here is your order " + numMobiles + " Mobiles");
            
        }
        else
        {
            System.out.println("Enter a valid Mobile type");
        }
        
    }//end main    
}
