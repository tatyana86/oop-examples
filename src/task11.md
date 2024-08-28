В Java поддерживается множественная реализация интерфейсов, но множественное наследование не допускается.

Класс None можно унаследовать от Any:
```
public class General implements Serializable, Cloneable {
    // ..
}

class Any extends General {
    // ..
}

final class None extends Any {
    
}
```