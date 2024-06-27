package Package;

public class SingleB extends SingleA{
public void runB() {
	  System.out.println("child class");
  }
	public static void main(String[] args) {
		SingleB b=new SingleB();
		System.out.println(b.a);
		b.run();
		b.runB();

	}
}
