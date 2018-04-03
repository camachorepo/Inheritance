
public class Manager extends Employee {
	
	
	public Manager (long id, String name, String address, long phone, double salary ) {
		
		super(id, name, address, phone);
		super.basicSalary = salary;
		
		
	}
	
	public void calculateTransportAllowance () {
		
		super.basicSalary *=.85; 
		
	}

}
