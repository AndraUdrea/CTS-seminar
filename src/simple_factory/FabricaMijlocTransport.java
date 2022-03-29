package simple_factory;

public class FabricaMijlocTransport {

	public static MijlocTranport getMijlocTransport(TipTransport tipTransport, String numarInmatriculare) {
		switch(tipTransport) {
		case TRAMVAI:
			return new Tramvai(numarInmatriculare);
		case AUTOBUZ:
			return new Autobuz(numarInmatriculare);
		case TROLEIBUZ:
			return new Troleibuz(numarInmatriculare);
		default:
			return null;
		}
	}
}
