package ksj.sec01.exam;

public class e04VariableScope {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			
			int v2;
			v2 = v1 - 10;
		}
		
		//에러 발생함: v2 변수 사용 불가 
		int v3 = v1 + v2 + 5;
	}
}
