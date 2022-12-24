package ComperSort;

import java.util.Comparator;

class IdComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getId()-o2.getId();
	}
	
}
