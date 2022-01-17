package praticeJamil;

public class MyInfo {

	public String name;
	public int age;
	public char sex;
	public boolean citizen;

	public MyInfo() {
		System.out.println("This is default Constructor");

	}

	public MyInfo(String name) {
		this.name = name;
		System.out.println("My Name: " + name);

	}

	public MyInfo(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("My Name: " + name + ", My Age: " + age);

	}
}
