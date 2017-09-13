package xzh_8_4_Target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface TargetTest {
  
	String value();
}
