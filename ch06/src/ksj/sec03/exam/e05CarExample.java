package ksj.sec03.exam;

public class e05CarExample {
	public static void main(String[] args) {
		e04Car car1 = new e04Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		e04Car car2 = new e04Car("자가용 ");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		e04Car car3 = new e04Car("자가용 ", "빨강 ");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		e04Car car4 = new e04Car("택시 ", "검정 ", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}
}

