package xzh_8_4_MyReflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
   
	String hello() default "�쳯��";
	
	String world();
}
