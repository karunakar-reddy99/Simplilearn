public class ReturnType {

	public static void main(String[] args) {
		new ReturnType().add();
		System.out.println(add());
		new ReturnType().sub();
	}
	static int add() {
		int a,b,c;
		a=10;
		b=5;
		c=a+b;
		return c;
	}
	void sub() {
		System.out.println("'VOID' returns nothing");
	}

}
