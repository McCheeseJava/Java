package generics;
public class MyDemo {
    public static void main(String[] args) {
        Gen<String> o = new Gen<>("Trying to learn Generics"); 
        System.out.println(o.getob());
        o.showType();
    }
    
}
