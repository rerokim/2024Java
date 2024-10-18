package ksj.sec05.exam;

public class e02CalculatorExample {
	public static void main(String[] args) {
		double result1 = 10 * 10 * e02Calculator.pi;
		int result2 = e02Calculator.plus(10, 5);
		int result3 = e02Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}
