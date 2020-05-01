public class CompanyEmpwage {

	private final String company;
	private final int empRatePerHr;
	private final int numOfWorkingDays;
	private final int maxHrsPerMonth;
	private int totalEmpWage;



        public CompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays,int maxHrsPerMonth) {
                this.company=company;
		this.empRatePerHr=empRatePerHr;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHrsPerMonth=maxHrsPerMonth;
	}

	@override
	public String toString() {
		return "total Emp Wage for Company : "+company+ "is: "+totalEmpWage;
	}


}
