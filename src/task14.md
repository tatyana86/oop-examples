```
public class General implements Serializable, Cloneable {

    // сложение
    public <T extends General> T add(T other) { // .. }
    
}

class Vector<T extends General> {

    T[] vector;
    
    public Vector(T[] vector) {
        this.vector = vector;
    }

    public Vector<T> add(Vector<T> other) {
    
        if(vector.length != other.vector.length) {
            return null;
        }

        T[] result = Arrays.copyOf(vector, vector.length);
        for(int i = 0; i < vector.length; i ++) {
            result[i] = vector[i].add(other.vector[i]);
        }

        return new Vector<>(result);
    
    }

}
```