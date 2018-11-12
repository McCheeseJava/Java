public class Test
{
	public static void main(String args[])
	{
		Producer p1 = new Producer ("Passenger: Wake up and take me to Hilton");
	        Thread  prod1 = new Thread (p1);
		prod1.start(); 
	        
	        Producer p2 = new Producer("Cabbie: Yes Mam");
		Thread prod2 = new Thread(p2);		
	        prod2.start();
	        
	        
	        Producer p3 = new Producer("Cabbie: Now Arriving Hilton");
		Thread prod3 = new Thread (p3);
		prod3.start();

	        
	        Producer p4 = new Producer("Passenger: Thank you");
                Thread prod4 = new Thread (p4);
                prod4.start();

	        
	        Producer p5 = new Producer("Cabbie: you have a nice day now");
                Thread prod5 = new Thread (p5);
                prod5.start(); 

	        
	        
	        
	        Consumer c1 = new Consumer();
		Thread   cons1 = new Thread(c1);	
		cons1.start(); 
	        
	        
	        Consumer c2 = new Consumer();
		Thread cons2 = new Thread (c2);
		cons2.start();
	        
	        Consumer c3 = new Consumer();
                Thread cons3 = new Thread(c3);
		cons3.start();
		
		Consumer c4 = new Consumer();
                Thread cons4 = new Thread(c4);
                cons4.start();	
                
                Consumer c5 = new Consumer();  
                Thread cons5 = new Thread(c5); 
                cons5.start(); 
		
	}

}

