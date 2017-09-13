package xzh_8_10_Sample;

class Sample {

	int number;
	
	public synchronized void increase() throws InterruptedException{
		
		if(0 != number){      //while
			
			wait();
		}
		
		number++;
		
		System.out.println(number);
		
		notify();
	}
	
    public synchronized void decrease() throws InterruptedException{
		
		if(0 == number){           //while
			
			wait();
		}
		
		number--;
		
		System.out.println(number);
		
		notify();
	}
}
