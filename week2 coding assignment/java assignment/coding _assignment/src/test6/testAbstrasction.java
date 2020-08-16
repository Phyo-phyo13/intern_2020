package test6;
abstract class Shape{  
abstract void draw();  
} 


//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle");}  
}  


class Circle1 extends Shape{  
void draw()
{System.out.println("drawing circle");}  
}  


public class testAbstrasction  {
	public static void main(String args[]) {
		
	
	Shape s=new Circle1();
	s.draw();
	
}}
