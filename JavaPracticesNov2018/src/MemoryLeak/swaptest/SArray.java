public class SArray {
    private SObject[] contents;
 
    public SArray(int max) { contents = new SObject[max]; }
    public void swapAt(SObject x, int i) { contents[i].swap(x); }
    public void insertAt(SObject x, int i) { contents[i] = x; }
}
