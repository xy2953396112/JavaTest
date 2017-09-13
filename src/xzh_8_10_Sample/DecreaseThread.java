package xzh_8_10_Sample;

public class DecreaseThread extends Thread {

	private Sample sample;
	
	public DecreaseThread(Sample sample){
		
		this.sample = sample;
	}
	
	public void run(){
		
		for(int i=0;i<20;i++){
			
			try {
				Thread.sleep((long) (Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				sample.decrease();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 
	}
}
