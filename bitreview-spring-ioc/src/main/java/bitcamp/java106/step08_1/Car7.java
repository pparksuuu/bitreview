package bitcamp.java106.step08_1;

import java.sql.Date;

import javax.annotation.Resource;

// 의존 객체 Engine 주입 - 인스턴스 변수에 @Autowired를 붙여도 된다.
public class Car7 {
	String model;
	String maker;
	int cc;
	boolean auto;
	Date createdDate;
	
	// 이 애노테이션은 스프링 프레임워크가 아닌 자바에서 제공
	@Resource(name="e1")
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
