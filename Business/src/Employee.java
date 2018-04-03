
public class Employee {
	
	
	long employeeId;
	String employeeName;
	String employeeAddress;
	Long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;

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
