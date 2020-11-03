package injectsimplevalues;

import java.util.Date;

public class InjectSimpleValues {

    private String name;
    private int age;
    private float height;
    private boolean isSpringFun;
    private Long ageInSeconds;
    private Date date;
    
	public int getAge() {
		return age;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Long getAgeInSeconds() {
		return ageInSeconds;
	}
	public void setAgeInSeconds(Long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public boolean isSpringFun() {
		return isSpringFun;
	}
	public void setSpringFun(boolean isSpringFun) {
		this.isSpringFun = isSpringFun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    
	
}
