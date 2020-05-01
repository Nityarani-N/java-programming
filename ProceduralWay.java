public class ProceduralWay {
	//constants
	public static fial int IS_PART_TIME=1;
	public static fial int IS_PART_TIME=1;

	public static int computeEmpWage(String company, int empRatePerHr, int numOfWorkingDays,int maxHrsPerMonth) {
		//variables
		int empHrs=0, totalEmpHrs=0,totalWorkingDays=0;
		//computation
		while (totalEmpHrs<=maxHrsPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck=(int) Math.floor(Math.random() * 10)%3;
			switch (empCheck) {
				case IS_PART_TIME:
					empHrs=4;
					break;
				case IS_FULL_TIME:
                                        empHrs=8;
                                        break;
				default:
					empHrs=0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#:" +totalWorkingDays + "EmpHr:" +empHrs);
		}
		int totalEmpWage=totalEmpHrs * empRatePerHr;
		System.out.println("Total Emp Wage for Company: " +company+" is :"+totalEmpWage);
		return totalEmpWage;

	}
	public static void main(String[] args) {
		computeEmpWage("Dmart",20,2,24)
		computeEmpWage("IBM",40,8,27)

	}
}
