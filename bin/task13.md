Варианты скрытия методов в Java:

1. метод публичен в родительском классе А и публичен в его потомке B:

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

2. метод публичен в родительском классе А и скрыт в его потомке B - не поддерживается.

3. метод скрыт в родительском классе А и публичен в его потомке B:

```
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
        super.sayType(); // вызов родительского метода
    }
	
}

public class Task13 {
    public static void main(String[] args) {
        Person w = new Woman();
        w.sayType();
    }
}
```

Вывод будет такой:
```
It's class Woman
It's class Person
Hello from Person
```

Таким образом, с помощью ключевого слова super получен доступ сначала к методу, определенному в родительском классе, а затем и к приватному методу в нем.

4. метод скрыт в родительском классе А и скрыт в его потомке B - в данном случае скрытие методов не работает внутри пакета, но запрещает наследование за пределами пакета:

```
class Person {
    protected void sayType() {
        System.out.println("It's class Person");
    }
}

class Woman extends Person {
    @Override
    protected void sayType() {
        System.out.println("It's class Woman");
    }
}
```
Формально можем объявить метод ```sayType()``` как приватный (private), тогда и внутри пакета метод будет скрыт для других классов, а в его потомке B создать еще один метод ```private sayType()```. Правда, в таком случае нельзя говорить о наследовании как таковом.

