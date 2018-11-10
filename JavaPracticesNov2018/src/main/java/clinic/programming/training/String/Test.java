package clinic.programming.training.String;


final class k {}

class Message {
     String msg = "Happy New Year!";
 
     public void print() {
         System.out.println(msg);
     }
}
 
public class Test {
     public static void change(Message m) {
         m = new Message();
         m.msg = "Happy Holidays!";
     }
 
     public static void main(String[] args) {
         Message obj = new Message();
         obj.print();
         change(obj);
         obj.print();
         
         int i = '6';  //print ASCII representation of 6
         System.out.println(i);
         
         int grade = 60;
         //if(grade = 60)
             System.out.println("You passed...");
     }
     
}
