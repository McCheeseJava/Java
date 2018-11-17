package quickfind;
import java.util.Scanner;

public class QuickFindUF {
    private int id[];    // id[i] = component identifier of i
    
    /**
     * Initializes an empty union–find data structure with {@code n} sites
     * {@code 0} through {@code n-1}. Each site is initially in its own 
     * component.
     *
     * @param  n the number of sites
     * @throws IllegalArgumentException if {@code n < 0}
     */
    public QuickFindUF(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++)
        {
            id[i] = (int) (Math.random() * 100 );
            System.out.println("id[" + i +"] = " + id[i]);
        }
        

    }  
    /**
     * Returns the component identifier for the component containing site {@code p}.
     *
     * @param  p the integer representing one site
     * @return the component identifier for the component containing site {@code p}
     * @throws IndexOutOfBoundsException unless {@code 0 <= p < n}
     */
    // validate that p is a valid index
    private void validate(int p) {
        int n = id.length;
        if (p < 0 || p >= n) {
            throw new IndexOutOfBoundsException("index " + p + " is not between 0 and " + (n-1));
        }
    }

    /**
     * Returns true if the the two sites are in the same component.
     *
     * @param  p the integer representing one site
     * @param  q the integer representing the other site
     * @return {@code true} if the two sites {@code p} and {@code q} are in the same component;
     *         {@code false} otherwise
     * @throws IndexOutOfBoundsException unless
     *         both {@code 0 <= p < n} and {@code 0 <= q < n}
     */
    public boolean connected(int p, int q) {
        validate(p);
        validate(q);
        System.out.println("id[p]: " + id[p] + " id[q]: " + id[q]);
        return id[p] == id[q];
    }
  
    /**
     * Merges the component containing site {@code p} with the 
     * the component containing site {@code q}.
     *
     * @param  p the integer representing one site
     * @param  q the integer representing the other site
     * @throws IndexOutOfBoundsException unless
     *         both {@code 0 <= p < n} and {@code 0 <= q < n}
     */
    public void union(int p, int q) {
        validate(p);
        validate(q);       
        // p and q are already in the same component
        if (id[p] == id[q]) return;

        for (int i = 0; i < id.length; i++)
            if (id[i] == id[p]) id[i] = id[q];
    }
    /**
     * Reads in a sequence of pairs of integers (between 0 and n-1) from standard input, 
     * where each integer represents some site;
     * if the sites are in different components, merge the two components
     * and print the pair to standard output.
     *
     * @param args the command-line arguments
     */
    
    
    public static void main(String[] args) {
        
        QuickFindUF uf = new QuickFindUF(15);
        
        long ustartTime = System.currentTimeMillis();     
        uf.union(9, 12); 
        long uendTime = System.currentTimeMillis(); 
        long totaltime = uendTime - ustartTime;
        System.out.println("time take for calling union method: " + totaltime);
        
        System.out.println("caling if connected method: ");
        System.out.println("result of calling if connected: " + uf.connected(3, 11));        
        
    }

}