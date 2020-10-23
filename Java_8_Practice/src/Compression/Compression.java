public class Compression {
    public void compression (String a){
        int n = a.length();
        for (int i=0; i<n; i++) {
            int count = 1;
            while (i < n-1 && a.charAt(i) == a.charAt(i+1)){
                count++;
                i++;
            }
            System.out.print(a.charAt(i));
            System.out.print(count);

        }
    }

    public static void main(String[] args) {
        new Compression().compression("yyyxxxxzzzzz");
    }
}