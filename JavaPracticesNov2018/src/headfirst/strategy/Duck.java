package headfirst.strategy;

import java.util.Objects;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
 
	public Duck() {
	}
 
	public void setFlyBehavior (FlyBehavior fb) {
		flyBehavior = fb;
	}
 
	@Override
	public int hashCode() {
		return Objects.hash(flyBehavior, quackBehavior);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Duck)) {
			return false;
		}
		Duck other = (Duck) obj;
		return Objects.equals(flyBehavior, other.flyBehavior) && Objects.equals(quackBehavior, other.quackBehavior);
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
 
	abstract void display();
 
	public void performFly() {
		flyBehavior.fly();
	}
 
	public void performQuack() {
		quackBehavior.quack();
	}
 
	public void swim() {
		System.out.println("Swimming: All ducks float, even decoys!");
	}
}
