package headfirst.strategy;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		new MallardDuck().performQuack();
		new MallardDuck().performFly();
		new MallardDuck().swim();
		
		new RubberDuck().performQuack();
		new RubberDuck().performFly();
		new RubberDuck().swim();
		
	}
}
