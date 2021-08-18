/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilemanufactureunit;

/** A class that creates different kinds of Mobiles
 *  depending on their type.
 *
 * @author Sivagama Srinivasan
 **/
public class MobileTypes
{
     public Mobile createMobile(String type)
    {
        Mobile mobile = null;
        if(type.equals("samsung"))
        {
            mobile = new Samsung();
        }
        else if (type.equals("iphone"))
        {
                mobile= new Iphone();
        }
        return mobile;
    }
}
 
