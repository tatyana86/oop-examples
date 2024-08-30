class Person {

	public void sayType() {
		System.out.println("It's class Person");
		sayHello();	
	}
	
	private void sayHello() {
		System.out.println("Hello from Person");
	}
}

class Woman extends Person {
	
	@Override
	public void sayType() {
		System.out.println("It's class Woman");
		super.sayType();
	}
	
}

public class Task13 {
	
	public static void main(String[] args) {
		
		Person w = new Woman();
		w.sayType();
		
	}
	
}
