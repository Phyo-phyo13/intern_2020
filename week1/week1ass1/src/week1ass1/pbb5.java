package week1ass1;

public class pbb5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] numArray={34,54,64,42,34,56,44,65,87,23,57,74};
int biggestNumber=biggestNumber(numArray);
int smallestNumber=smallestNumber(numArray);

	}

	public static int smallestNumber(int[] numArray) {
		// TODO Auto-generated method stub
		int result=34;
		for(int i=1;i<numArray.length;i++) {
			if(numArray[i]<result) {
			result=numArray[i];
			
			}
		}
		System.out.println("The smallest number is "+result);
		return result;
	}

	public static int biggestNumber(int[] numArray) {
		// TODO Auto-generated method stub
		int result=34;
		for(int i=1;i<numArray.length;i++) {
			if(numArray[i]>result) {
			result=numArray[i];
			
			}
		}
		System.out.println("The biggest number is "+result);
		return result;
	}

}
