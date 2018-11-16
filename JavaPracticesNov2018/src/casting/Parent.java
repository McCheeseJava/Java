package casting;
public class Parent {
     public Parent doStuff(int z)
     {
		 System.out.println("hi from parent");
         return new Parent();
	 }
     public static void main(String args[])
	 {
		 System.out.println("from main");
		 

	 }
 }

 class Child extends Parent {

	 //Child o;

	// Parent o2 =  o;

	 //if the above two statements are legal, why isn't this statement legal as well:

	 public Child doStuff(int z)
	 {
		 System.out.println("hi from child");
		 return new Child();

     }

	/* public Parent doStuff(int z)
	 {
		 return this;
	 } */
	
 }



 /*you cannot change the return type of a method when overriding it*/
