package generics2;

public class Pair<T extends Employee> {

    private T first;
    private T second;
    private T msg;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public void defaultMsg(Pair<?> msg) {
        this.msg = msg.msg;
    }
    
    public T getFirst() {
         return first;
    }

    public T getSecond() {
            return second;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

    public void setSecond(T newValue) {
        second = newValue;
    }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }

 
}
