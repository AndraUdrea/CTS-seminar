package simple_factory;

public class Tramvai extends MijlocTranport{

	public Tramvai(String numarInmatriculare) {
		super(numarInmatriculare);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tramvai [getNumarInmatriculare()=");
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
