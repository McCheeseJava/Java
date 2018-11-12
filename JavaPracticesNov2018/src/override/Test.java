package override;

import java.io.IOException;

public abstract class Test {

	public Test() {
		System.out.println("from Test Class.");
	}
	
	public void thisMethod()
	{
		System.out.println("Hi from Test");
	}
	
	public abstract void test() throws IOException;

}
