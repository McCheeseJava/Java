package generics;
public class GenDemo { 
  public static void main(String args[]) { 
    // Create a Gen reference for Integers.  
    Gen<Integer> iOb =  new Gen<>(88);
    Gen<Double> dOb = new Gen<>(.5);
    Gen<String> strOb = new Gen<>("Generics Test");  
    // Create a Gen<Integer> object and assign its 
    // reference to iOb.  Notice the use of autoboxing  
    // to encapsulate the value 88 within an Integer object.  
    // Show the type of data used by iOb. 
    iOb.showType(); 
    dOb.showType();
    strOb.showType(); 
 
    System.out.println("value for iOb.getob(): " + iOb.getob()); 
    System.out.println("value for dOb.getob(): " + dOb.getob());
    System.out.println("value for strOb.getob(): " + strOb.getob());
  } 
}
