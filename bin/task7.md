Динамическое связывание в Java представляет собой механизм, с помощью которого вызов переопределенного метода распознается во время выполнения, а не на этапе компиляции.

Рассмотрим пример.

```
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
```

В дочерних классах ```Woman``` и ```Man``` метод ```sayType()``` переопределен, и именно переопределенный метод будет вызван, не смотря на то, что тип ссылочных переменных объявлен как ```Person```.

Таким образом, динамическое связывание позволяет поддерживать полиморфизм в Java.