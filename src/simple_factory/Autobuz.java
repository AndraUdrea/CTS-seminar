package simple_factory;

public class Autobuz extends MijlocTranport{

	public Autobuz(String numarInmatriculare) {
		super(numarInmatriculare);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuz [getNumarInmatriculare()=");
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
