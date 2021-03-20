/**
* This class represents Departmental Store.
* It has various functions in it which tells the rate of different items based on the company.
*
* @author Avil Aneja , Prabhjyot, Jhanavi Shah
* @version 7 February 2020
*/

import java.util.*;
import java.lang.*;

public class DepartmentalStore
{
	/**
	* Returns the cost of milk per litre according to the given brands/company.. 
	* If company is "Amul" then cost is 39.
	* If company is "Mother Dairy" then cost is 36.
	* If company is none of the above then cost is 32. 
    * @param company is a string which refers to the brand of milk.
    * @return Cost of the milk(Integer) according to the above specified rates of different brands.
    */ 
	public int costofMilkPerlitre(String company)
	{
		if(company == "Amul")
		{
			return 39;
		}
		else if(company == "Mother Dairy")
		{
			return 36;
		}
		else
		{
			return 32;
		}
	}

	/**
	* Returns the cost of Rice per kg according to the given brands/company.. 
	* If company is "Daawat" then cost is 200.
	* If company is "Patanjali" then cost is 130.
	* If company is none of the above then cost is 120. 
    * @param company is a string which refers to the brand of Rice.
    * @return Cost of the Rice(Integer) according to the above specified rates of different brands.
    */
	public int costofRicePerkg(String company)
	{
		if(company == "Daawat")
		{
			return 200;
		}
		else if(company == "Patanjali")
		{
			return 130;
		}
		else
		{
			return 120;
		}
	}

	/**
	* Returns the cost of Wheat per kg according to the given brands/company.. 
	* If company is "Aashirvad" then cost is 40.
	* If company is "Patanjali" then cost is 37.
	* If company is none of the above then cost is 35. 
    * @param company is a string which refers to the brand of Wheat.
    * @return Cost of the Wheat (Integer) according to the above specified rates of different brands.
    */
	public int costofWheatPerkg(String company)
	{
		if(company == "Aashirvad")
		{
			return 40;
		}
		else if(company == "Patanjali")
		{
			return 37;
		}
		else
		{
			return 35;
		}
	}
}
