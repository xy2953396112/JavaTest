package xzh_7_18_Generic;

public class GenericTest<T1,T2> {

	T1 f1;
	T2 f2;
	
	public T1 getF1() {
		return f1;
	}

	public void setF1(T1 f1) {
		this.f1 = f1;
	}

	public T2 getF2() {
		return f2;
	}

	public void setF2(T2 f2) {
		this.f2 = f2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      GenericTest<String,Integer> gen = new GenericTest<String, Integer>();
      
      gen.setF1("Ğì³¯êÍ");
      gen.setF2(509);
      
      System.out.println(gen.getF1());
      System.out.println(gen.getF2());
	} 

}
