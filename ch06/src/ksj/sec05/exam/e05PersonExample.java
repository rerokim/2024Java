package ksj.sec05.exam;

public class e05PersonExample {
	public static void main(String[] args) {
		e05Person p1 = new e05Person("123456-1234567", "김신지");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";
		//p1.ssn = "654321-7654321";
		p1.name = "홍길동 ";
	}
}
