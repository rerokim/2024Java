package ksj.sec02.exam;

public class e05CharOperation {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2 + 1;    //char 이 산술연산에 사용되면 int 로 변환됨 //연산결과값 int 
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		//System.out.println("c3: " + c3);
	}
}