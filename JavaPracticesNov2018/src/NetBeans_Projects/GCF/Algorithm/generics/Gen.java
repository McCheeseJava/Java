package generics;
public class Gen<T> { 
  private T ob; 
  Gen(T o) { 
    ob = o; 
  }     
  T getob() { 
    return ob; 
  }   
  void showType() { 
    System.out.println("Type of T is " + 
                       ob.getClass().getName()); 
  } 
} 