package study_IO.filterstream;

import java.io.Serializable;

public class Application4VO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2028914172093177693L;
	private int no;
	private String name;
	private String position;
	private double height;
	private int grade;
	
	public Application4VO() {}
	
	public Application4VO(int no, String name, String position, double height, int grade) {
		
		super();
		this.no = no;
		this.name = name;
		this.position = position;
		this.height = height;
		this.grade = grade;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getNo() {
		return this.no;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	@Override
	public String toString() {
		return "Application4VO [no=" + no + ", name=" + name + ", position=" + position + ", height=" + height
				+ ", grade=" + grade + "]";
	}
}
