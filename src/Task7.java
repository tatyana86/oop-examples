class Person {

	public void sayType() {
		System.out.println("It's class Person");
	}
	
}

class Woman extends Person {
	
	@Override
	public void sayType() {
		System.out.println("It's class Woman");
	}
	
}

class Man extends Person {
	
	@Override
	public void sayType() {
		System.out.println("It's class Maan");
	}
	
}

public class Task7 {

	public static void main(String[] args) {
		
		// создаем объект типа Woman и присваиваем его ссылочной переменной типа Person
		Person p1 = new Woman();
		
		// создаем объект типа Man и присваиваем его ссылочной переменной типа Person
		Person p2 = new Man();
		
		p1.sayType(); // вывод: It's class Woman
		p2.sayType(); // вывод: It's class Man

	}

}
