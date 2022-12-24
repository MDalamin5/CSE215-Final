package ComperSort;

import java.util.Comparator;

class YearComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getYear()-o2.getYear();
	}
	
}
