package ksj.sec03.exam;

public class e04Car {
	//필드 
	String company = "현대자동차 ";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 
	e04Car() {
	}
	
	e04Car(String model) {
		this(model, null, 0);                 //호출
	}
	
	e04Car(String model, String color) {
		this(model, color, 0);                //호출 
	}
	
	e04Car(String model, String color, int maxSpeed) {  //여기로 
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

