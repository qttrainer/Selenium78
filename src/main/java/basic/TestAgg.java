package basic;

public class TestAgg {
	
	public static void main(String[] args) {
		
		
		Emp emp = new Emp();
		
		Add add = new Add("123", "abc");
		
		emp.setEmp("Ashutosh", add);
		
		emp.displayDetails();
	}

}
