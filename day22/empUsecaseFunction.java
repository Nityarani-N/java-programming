public class empUseCaseFunc{

	public static void wageCalc(int wagePerHour,int fulltime,int halftime, int monthDays){
		int IS_PRESENT=1;
		int empWage;
		int days=1;

		int empCheck=(int)Math.floor(Math.random() * 10 ) %2;
		System.out.println("Welcome to the Employee Use Case problem");

		switch (empCheck){
		case 1:
			int IS_FULLTIME=1;
			int fullTimeCheck=(int)Math.floor(Math.random()*10)%2;
			double totalMonthWage;
			System.out.println("Employee is present");

			switch (fullTimeCheck){
			case 1:
				empWage=wagePerHour*fulltime;
				System.out.println("Employee works fulltime and Employee wage is: "+ empWage);
				while (days<21){
				totalMonthWage=empWage*days;
				System.out.println("Employee wage for "+days+" day is: "+ totalMonthWage);
				days++;
				}

			break;

			case 0:
				empWage=wagePerHour*halftime;
				System.out.println("Employee works parttime and Employee wage is: "+ empWage);
				while (days<21){
				totalMonthWage=empWage*days;
				System.out.println("Employee wage for "+days+" day is: "+ totalMonthWage);
				days++;
				}
			break;
			}
		break;

		case 0:
			System.out.println("Employee is absent");
		}

	}

	public static void main(String args[]){
		wageCalculation(20,8,4,20);
	}
}
