package ksj.sec06.exam05.package2;
//패키지 다름

import ksj.sec06.exam05.package1.e05A;

public class e05C {
	public e05C() {
		e05A a = new e05A();
		a.field1 = 1;     //(o)
		//a.field2 = 1;   //(x)
		//a.field3 = 1;   //(x)
		
		a.method1();     //(o)
		//a.method2();   //(x)
		//a.method3();   //(x)
	}
}

