package ksj.sec05.exam;

public class e04SingletonExample {
	public static void main(String[] args) {
		/*
		Singleton obj1 = new Singleton();  //컴파일에러 
		Singleton obj2 = new Singleton();  //컴파일에러 
		*/
		
		e04Singleton obj1 = e04Singleton.getInstance();
		e04Singleton obj2 = e04Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다. ");
		}
	}
}
