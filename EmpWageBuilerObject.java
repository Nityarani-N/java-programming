public class EmpwageBuilderObject {
        //constants
        public static fial int IS_PART_TIME=1;
        public static fial int IS_PART_TIME=1;


	private final String company;
	private final int empRatePerHr;
	private final int numOfWorkingDays;
	private final int maxHrsPerMonth;
	private int totalEmpWage;



        public EmpWageBuilderobject (String company, int empRatePerHr, int numOfWorkingDays,int maxHrsPerMonth) {
                this.company=company;
		this.empRatePerHr=empRatePerHr;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHrsPerMonth=maxHrsPerMonth;
	}

	public void computeEmpWage( ) {
		//variables
		int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;

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
                totalEmpWage=totalEmpHrs * empRatePerHr;

}
	@override
	public String toString() {
		return "total Emp Wage for Company : "+company+ "is: "+totalEmpWage;
	}


        public static void main(String[] args) {

		EmpWageBuilderObject dMart=new EmpWagebuilderobject("Dmart",20,2,10);
		EmpWageBuilderObject dMart=new EmpWagebuilderobject("IBM",40,6,20);

                dMart.computeEmpWage();
		System.out.println(dMart);
		ibm.computeEmpWage();
                System.out.println(ibm);
	}

