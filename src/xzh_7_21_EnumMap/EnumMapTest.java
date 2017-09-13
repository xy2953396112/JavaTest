package xzh_7_21_EnumMap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Map<Action,String> map = new  EnumMap<Action,String>(Action.class);
		
		map.put(Action.SHOOT, "���");
		map.put(Action.TURN_RIGHT, "��ת");
		map.put(Action.TURN_LEFT, "��ת");
		
		for(Action action : Action.values())
		{	
			System.out.println(map.get(action));
		}
	}

}
enum Action
{
	TURN_LEFT,TURN_RIGHT,SHOOT;
}