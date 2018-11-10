package generics;
public class TestPair
{
    public static void main(String[] args) {
        Pair<Integer> o = new Pair<>();
        Pair<Integer> o2 = new Pair<>(11, 12);
        
        o.setFirst(5);
        o.setSecond(6);
        System.out.println("o first: " + o.getFirst());
        System.out.println("o second: " + o.getSecond());
        
        System.out.println("o2 first: " + o2.getFirst());
        System.out.println("o2 second: " + o2.getSecond());

    }
}