package clinic.programming.training;

import java.util.Objects;

public class Camel  {

	private int weight = 2;

	public String getGait() {
		return " mph, lope";
	}

	void go(int speed) {
		++speed;
		weight++;
		int walkrate = speed * weight;
		System.out.print(walkrate + getGait());
	}

	public static void main(String[] args) {
		new Camel().go(8);
		Camel  a  = new Camel();
		Object b  = new Camel();
		
		System.out.println("are these two objects equal? " + a.equals(b));
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Camel)) {
			return false;
		}
		Camel other = (Camel) obj;
		return weight == other.weight;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		//return Objects.hash(weight);
		return weight;
	}
}
