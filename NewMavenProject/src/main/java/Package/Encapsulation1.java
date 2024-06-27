package Package;

public class Encapsulation1 {
	private int rollNo;
	private String name;
	public void setDetails(int r,String s) {
		rollNo=r;
		name=s;
	}
	public void getDetails() {
		System.out.println("Roll No is "+rollNo);
		System.out.println("name is "+name);
	}
}

