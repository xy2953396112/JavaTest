package xzh_7_21_Varargs;

public class VarargsTest {

	public static int sum(int... nums){                 //...代表可变参数
		int sum = 0;
		for(int num : nums)
		{
			sum = num + sum;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int result = sum(1,2);
       
       System.out.println(result);
       
       result = sum(1,2,3,4);
       
       System.out.println(result);
	}

}
