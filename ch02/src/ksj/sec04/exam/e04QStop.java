package ksj.sec04.exam;

public class e04QStop {
	public static void main(String[] args) throws Exception {
		int keyCode;

		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {  				       
				break;		//keyCode 113일 경우 while 중지
			}
		}
		
		System.out.println("종료");
	}
}

