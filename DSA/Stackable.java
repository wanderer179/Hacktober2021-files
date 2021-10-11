package DSA;

public interface Stackable <T>{
    T pop();
    void push(T t);
    int size();
    boolean isEmpty();
}
