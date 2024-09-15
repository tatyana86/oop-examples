Имеем родительский и дочерний классы:
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
```
Полиморфный вызов:
```
Person woman = new Person();
woman.sayType();
```

Ковариантный вызов:
```
// определение метода
void process(List<Person> people) {
    // ..
}

// создание списка
List<Woman> women = new List<Woman>;

// вызываем метод и передаем в качестве аргумента созданный список
process(women);
```