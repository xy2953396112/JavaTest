package xzh_7_18_Sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByIdAsc implements Sorter {

	@Override
	public void sort(List<Person> list) {
		// TODO Auto-generated method stub
		Collections.sort(list,new MyComparator());
	}
	
	
     
}

class MyComparator implements Comparator<Person>{

	
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		return p1.getId() - p2.getId();
	}
	
	
	
}
