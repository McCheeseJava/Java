package headfirst.strategy;

public class DrawingDuck extends Duck {
	
	private int hash = 44;

	public DrawingDuck() {
		// These two class variables are inherited from class Duck.
		// Class Duck has these two variables set to null.
		// They must be instantiated before they can be used.
		flyBehavior = new DrawingDuckFlyBehavior();
		quackBehavior = new DrawingDuckQuakBehavior();
	}

	public void display() {
		System.out.println("I'm just a drawing!");
	}

	public void swim() {
		System.out.println("I'm just a drawing. I can't swim");
	}

	public void hangInFrame() {
		System.out.println("I'm a drawing so I need to be hanged on a frame!");
	}
	
	@Override
	public int hashCode() {
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof DrawingDuck)) {
			return false;
		}
		DrawingDuck other = (DrawingDuck) obj;
		return hash == other.hash;
	}

	public static void main(String args[]) {
		Duck d = new DrawingDuck();
		d.performQuack();
		d.performFly();
		d.swim();
		// The method hangInFrame() is undefined for the type Duck
		// d.hangInFrame();
		new DrawingDuck().hangInFrame();

	}
}

class DrawingDuckFlyBehavior implements FlyBehavior {
	public void fly() {
		System.out.println("I'm just a drawing. I can't fly!");
	}
}

class DrawingDuckQuakBehavior implements QuackBehavior {
	public void quack() {
		System.out.println("I'm just a drawing. I can't quack!");
	}
}
