package memleak;
public class SObject {
    public class Rep { public int n; }
    public Rep rep = new Rep();
 
    public SObject() { rep.n = 0; }
 
    public void swap(SObject x) {
        Rep temp = rep;
        rep = x.rep;
        x.rep = temp;
    }
}
