import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		try {
			validatename(name);
		}catch(namenotvalidException e) {
			System.out.println(e.getMessage());
		}
	}
		private static void validatename(String name)throws namenotvalidException{
		if(name.startsWith("emp_")) {
			System.out.println("welcome "+name+"you are logged in....");
		}
		else {
			throw new namenotvalidException("invalid emp name,name should start with emp_ ");
		}

	}
}
class namenotvalidException extends Exception{
	public namenotvalidException(String message) {
		super(message);
	}
}
