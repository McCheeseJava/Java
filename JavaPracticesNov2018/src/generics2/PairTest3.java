package generics2;
public class PairTest3
{
   public static void main(String[] args)
   {
      Manager ceo = new Manager("Gus Greedy", 800000, 2003, 12, 15);
      Manager cfo = new Manager("Sid Sneaky", 600000, 2003, 12, 15);
      Pair<Manager> buddies = new Pair<>(ceo, cfo);      
      ceo.setBonus(1000000);
      cfo.setBonus(500000);
          
      Manager[] managers = { ceo, cfo };   
      
      Employee one = new Employee("John Smith", 1800000, 2014, 12, 15);
      Employee two = new Employee("Carl Haage", 1800000, 2014, 12, 15);
      Pair<Employee> e = new Pair<>(one, two);
      

      
      Pair<Employee> result = new Pair<>();
      System.out.println("first: " + result.getFirst().getName() 
         + ", second: " + result.getSecond().getName());
      System.out.println("first: " + result.getFirst().getName() 
         + ", second: " + result.getSecond().getName());
   }

}
