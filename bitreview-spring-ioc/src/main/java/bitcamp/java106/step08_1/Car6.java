package bitcamp.java106.step08_1;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

// 의존 객체 Engine 주입 - 인스턴스 변수에 @Autowired를 붙여도 된다.
public class Car6 {
	String model;
	String maker;
	int cc;
	boolean auto;
	Date createdDate;
	
	@Autowired
	@Qualifier("e2") // 의존 객체가 여러 개 있을 경우, 주입할 의존 객체의 이름을 지정하라!
					// 주의 ! 
					// @Qualifier 애노테이션을 처리할 BeanPostProcessor를 등록해야 한다.
	Engine engine;

	@Override
	public String toString() {
		return "Car6 [model=" + model + ", maker=" + maker + ", cc=" + cc + ", auto=" + auto + ", createdDate="
				+ createdDate + ", engine=" + engine + "]";
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		System.out.println("Car.setEngine()");
		this.engine = engine;
	}
	
	
}