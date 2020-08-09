package week1ass1;

public class pb4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superMethod();
		pb4 myApk=new pb4();
		myApk.hyperMethod();
		int return2=ultraMethod();
		System.out.println(return2);
		

	}

	private static void superMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is super Methods.....");
		int return1=ultraMethod();
		System.out.println(return1);
		
	}

	public static int ultraMethod() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int hyperMethod() {
	System.out.println("This is hyper method......");
	return 0;
	}

}
