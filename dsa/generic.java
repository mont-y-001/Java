// Generics allow us to create classes, interfaces, and 
// methods that work with different data types while maintaining type safety.
class Box<T> {
    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}
public class generic{
public static void main(String[] args) {
    
    Box<Integer> obj = new Box<>();
    obj.setValue(10);
    
    System.out.println(obj.getValue());
}
}