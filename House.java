/**
* This class represents House in a Colony.
* Some of the basic functions about expenditures are included in this class.
*
* @author Avil Aneja , Prabhjyot, Jahanvi Shah
* @version 7 February 2020
*/
public class House
{
	/**
	* Returns the total expenditure on food by a house.
	* Assume that all food items are being purchased by the Departmental store.
	* Consider the prices of items from Departmental store class.However don't hard code them, use the functions to get the rates.
    * @param amtOfMilk is an integer which represents the quantity of Milk consumed by a House.
    * @param amtOfRice is an integer which represents the quantity of Rice consumed by a House.
    * @param amtOfWheat is an integer which represents the quantity of Wheat consumed by a House.
    * @param companyOfMilk is a String which represents the brand/company of Milk consumed by a House.
    * @param companyOfRice is a String which represents the brand/company of Rice consumed by a House.
    * @param companyOfWheat is a String which represents the brand/company of Wheat consumed by a House.
    * @return An integer which represents the total expenses done by a House on food bought from Departmental Rates.
    */
	public static int totalExpenditureOnFood(int amtOfMilk, int amtOfRice, int amtOfWheat, String companyOfMilk, String companyOfRice, String companyOfWheat)
	{
		DepartmentalStore obj = new DepartmentalStore();
		int totalCostForMilk = (obj.costofMilkPerlitre(companyOfMilk))*amtOfMilk;
		int totalCostForRice = (obj.costofRicePerkg(companyOfRice))*amtOfRice;
		int totalCostForWheat = (obj.costofWheatPerkg(companyOfWheat))*amtOfWheat;
		return totalCostForMilk+totalCostForRice+totalCostForWheat;
	}

	/**
	* This method calculates the basic Expenditure by a house per person.
	* The expenditure depends on the house number.
	* If house number is a multiple of 5 then expenditure per person is 1000.
	* If house number is not a multiple of 5 then expenditure per person is 700. 
    * @param house_no is an integer which refers to the house number.
    * @return An integer whihc represents the basic Expenditure per person in a house.
    */
	public int basicExpenditurePerPerson(int house_no)
	{
		if(house_no % 5 == 0)
		{
			return 1000;
		}
		else
		{
			return 700;
		}

	}
}
