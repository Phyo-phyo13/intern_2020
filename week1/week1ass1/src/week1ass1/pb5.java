package week1ass1;

public class pb5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentNames=new String[10];
		studentNames[0]="Aye Aye";
		studentNames[1]="Aung Aung";
		studentNames[2]="Phyo Phyo";
		studentNames[3]="Hninyee";
		studentNames[4]="Aye Mar";
		studentNames[5]="Htet Htet";
		studentNames[6]="Walar Bo";
		studentNames[7]="Thura";
		studentNames[8]="Noe Noe";
		studentNames[9]="Naing Naing";
		
		for(int i=0;i<studentNames.length;i++) {
			if(studentNames[i]=="Noe Noe")
			{
				System.out.println("I'am "+studentNames[i]);
				System.out.println("And my index is "+i);
				
			}
		}
		
	}

}
