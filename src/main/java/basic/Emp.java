package basic;

import java.util.List;

public class Emp {
	
	
	String name;	
	Add add;
	
	public void setEmp(String name, Add add)
	{
		this.name= name;
		this.add = add;
	}
	
	
	
	public void displayDetails()
	{
		
		System.out.println(name);
		
		List<String> list = add.getAdd();

		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
	
	
	


}
