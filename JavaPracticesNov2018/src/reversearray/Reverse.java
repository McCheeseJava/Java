package reversearray;

public class Reverse {

    public static void main(String[] args) {
        char c[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n'};
        int counter = 0;

        for (int i = (c.length - 1); i >= 0; i--) {
            c[counter] = c[i];
            counter++;
            System.out.println(c[i] + " " + i + " " + counter);
        }

    }

}
