package simple_factory;

public class Troleibuz extends MijlocTranport {

	public Troleibuz(String numarInmatriculare) {
		super(numarInmatriculare);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Troleibuz [getNumarInmatriculare()=");
		builder.append(getNumarInmatriculare());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
	

}
