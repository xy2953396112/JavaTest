package xzh_7_18_Sort;

import java.util.ArrayList;
import java.util.List;

public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Person> list = new ArrayList<Person>();
		list.add(new Person(4,"a",20));
		list.add(new Person(31,"b",15));
		list.add(new Person(2,"c",21));
		SortByIdAsc si = new SortByIdAsc();
		si.sort(list);
		
		for(int i=0;i<list.size();i++)
		{
			int id = list.get(i).getId();
			System.out.println(id);
		}
	}

}
