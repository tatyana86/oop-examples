### Наследования вариаций

```
class Animal {
    public void makeSound() {
        System.out.println("The sound of animal");
    }
}

class Turtle extends Animal {
    // наследование с функциональной вариацией
    @Override
    public void makeSound() {
        System.out.println("The sound of turtle");
    }
    
    // наследование с вариацией типа
    @Override
    public void makeSound(String msg) {
        System.out.println("The sound of turtle: " + msg);
    }
}
```

### Наследование с конкретизацией
```
abstract class Vehicle {
    // метод родительского класса абстрактный
    public abstract void move();
}

class Car extends Vehicle {
    // реализуем логику в классе-наследнике
    @Override
    public void move() {
        // ...
    }
}
```

### Структурное наследование

```
class Animal {
    public void makeSound() {
        System.out.println("The sound of animal");
    }
}

interface Flying {
    void fly();
}

class Bird extends Animal implements Flying {
    @Override
    public void fly() {
        System.out.println("The bird is flying");
    }
}
```