public class AccessModifiers {

public static void main(String[] args) {
		
Human human = new kanna();
human.hands();
kanna ref = new kanna();
ref.eat();
ref.setname("KANNA REDDY");
System.out.println(ref.getname());
human.display();
	}

}
interface Human {
	public void hands();
	default void display(){
		System.out.println(" useage of default...  ");
	}
	
	
}
class kanna implements Human {
	public void hands() {
		System.out.println("human has only two hands");
	}
	
	protected void eat() {
		System.out.println("human eats ....");
	}
	private String name;
	public String getname() {
		return this.name;
	}
	public void setname(String name) {
		this.name = name;
	}
}
