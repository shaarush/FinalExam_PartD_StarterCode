/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilemanufactureunit;

/** A class that manufactures Mobile.
 * We only ever want one manufacture location to make 
 * Mobiles to ensure consistency.
 * Users can order the number of Mobiles they want to buy
 * @author Sivagama Srinivasan 
 august
  */
public class MobileManufactureLocation
{
  public int numofMobile = 0;// how many orders to manufacture Mobile
    public MobileManufactureLocation()
    {
        //intentionally left blank
    }  
}
