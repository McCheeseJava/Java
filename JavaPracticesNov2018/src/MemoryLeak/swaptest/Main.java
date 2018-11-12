public class Main {
    private static final int MAX = 1000000;
 
    public static void main(String[] args) {
        SArray s = new SArray(MAX);
 
        for (int i = 0; i < MAX; i++) { s.insertAt(new SObject(), i); }
        System.out.println("Done with initial input");
        for (int i = 0; i < MAX; i++) { s.insertAt(new SObject(), i); }
        System.out.println("Done with assignment overwrite");
        for (int i = 0; i < MAX; i++) { s.swapAt(new SObject(), i); }
        System.out.println("Done with swapping overwrite");
    }
}
