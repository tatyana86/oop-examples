```
public class General implements Serializable, Cloneable {

    // попытка присваивания
    public General assignmentAttempt(General target, General source) {
        if (target.getClass().isAssignableFrom(source.getClass())) {
            return target;
        }
        
        return new None();
    }

    // ..
}

class Any extends General {
    // ..
}

final class None extends Any {
    
}
```