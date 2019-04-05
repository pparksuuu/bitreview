package bitcamp.java106.step10_1;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class Car {
	String model;
	String maker;
	int cc;
	boolean auto;
	Date createDate;
	Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", maker=" + maker + ", cc=" + cc + ", auto=" + auto + ", createDate="
				+ createDate + ", engine=" + engine + "]";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public boolean isAuto() {
		return auto;
	}

	public void setAuto(boolean auto) {
		this.auto = auto;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
}
