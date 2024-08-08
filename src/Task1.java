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

class Greenhouse extends Building {
	
	Window window; // окно в теплице
	
	// конструктор
	Greenhouse(int numberOfFloors, double height, double area, Window window) {
		super(numberOfFloors, height, area);
		this.window = window;
	}

}

class Window {
	
	double width; // ширина
	double height; // высота
	
	// конструктор
	public Window(double width, double height) {
		this.width = width;
		this.height = height;
	}
		
}

public class Task1 {

	public static void main(String[] args) {
		
		// Использование композиции - объект класса "Окно" содержится как поле объекта класса "Теплица"
		Window window = new Window(1.5, 1.0);
		Greenhouse greenhouse = new Greenhouse(1, 1.8, 4, window);
		
		// Использование наследования - вызов метода, определенного в родительском классе
		Cottage cottage = new Cottage(1, 3.0, 100, 1.0);
		System.out.println(cottage.getVolume());
				
		// Использование полиморизма
		System.out.println(cottage.getFloorHeight());
	}

}
