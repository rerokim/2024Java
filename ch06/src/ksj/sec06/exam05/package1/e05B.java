package ksj.sec06.exam05.package1;
//패키지 동일

public class e05B {
	public e05B() {
		e05A a = new e05A();
		a.field1 = 1;     //(o)
		a.field2 = 1;     //(o)
		//a.field3 = 1;   //(x) private 필드 접근불가 //컴파일에러 
		
		a.method1();    //(o)
		a.method2();    //(o)
		//a.method3();  //(x)  private 메소드 접근불가 //컴파일에러 
	}
}

