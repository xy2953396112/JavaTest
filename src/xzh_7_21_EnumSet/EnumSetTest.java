package xzh_7_21_EnumSet;

import java.util.EnumSet;
import java.util.Iterator;

enum FontConstant{
	Plain,Bold,Hello;
}
public class EnumSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		EnumSet<FontConstant> enumSet = EnumSet.of(FontConstant.Plain,FontConstant.Bold);
	
		showEnumSet(enumSet);
		
		showEnumSet(EnumSet.complementOf(enumSet));
	}
	public static void showEnumSet(EnumSet<FontConstant> enumSet)
	{
		for(Iterator<FontConstant> iter = enumSet.iterator();iter.hasNext();)
		{
			System.out.println(iter.next());
		}
	}

}
