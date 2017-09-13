package xzh_8_4_DefineAnnotation;

public class DefineAnnotation {
    
	public void method(){
		
		System.out.println("Annotation");
	}
	@AnnotationTest(value1="Ðì³¯êÍ")
	public static void main(String[] args){
		
		DefineAnnotation da = new DefineAnnotation();
		
		da.method();
	}
}
