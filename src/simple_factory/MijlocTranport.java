package simple_factory;

public abstract class MijlocTranport {
	private String numarInmatriculare;

	public String getNumarInmatriculare() {
		return numarInmatriculare;
	}

	public void setNumarInmatriculare(String numarInmatriculare) {
		this.numarInmatriculare = numarInmatriculare;
	}

	public MijlocTranport(String numarInmatriculare) {
		this.numarInmatriculare = numarInmatriculare;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MijlocTranport [numarInmatriculare=");
		builder.append(numarInmatriculare);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
