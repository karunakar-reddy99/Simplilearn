import java.util.Scanner;

public class UseOfConstructers {

	public static void main(String[] args) {
		Person p = new Person();
		p.add();

	}
	static public class Person 
	{  
		void add() {
			Scanner ref = new Scanner(System.in);
			System.out.println("address");
			String address = ref.nextLine();
			System.out.println("name");
			String name = ref.nextLine(); 
			System.out.println("age");
			int age = ref.nextInt();
	        System.out.println(name+ " " +age+" " +address);
	}

}
}
