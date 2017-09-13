package xzh_7_21_Enum;

public enum EnumTest {
    
	a("x"),b("z"),c("h");
	
	private String value;
	
	public String getValue(){
		return value;
	}
	EnumTest(String value)
	{
		this.value = value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         EnumTest en = EnumTest.c;
         System.out.println(en.getValue());
	}

}
