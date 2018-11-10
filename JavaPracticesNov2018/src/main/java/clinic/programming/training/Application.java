package clinic.programming.training;

import java.util.*;
import org.apache.commons.lang3.*;

public class Application {

	private String name;

	public int countWords(String words) {
		String[] separateWords = StringUtils.split(words, ' ');
		return (separateWords == null) ? 0 : separateWords.length;
	}

	public Application(String n) {
		name = n;
	}

	public Application() {
		System.out.println("Inside Application");
	}

	public boolean equals(Object o) {
		Application m = (Application) o;
		if (m.name != null) {
			return true;
		}
		return false;
	}

	// method main(): ALWAYS the APPLICATION entry point
	public static void main(String[] args) {
		System.out.println("Starting Application");
		Application app = new Application();

		Application m1 = new Application("guitar");
		Application m2 = new Application("tv");
		System.out.println(m2.equals(m1));

		List p = new ArrayList();
		p.add(7);
		p.add(1);
		p.add(5);
		p.add(1);
		p.remove(3);
		System.gc();
		System.out.println(p);

		String[] sa = { "tom ", "jerry " };
		for (int x = 0; x < 3; x++) {
			for (String s : sa) {
				System.out.print(x + " " + s);
				if (x == 1) {
					break;
				}
			}
		}
		
		int i = 5;
		System.out.println(++i);
		//System.out.println(i++);
		//System.out.println(i++);
		

	}
}
