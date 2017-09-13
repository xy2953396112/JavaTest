package xzh_7_18_genericTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericTest<T> {
    
	T  foo;
	
    
	public T getFoo() {
		return foo;
	}


	public void setFoo(T foo) {
		this.foo = foo;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         GenericTest<? extends List> gen = null;
         
         gen = new GenericTest<LinkedList>();
         gen = new GenericTest<ArrayList>();
         
         GenericTest<String> ge = new GenericTest<String>();
         ge.setFoo("Ðì³¯êÍ");
         
         GenericTest<? extends Object> ge1 = ge;
         System.out.println(ge1.getFoo());
         
	}

}
