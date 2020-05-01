public class EmpwageBuilderArray {
        //constants
        public static fial int IS_PART_TIME=1;
        public static fial int IS_PART_TIME+2;
	private int numOfCompany;

	private CompanyEmpWage[] companyEmpWageArray;
	public EmpWageBuilderArray= new CompanyEmpWage[5];
	}


        public void addComapnyEmpWage (String company, int empRatePerHr, int numOfWorkingDays,int maxHrsPerMonth) {
                companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHr,numOfWorkingDays, maxHrsPerMonth);
		numOfWorkingdays++;

	}

	public void computeEmpWage(CompanyEmpWage companyEmpWage) {
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
                return totalEmpWage=totalEmpHrs * empRatePerHr;

}

public static void main(String[] args) {
	EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
	empWageBuilder.addCompanyEmpWage(DMart, 20, 2, 10);
	empWageBuilder.addCompanyEmpWage(Reliance, 10, 4, 20);
	empWageBuilder.computeEmpWage();
}
