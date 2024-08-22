### Пример ковариантности:

Имеется родительский и дочерний классы:

```
class Building {
	public Building produce() {
		return new Building();
	}
}
```

```
class Cottage extends Building {
	@Override
	public Cottage produce() {
		return new Cottage();
	}
}
```
В родительском классе метод ```produce()``` возвращает объект типа Building, а в дочернем классе переопределенный метод возвращает объект типа Cottage.

### Пример контравариантности:

Вдобавок к имеющимся родительскому и дочернему классам определим класс CottageProcessor и его наследник BuildingProcessor:
```
class CottageProcessor {
  public void process(Cottage cottage) {
    // логика делегата, использующего методы класса Cottage
  }
}

class BuildingProcessor extends CottageProcessor{
  @Override
  public void process(Building building) {
    // логика делегата, использующего методы класса Building
  }
}
```
Дочерний класс BuildingProcessor может принят класс Cottage и обрабатывать его как его предка - Building.


