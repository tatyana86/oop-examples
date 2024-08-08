Для демонстрации основных принципов ООП определим родительский класс ***Building***:

```
class Building {

	int numberOfFloors; // количество этажей
	double height; // высота строения
	double area; // площадь строения
	
	// конструктор
	Building(int numberOfFloors, double height, double area) {
		this.numberOfFloors = numberOfFloors;
		this.height = height;
		this.area = area;
	}

	// возвращает прикидочный объем строения
	double getVolume() {
		double areaOfOneFloor = area / numberOfFloors;
		double volume = areaOfOneFloor * height;
		return volume;
	}
	
	// возвращает высоту одного этажа
	double getFloorHeight() {
		return height / numberOfFloors;
	}
}
```
В данном классе напишем два метода, вычисляющие объем строения и высоту одного этажа исходя из параметров, переданных при создании объекта класса.

### 1. Наследование.

Создадим дочерний класс ***Cottage***:

```
class Cottage extends Building {
	
	double foundationHeight; // высота фундамента над землей
	
	Cottage(int numberOfFloors, double height, double area, double foundationHeight) {
		super(numberOfFloors, height, area); // вызов конструктора суперкласса
		this.foundationHeight = foundationHeight;
	}

	double getFloorHeight() {
		return height / numberOfFloors + foundationHeight;
	}
}
```
Дочерний класс унаследовал все поля и методы, определенные в родительском классе.

### 2. Полиморфизм.
Как видно из кода, метод ```getFloorHeight()``` , который уже был определен в родительском классе ***Building***, был переопределен в дочернем классе ***Cottage***. Такая необходимость может быть вызвана тем, что расчет каких-либо параметров в дочерних классах уточняется с использованием новых полей класса. Соответственно при переопределении методов будет использоваться версия, определенная в дочернем классе.


### 3. Композиция.

Создадим еще один дочерний класс ***Greehouse***:
```
class Greenhouse extends Building {
	
	Window window; // окно в теплице
	
	// конструктор
	Greenhouse(int numberOfFloors, double height, double area, Window window) {
		super(numberOfFloors, height, area);
		this.window = window;
	}

}
```
Поле ```window``` расширяет родительский класс, в свою очередь являясь объектом другого клаcса ***Window***:

```
class Window {
	
	double width; // ширина
	double height; // высота
	
	// конструктор
	public Window(double width, double height) {
		this.width = width;
		this.height = height;
	}
		
}
```

### Работа с классами

```
public static void main(String[] args) {
	
	// Использование композиции - объект класса "Окно" содержится как поле объекта класса "Теплица"
	Window window = new Window(1.5, 1.0);
	Greenhouse greenhouse = new Greenhouse(1, 1.8, 4, window);
	
	// Использование наследования - вызов метода,
	// определенного в родительском классе
	Cottage cottage = new Cottage(1, 3.0, 100, 1.0);
	System.out.println(cottage.getVolume());
			
	// Использование полиморизма - будет вызван метод, 
	// определенный в дочернем классе
	System.out.println(cottage.getFloorHeight());
}
```

