package main;

import simple_factory.FabricaMijlocTransport;
import simple_factory.MijlocTranport;
import simple_factory.TipTransport;
import singleton.Singleton;

public class Main {

	public static void main(String[] args) {
		//singleton
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		
		//simple factory
		MijlocTranport autobuz = FabricaMijlocTransport.getMijlocTransport(TipTransport.AUTOBUZ, "1234");
		MijlocTranport tramvai = FabricaMijlocTransport.getMijlocTransport(TipTransport.TRAMVAI, "567");
		MijlocTranport troleibuz = FabricaMijlocTransport.getMijlocTransport(TipTransport.TROLEIBUZ, "89");
		
		System.out.println(autobuz.toString());
		System.out.println(tramvai.toString());
		System.out.println(troleibuz.toString());
		
		
		
		
		
	}

}
