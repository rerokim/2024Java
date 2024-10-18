package ksj.sec06.exam02.mycompany;

import ksj.sec06.exam02.hankook.*;
import ksj.sec06.exam02.hyndai.e02HyundaiEngine;
import ksj.sec06.exam02.kumho.*;

public class Car {
	//필드 
	e02HyundaiEngine engine = new e02HyundaiEngine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	ksj.sec06.exam02.hankook.Tire tire3 = new ksj.sec06.exam02.hankook.Tire();
	ksj.sec06.exam02.kumho.Tire tire4 = new ksj.sec06.exam02.kumho.Tire();
}
