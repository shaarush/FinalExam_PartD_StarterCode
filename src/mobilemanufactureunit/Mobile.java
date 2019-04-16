/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilemanufactureunit;

import java.util.ArrayList;

/**
 *
 * @author Sivagama Srinivasan
 */
public class Mobile 
{
public String shopName= "CellCampus";
    private ArrayList<String> mobileparts = new ArrayList();
    
    public void bundle(String parts) 
        {
	mobileparts.add(parts);
        }

	
	public void label(String label) 
        {
	shopName=label;
        }
       
}
