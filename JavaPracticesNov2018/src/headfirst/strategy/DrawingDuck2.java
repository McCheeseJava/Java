// Here is the implementation. The problem with this class is that there is little code reuse.
// Every subclass of Duck will have to implement the interfaces. Which kinds of make sense
// because we agree that the methods that went into the Behavior interface is always changing 
// between subclasses. No composition being used.

package headfirst.strategy;

public class DrawingDuck2 extends Duck2 implements Behavior {

	private int hash = 44;

	public void fly() {
		System.out.println("I'm just a drawing. I can't fly!");
	}

	public void quack() {
		System.out.println("I'm just a drawing. I can't quack!");
	}

	public void display() {
		System.out.println("I'm just a drawing!");
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
		return hash == other.hashCode();
	}

	public static void main(String args[]) {
		DrawingDuck2 d = new DrawingDuck2();	
		d.fly();
		d.quack();
		d.swim();
		d.getNumberOfWings();
		d.display();
		d.hangInFrame();

	}

}
