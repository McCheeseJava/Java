package generics;
class NumericFns<T extends Number> {  
  private T num; 
  
  NumericFns()
  {
      this(null);
  }
  NumericFns(T n) {  
    num = n; 
  }    
  
  public T getNum()
  {
      return num;
  }
  public double reciprocal() { 
    return 1 / num.doubleValue(); // Error! 
  }  
  public double fraction() { 
    return num.doubleValue() - num.intValue(); // Error! 
  } 
   
  public boolean equalTest(NumericFns<?> ob)          
/* if i change ? to T the compilation of main method will fail          
because T means I can only compare objects of NumericFns objects of similar types (Double and Double)
 ? allows me to compare objects of class Double with objects of class Long
error: incompatible types: NumericFns<Double> cannot be converted to NumericFns<Long>
        System.out.println("comparing integer values of " + o.getNum() + " and " + o3.getNum() + " is: " + o.equalTest(o3));
*/
  {
       if ( num.intValue() == ob.num.intValue())
           return true;
       return false;
  } 
  
  
} 
