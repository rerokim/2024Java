package ksj.sec04.exam;

public class e06CalculatorExample {
	public static void main(String[] args) {
		e06Calculator myCalcu = new e06Calculator();
		
		//정사각형 넓이 구하기 
		double result1 = myCalcu.areaRectangle(10);

		//직사각형 넓이 구하기 
		double result2 = myCalcu.areaRectangle(10, 20);
		
		//결과 
		System.out.println("정사각형 넓이 =" + result1);
		System.out.println("사각형 넓이 =" + result2);
	}
}

