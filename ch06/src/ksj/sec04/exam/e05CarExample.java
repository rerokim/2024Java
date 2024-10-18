package ksj.sec04.exam;

public class e05CarExample {
	public static void main(String[] args) {
		e05Car myCar = new e05Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도 : " + speed + "km/h");
	}
}
