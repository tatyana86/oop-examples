class Building {

	int numberOfFloors; // количество этажей
	double height; // высота здания
	
	// конструктор
	Building(int numberOfFloors, double height) {
		this.numberOfFloors = numberOfFloors;
		this.height = height;
	}

	double getFloorHeight() {
		return height / numberOfFloors;
	}
}

class Cottage extends Building {
	
	double foundationHeight; // высота фундамента над землей
	
	Cottage(int numberOfFloors, double height, double foundationHeight) {
		super(numberOfFloors, height); // вызов конструктора суперкласса
		this.foundationHeight = foundationHeight;
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
		
		// Использование наследования - вызов метода, определенного в родительском классе
		Cottage cottage = new Cottage(1, 3.0, 1.0);
		
		System.out.print(cottage.getFloorHeight());
		
	}

}
