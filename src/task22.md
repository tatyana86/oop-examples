Допустим, имеются разные графические объекты Прямоугольник, Овал, Текст, которые необходимо выводить на разные порты. В зависимости от объектов и портов, вывод осуществлялся бы по-разному, и происходили бы множественные ветвления.
Чтобы избежать этого, можно применить наследование вида: различные порты наследуются от общего класса OutputPort, а в родительском классе для объектов, GraphObject, добавляем поле OutputPort.

```
class GraphObject {
	private OutputPort port; // тип порта для вывода
	// ...
}

class Rectangle extends GraphObject {
	// ...
}

class Oval extends GraphObject {
	// ...
}

class Text extends GraphObject {
	// ...
}

class OutputPort {
	public void display() {
		// ...    
	}
}

class Display extends OutputPort {
	// ...
}

class Printer extends OutputPort {
	// ...
}

class Remote extends OutputPort {
	// ...
}
```