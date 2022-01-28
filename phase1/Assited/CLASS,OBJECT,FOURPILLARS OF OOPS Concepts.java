//ABOUT ABSTRACTION



public class AboutAbstraction {

	public static void main(String[] args) {
		Panna panna = new Panna();
		panna.eat();
		Ammu ammu = new Ammu();
		ammu.eat();
		

	}

}
abstract class Kuman {
	 void eat() {
		System.out.println("Generic way of eating");
	}
	 void sleep() {
		System.out.println("generic way of sleeping");
	}
	 void run() {
		System.out.println("generic way of running");
	}
}

class Panna extends Kuman{

	@Override
	void eat() {
		System.out.println("kanna's own way of eating...");
	}
	void swim() {
		System.out.println("Kanna's own way of swimming");
	}
	 void playing() {
		System.out.println("Kanna's own way of playing");
	}
}
class Ammu extends Kuman{
	@Override
	void eat() {
		System.out.println("ammu's own way of eating");
	}
}



================================================================
//ABOUT POLYMORPHISM
//1.METHOD OVERLOADING



public class MethodOverloading {

	public static void main(String[] args) {
		new MethodOverloading().add(3,6);

	}
	void add(int... values) {
		int total=0;
		if(values.length>1) {
			for(int value=1;value<=values.length;value++) {
				total = total + value;
			}
		System.out.println(total);}
		else
			System.out.println("addition is not possible");
			
	}

}



================================================================
//2.METHOD OVERLOADING



public class Overridding {

	public static void main(String[] args) {
		Kanna kanna = new Kanna();
		kanna.eat();
		kanna.sleep();
		kanna.swim();
		kanna.playing();
		Human human = new Human();
		human.eat();
		human.sleep();
		
	}

}
class Human {
	void eat() {
		System.out.println("Generic way of eating");
	}
	void sleep() {
		System.out.println("generic way of sleeping");
	}
	void run() {
		System.out.println("generic way of running");
	}
}

class Kanna extends Human{

	@Override
	void eat() {
		System.out.println("kanna's own way of eating...");
	}
	void swim() {
		System.out.println("Kanna's own way of swimming");
	}
	 void playing() {
		System.out.println("Kanna's own way of playing");
	}
}




================================================================
//ABOUT INTERFACE

public class WorkingOnInterface {

	public static void main(String[] args) {
		Human []refs = new Human[3];//Works
		refs[0] = new Ammu();
		refs[1] = new Kanna();
		refs[2] = new Kanna();
		
//		Traverse through the array with a loop
		for(Human ref : refs) {
			ref.eat();
			ref.breathe();
			ref.walk();
			ref.smile();
			if(ref instanceof Ammu)
				((Ammu)ref).sing();
			System.out.println("--------------------------");
		}
		
		
		
		
//		Human ref = new Ammu();
//		ref.breathe();
//		ref.eat();
////		ref.sing();//doesn't work
//		
//		ref = new Kanna();
//		
//		ref.breathe();
//		ref.eat();
	}

}

interface Human{
	void eat();
	void walk();
	void breathe();
	default void smile() {//Works starting with Java 8
		System.out.println("The smile was added later on");
	}
}

interface Boxer extends Human{
	void fight();
}

interface Employee{
	void workForWages();
	default void smile() {
		System.out.println("Employee's smile...");
	}
}

class Ammu implements Human{
	@Override
	public void eat() {
		System.out.println("Ammu's own version of eat...");
	}
	
	@Override
	public void walk() {
		System.out.println("Ammu's walk...");
	}
	@Override
	public void breathe() {
		System.out.println("Ammu's breathe...");
	}
	
	void sing() {
		System.out.println("Ammu can sing...");
	}
}

class Kanna implements Human, Employee{
	@Override
	public void eat() {
		System.out.println("Kanna's own version of eat...");
	}
	@Override
	public void walk() {
		System.out.println("Kanna's walk...");
	}
	@Override
	public void breathe() {
		System.out.println("Kanna's breathe...");
	}
	
	@Override
	public void workForWages() {
		System.out.println("Kanna has started working now...");
		
	}
	
	@Override
	public void smile() {
		Human.super.smile();
	}
	
	
}



==========================================================================
