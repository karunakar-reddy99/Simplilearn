public class InnerclassesTypes {
	public static void main(String[] args) {
		System.out.println("Regular Inner Classes output");
		new Outer().new Inner().var();
		System.out.print("\n\nMethod Inner Classes output \n");
		new Bigger().func();
		System.out.print("\n\nAnnonymous Inner Classes\n");
		remote ref = new Work();
		ref.WFH();
		remote theremote = new remote() {
			public void WFH() {
				System.out.println("ANONYMOUS INNER CLASSES");
				
			}
		};
theremote.WFH();
	}
}
//REGULAR INNERCLASSES
class Outer{
	class Inner{
		int val;
		void var() {
		int val=90;
		System.out.println("value is "+val);
		System.out.println("  "+this.val);
		}
		
	}
	void met() {
		Inner ref = new Inner();
		ref.var();
	}
}
//METHOD INNERCLASSES
class Bigger{
	final char ch = 's';
	int c = 99;
	void func() {
		Boolean flag = false;	
	class Smaller{
	void dunc(){
		System.out.println(c);
		System.out.println(ch);
		System.out.println("inner in inner is....");
		System.out.println(flag);

		}
	}
	new Smaller().dunc();
	}
}
//Anonymous Innerclasses
interface remote{
	void WFH();
}
class Work implements remote{
	@Override
	public void WFH() {
		System.out.println("welcome");
	}
}
