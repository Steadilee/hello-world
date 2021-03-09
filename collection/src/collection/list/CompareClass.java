package collection.list;

import java.util.Comparator;

public class CompareClass implements Comparator<StudentVO>{

	@Override
	public int compare(StudentVO o1, StudentVO o2) {
		
		int result = 0;
		
		if(o1.getHeight() > o2.getHeight()) {
			result = 1;
		} else if(o1.getHeight() < o2.getHeight()) {
			result = -1;
		} else {
			result = 0;
		}
			
		return result;
	}

}
