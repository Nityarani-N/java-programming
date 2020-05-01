public interface IcomputeEmpWage {
	public void addCompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth);
	public void computeEmpWage();
	public int getTotalWage(String company);
}
	
public class CompanyEmpwage {

    private final String company;
    private final int empRatePerHr;
    private final int numOfWorkingDays;
    private final int maxHrsPerMonth;
    private int totalEmpWage;

    public CompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth){
        this.company=company;
        this.empRatePerHr=empRatePerHr;
        this.numOfWorkingDays=numOfWorkingDays;
        this.maxHrsPerMonth=maxHrsPerMonth;
		totalEmpgWage = 0;
	}
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage=totalEmpWage;
	}

				
    @override
    public String toString() {
        return "total Emp Wage for Company : "+company+ "is: "+totalEmpWage;
     }
}



public class EmpWageBuilder implements IComputeWage{
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	private int numOfCompany=0;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String,CompanyEmpWage>companyToEmpWage;
}	
public EmpWageBuilder() {
	companyEmpWageList=new LinkedList();
	companyToEmpWage=new HashMap();
}
public void addCompanyEmpWage(String company,int empRatePerHr, int maxHrsPerMonth){
		companyEmpWage companyEmpWage=new CompanyEmpWage(company,empRatePerHr,numOfWorkingHrs,maxHrsPerMonth);
		companyEmpWageList.add(companyEmpWage);
		companyToEmpWage.put(company,companyEmpWage);
}	
public void computeEmpWage(){
	for(int i=0;i<companyEmpWageList.size();i++){
		CompanyEmpWage companyEmpWage=companyEmpWageList.get(i);
		companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage)){
		System.out.println(companyEmpWage);
		}
}

public int getTotalWage(String company){
	return companyToEmpWageMap.get(company).totalEmpWage;
}
public int computeEmpWage(CompanyEmpWage companyEmpWage){....}	

public static void main(String[] args) {
	IComputeEmpWage empWageBuilder=new EmpWageBuilder();
	empWageBuilder.addCompanyEmpWage( company:"DMart", empRatePerHr:20, numOfWorkingDays:2, maxHrsPerMonth:10);
	empWageBuilder.addCompanyEmpWage( company:"Reliance", empRatePerHr:10, numOfWorkingDays:4, maxHrsPerMonth:20);
	empWageBuilder.computeEmpWage();
	System.Out.Println("Total wage for DMart company:" + empWageBuilder.getTotalWage(company: "Dmart"));
}
