package ksj.sec06.exam04.package2;  
//패키지 다름!!!

import ksj.sec06.exam04.package1.e04A;

public class e04C {
	// 필드 
	e04A a1 = new e04A(true);   //(o) 
	// A a2 = new A(1);         //(x) default 접근불가 //컴파일에러 
	// A a3 = new A("문자열 ");   //(x) private 접근불가 //컴파일에러 
}
