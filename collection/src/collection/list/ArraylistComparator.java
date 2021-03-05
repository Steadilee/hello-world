package collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArraylistComparator {
	
	public static void main(String[] args) {
	
		List<StudentVO> studentList = new ArrayList<>();
		
		studentList.add(new StudentVO(4,"채치수", 197));
		studentList.add(new StudentVO(11,"서태웅", 187));
		studentList.add(new StudentVO(10,"강백호", 188));
		studentList.add(new StudentVO(14,"정대만", 184));
		studentList.add(new StudentVO(7,"송태섭", 168));
		
		for(StudentVO student : studentList) {
			System.out.println(student);
		}
		
		studentList.sort(new CompareClass());
		System.out.println("키를 오름차순으로 정렬");
		for(StudentVO student : studentList) {
			System.out.println(student);
		}
		
		studentList.sort(new Comparator<StudentVO>() {

			@Override
			public int compare(StudentVO o1, StudentVO o2) {
				return o1.getHeight() < o2.getHeight()? 1: -1;
			}
		});
		
		System.out.println("키를 내림차순으로 정렬");
		for(StudentVO student : studentList) {
			System.out.println(student);
		}
	}
	
	
	
	
}
