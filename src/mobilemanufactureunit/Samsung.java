/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilemanufactureunit;

/**
 *  A class to model mobile Samsung
 * 
 * @author Sivagama Srinivasan
 ** */
public class Samsung extends Mobile
{
    
  public Samsung()
    {
        super();
        super.bundle("Headphone");
    }
    public void Label(String label)
    {
       super.shopName = label;
        //do some labelling here, code not implemented yet
        //not necessary for the review
    }  
}
