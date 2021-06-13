package basic;

import java.util.ArrayList;
import java.util.List;

public class Add {
	
	String houseNumber;
	String city;
	String country;
	
	public  Add(String  houseNumber, String city)
	{
		this.houseNumber= houseNumber;
		this.city = city;		
	}
	
	
	public List getAdd()
	{
		List<String> list = new ArrayList<String>();
		list.add(houseNumber);
		list.add(city);
		return list;	
		
	}

}
