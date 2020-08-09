package week1ass1;

public class pb3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valueOne=10;
		int valueTwo=5;
		pb3 p=new pb3();
		int addResult=p.Add(valueOne,valueTwo);
	System.out.println("Adding Result  :"+addResult);
	  
	int subResult=p.Sub(valueOne, valueTwo);
	System.out.println("Sub Result  :"+subResult);
	
	int multResult=p.Mult(valueOne,valueTwo);
	System.out.println("Mult Result  :"+multResult);
	
	int divResult=p.Div(valueOne,valueTwo);
	System.out.println("Div Result  :"+divResult);

	}
	
	

	public int Div(int valueOne, int valueTwo) {
		// TODO Auto-generated method stub
		int result=valueOne/valueTwo;
		return result;
	}



	public int Add(int valueOne, int valueTwo) {
		int result=valueOne+valueTwo;
		return result;
	}
	public int Sub(int valueOne, int valueTwo) {
		int result=valueOne-valueTwo;
		return result;
	}
	public int Mult(int valueOne, int valueTwo) {
		int result=valueOne*valueTwo;
		return result;
	}
	

}
