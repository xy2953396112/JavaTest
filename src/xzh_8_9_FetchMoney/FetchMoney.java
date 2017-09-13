package xzh_8_9_FetchMoney;

public class FetchMoney {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Bank bank = new Bank();
		
		Thread t1 = new Thread(new MoneyThread(bank));
		
		Thread t2 = new Thread(new MoneyThread(bank));
		
		t1.start();
		
		t2.start();
	}

}

class Bank{
	
	int money = 1000;
	
	public synchronized int getMoney(int num) throws InterruptedException{
		
		if(num<0){
			
			return -1;
		}else if(num>money){
			
			return -2;
		}else{
			
			Thread.sleep(1000);
			
			return money-=num;
		}
		
	}

}

class MoneyThread implements Runnable{
    
	private Bank bank;
	
	public MoneyThread(Bank bank){
		
		this.bank = bank;
	}
	
	public void run() {
		
		try {
			System.out.println(bank.getMoney(800));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}