package clinic.programming.training.override;

import java.io.IOException;

public class ChildTest extends Test {

	private String t;
	public ChildTest() {
		super();
		System.out.println("from Child Class");
	}

	@Override
	final public void thisMethod() {
		new ChildTest();
		
	}
	
	@Override
	public void test() throws IOException {
		System.out.println("Hi from Child");
        super.thisMethod();

	}
	
	public static void main(String[] args) {
		ChildTest a = new ChildTest();
        System.out.println(a.t);
        //super.thisMethod();
        try{
        	a.test();
        } catch (IOException e){
        	e.printStackTrace();
        }
	}

}
