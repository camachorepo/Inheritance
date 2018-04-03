
public class InheritanceActivity {
	
	
	public static void main (String [] args) {
		
		Manager peter =  new Manager(126534, "Peter", "Chennai India", 237844, 65000 );
		peter.calculateTransportAllowance();
		System.out.println("The salary for Manager Peter is : $" + peter.calculateSalary());
		
		Trainee jack = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000 );
		jack.calculateTransportAllowance();
		System.out.println("The salary for Trainee Jack is : $" + jack.calculateSalary());
	}

}
