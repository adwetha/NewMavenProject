package Package;

public class TestBank {
	public static void main(String[] args) {
		Bank b=new SBI();
		System.out.println(b.getInterestRate());
		Bank v=new Federal();
		System.out.println(v.getInterestRate());
		b.printDetails();
		v.printDetails();
		
	}
}
