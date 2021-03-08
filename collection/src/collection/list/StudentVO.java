package collection.list;

public class StudentVO {
	private int num;
	private String name;
	private double height;

	
	public StudentVO() {}

	public StudentVO(int num, String name, double height) {
		this.num = num;
		this.name = name;
		this.height = height;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	@Override
	public String toString() {
		return "StudnetVO [num=" + num + ", name=" + name + ", height=" + height + "]";
	}
	
	
	
	
	
	
}
