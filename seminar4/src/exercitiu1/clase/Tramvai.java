package exercitiu1.clase;

import clase.MijlocTransport;

public class Tramvai extends MijlocTransport {
    public Tramvai(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Tramvai "+this.nrInmatriculare);
    }
}
