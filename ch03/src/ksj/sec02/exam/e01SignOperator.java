package ksj.sec02.exam;

public class e01SignOperator {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		byte b = 100;
		//byte result3 = -b;  //byte 부호연산하면 int 로 바뀜 //컴파일에러 
		int result3 = -b; 
		System.out.println("result3 = " + result3);

	}
}

