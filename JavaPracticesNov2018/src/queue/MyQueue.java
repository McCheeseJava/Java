package queue;
import java.util.*;

public class MyQueue<E> {  

    private LinkedList<E> queue = new LinkedList<>();

    MyQueue(){
    }
    
    MyQueue(E item){
        queue.addLast(item);        
    }
    
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void enqueue(E item) {
        queue.addLast(item);
    }

    public E dequeue() {
        return queue.poll();
    }

    public static void main(String[] args) {
        MyQueue<Integer> ints = new MyQueue<>();
        MyQueue<String> str = new MyQueue<>();
        MyQueue<String> str2 = new MyQueue<>("Test");
        
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 209);
            ints.enqueue(a[i]);
            str.enqueue("A"+ (int) (Math.random() * 209));
        }
        for (int i = 0; i < a.length; i++)
            System.out.println("Added to Q: " + a[i]);
        System.out.println("ints Q Size:" + ints.size());
        System.out.println("str Q Size:"  + str.size());
        
        while (!ints.isEmpty())
            System.out.println(ints.dequeue());
        
        while(!str.isEmpty())
            System.out.println(str.dequeue());
    }

}
