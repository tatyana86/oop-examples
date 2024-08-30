В Java запрет переопределения методов в потомках реализуется с помощью ключевого слова ```final```.

Например,
```
public class General implements Serializable, Cloneable {
    // сравнение объектов
    public final boolean equals(General other) {
        return super.equals(other);
    }

    // ...
}

class Any extends General {
    // при попытке переопределения метода, помеченного как final, компилятор выдаст ошибку
    @Override
    public final boolean equals(General other) {
        // ...
    }
}
```