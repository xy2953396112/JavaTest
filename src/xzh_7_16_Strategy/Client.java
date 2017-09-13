package xzh_7_16_Strategy;

public class Client {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Add add = new Add();            //¼Ó·¨²ßÂÔ 
		
        Environment en = new Environment(add);
        
        System.out.println(en.calculate(4, 6));
	}

}
