package generics;
public class Pair<U> 
{
   private U first;
   private U second;

   public Pair() { first = null; second = null; }
   public Pair(U first, U second) { this.first = first;  this.second = second; }

   public U getFirst() { return first; }
   public U getSecond() { return second; }

   public void setFirst(U newValue) { first = newValue; }
   public void setSecond(U newValue) { second = newValue; }
   
   public String toString() { return "(" + first + ", " + second + ")"; }
   
   public static <U> Pair<U> makePair(Class<U> cl)
   {
      try { return new Pair<>(cl.newInstance(), cl.newInstance()); }
      catch (Exception ex) { return null; }
   }        
}

