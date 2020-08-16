package test3;

public class encapsulationEg {
	 
	
	
	public static void main(String args[]){
       test obj = new test();
        obj.setEmpName("Mario");
        obj.setEmpAge(32);
        obj.setEmpAge(112233);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getSSN(32));
        System.out.println("Employee Age: " + obj.getEmpAge());
   } 
	
}
	
	
	class test{
	private int ssn;
	    private String empName;
	    private int empAge;
		public int getSsn() {
			return ssn;
		}
		public int getSSN(int newValue) {
			// TODO Auto-generated method stub
			return ssn=newValue;
		}
		public void setSsn(int ssn) {
			this.ssn = ssn;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public int getEmpAge() {
			return empAge;
		}
		public void setEmpAge(int empAge) {
			this.empAge = empAge;
		}
	    
}
