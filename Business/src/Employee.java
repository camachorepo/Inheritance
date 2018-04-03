
public class Employee {
	
	
	protected long employeeId;
	protected String employeeName;
	protected String employeeAddress;
	protected Long employeePhone;
	protected double basicSalary;
	protected double specialAllowance = 250.80;
	protected double hra = 1000.50;

	public Employee() {}
	
	public Employee(long id, String name, String address, long phone ){
		this.employeeId = id; 
		this.employeeName = name; 
		this.employeeAddress = address;
		this.employeePhone = phone;
	}
	
	double calculateSalary () {
		return 	(this.basicSalary + (this.basicSalary * (this.specialAllowance/100)) + (this.basicSalary * (this.hra/100)));
	}
	
	public void calculateTransportAllowance() {
		basicSalary *=.9;
	}
	
	
	
	
}
