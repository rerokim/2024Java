package ksj.sec05.exam;

public class e03Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다. ");
	}
	
	public static void main(String[] args) {
		e03Car myCar = new e03Car(); 
		myCar.speed = 60;
		myCar.run();
	}
}
