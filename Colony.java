/**
* This class represents Colony which has many Houses (in other terms various objects of House class).
* In this class the basic function you have to create is create_array which will return an array of many houses.
*
* @author Avil Aneja , Prabhjyot, Jhanavi Shah
* @version 7 February 2020
*/
public class Colony
{

	public int TestMethod123() {
		return 2;
	}
	public House obj[] = new House[10];

	/**
	* This method creates an array of the objects of House class.
	* Length of the array is 10 i.e. there are 10 houses in the colony.
	* House number starts from 1 and goes till 10.
    * @return An array of House type.
    */
	public House[] create_array()
	{
		House obj[] = new House[10];
		for(int i=0; i<10; i++)
		{
			obj[i]= new House();
		}
		return obj;
	}

	/**
	* This method calculates the maintenance earned by the colony.
	* Maintenance earned by a colony is equal to the 10% of the sum of basic expenditure of a house.
	* Basic expenditure of a house is calculated as basic Expenditure per person multiplied by number of persons in the house.
	* Number of persons in a house is equal to the house_no.
	* For eg maintenance of house no. 6 will be = basicExpenditurePerPerson(6)*6*0.1;
    * @return A double which represents the colony earnings.
    */
	public double ColonyEarnings()
	{
		obj = create_array();
		double ans = 0;
		for(int i=0; i<10; i++)
		{
			ans = ans + (obj[i].basicExpenditurePerPerson(i+1))*(i+1)*0.1;
		}
		return ans;
	}

	/**
	* This method calculates the total earnings by the departmental store.
	* Assume departmental store sell the items to all houses present in the colony..
	* @param amtOfMilk is an array of integers having the information about the quantity of milk in litres bought by each house. Index 0 corresponds to house no. 1 and so on. 
	* @param amtOfRice is an array of integers having the information about the quantity of Rice bought in kgs by each house. Index 0 corresponds to house no. 1 and so on. 
	* @param amtOfWheat is an array of integers having the information about the quantity of Wheat bought in kgs by each house. Index 0 corresponds to house no. 1 and so on. 
	* @param companyOfMilk is an array of Strings having the information about the brand of Milk purchased by each house.Index 0 corresponds to house no. 1 and so on.
	* @param companyOfRice is an array of Strings having the information about the brand of Rice purchased by each house.Index 0 corresponds to house no. 1 and so on.
	* @param companyOfWheat is an array of Strings having the information about the brand of Wheat purchased by each house.Index 0 corresponds to house no. 1 and so on.
    * @return An integer which represents the departmental store earnings.
    */
	public int DeptStoreEarnings(int amtOfMilk[] , int amtOfRice[] , int amtOfWheat[] , String companyOfMilk[] , String companyOfRice[] , String companyOfWheat[])
	{
		obj = create_array();
		int earnings = 0;
		for(int i=0; i<10; i++)
		{
			earnings = earnings + obj[i].totalExpenditureOnFood(amtOfMilk[i], amtOfRice[i], amtOfWheat[i] , companyOfMilk[i] , companyOfRice[i] , companyOfWheat[i] );
		}
		return earnings;
	}

	/** 
	* This method calculates the house no. which incur minimum expenditure on food.
	* @param amtOfMilk is an array of integers having the information about the quantity of milk in litres bought by each house. Index 0 corresponds to house no. 1 and so on. 
	* @param amtOfRice is an array of integers having the information about the quantity of Rice bought in kgs by each house. Index 0 corresponds to house no. 1 and so on. 
	* @param amtOfWheat is an array of integers having the information about the quantity of Wheat bought in kgs by each house. Index 0 corresponds to house no. 1 and so on. 
	* @param companyOfMilk is an array of Strings having the information about the brand of Milk purchased by each house.Index 0 corresponds to house no. 1 and so on.
	* @param companyOfRice is an array of Strings having the information about the brand of Rice purchased by each house.Index 0 corresponds to house no. 1 and so on.
	* @param companyOfWheat is an array of Strings having the information about the brand of Wheat purchased by each house.Index 0 corresponds to house no. 1 and so on.
	* @return An integer which represents the house number having minimum expenditure on food.
	*/	

	public int HouseHavingMinimumExpenditure(int amtOfMilk[] , int amtOfRice[] , int amtOfWheat[] , String companyOfMilk[] , String companyOfRice[] , String companyOfWheat[])
	{
		obj = create_array();
		int min = Integer.MAX_VALUE;
		int min_house_no = -1;
		for(int i=0; i<10; i++)
		{
			if(min > obj[i].totalExpenditureOnFood( amtOfMilk[i], amtOfRice[i], amtOfWheat[i], companyOfMilk[i], companyOfRice[i], companyOfWheat[i]))
			{
				min = obj[i].totalExpenditureOnFood(amtOfMilk[i], amtOfRice[i], amtOfWheat[i], companyOfMilk[i], companyOfRice[i], companyOfWheat[i]);
				min_house_no = i;
			}
		}
		return min_house_no+1;

	}
}
