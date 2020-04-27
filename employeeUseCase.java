public class EmployeeUseCase{
	
	public static void main(String[] args){
		int IS_PRESENT=1;
		double wagePerHour=20;
		double fullDay=8;	
		double empWage;
		double empCheck=Math.floor(Math.random() * 10 ) %2;
		System.out.println("Welcome to the Employee Use Case problem");

		if (empCheck==IS_PRESENT){
			System.out.println("Employee is present");
			empWage=wagePerHour*fullDay;
			System.out.println("Employee wage is: "+ empWage);
		}
		else{
			System.out.println("Employee is absent");
		}
	}
}
