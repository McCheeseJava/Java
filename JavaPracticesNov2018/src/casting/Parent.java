package casting;
public class Parent {
     public Parent doStuff(int z)
     {
		 return this;
	 }
 }

 class Child extends Parent {

	 /*Child o;

	 Parent o2 =  o;

	 if the above two statements are legal, why isn't this statement legal as well:

	 public Child doStuff(int z)
	 {
		 return this;

     }
     */

	 public Parent doStuff(int z)
	 {
		 return this;
	 }
 }



 /*you cannot change the return type of a method when overriding it*/
