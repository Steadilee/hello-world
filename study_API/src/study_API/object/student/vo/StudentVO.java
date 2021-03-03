package study_API.object.student.vo;

public class StudentVO {

	/*	학생 정보 관리 하는 VO 클래스 */
	
	private int number;
	private String name;
	private double height;
	private String hobby;
	
	//	기본생성자
	public StudentVO() {}
	
	//	모든 필드를 초기화하는 생성자
	public StudentVO(int number, String name, double height, String hobby) {
		
		this.number = number;
		this.name = name;
		this.height = height;
		this.hobby = hobby;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHabbit(String habbit) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		
		return "Student " + number + "번, 이름 " + name + "의 키는 " + height + "cm이고, 취미는 " + hobby + "다.";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((hobby == null) ? 0 : hobby.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		StudentVO other = (StudentVO) obj;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height)) {
			return false;
		}
		if (hobby == null) {
			if (other.hobby != null) {
				return false;
			}
		} else if (!hobby.equals(other.hobby)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (number != other.number) {
			return false;
		}
		return true;
	}

	
	
	
	
	
	
	
	
}
