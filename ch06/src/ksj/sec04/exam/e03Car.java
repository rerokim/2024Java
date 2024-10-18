package ksj.sec04.exam;

public class e03Car {
	//필드 
	int gas;
	
	//생성자 
	
	//메소드 
	void setGas(int gas) {
		this.gas = gas;
	} //리턴값 없는 메소드로 매개값 받아서 gas 필드값 변
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다. "); 
			return false;
		}
		System.out.println("gas가 있습니다. "); 
		return true;
	}
	
	
	void run() { //리턴값 없는 메소드  gas필드값 0이면 리턴문으로 메소드 강제종료 
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량 :" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량 :" + gas + ")");
				return;
			}
		}
	}
}

