package exercitiu1.clase;

import clase.MijlocTransport;

public class Troleibuz extends MijlocTransport {
    public Troleibuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Troleibuz "+this.nrInmatriculare);
    }
}
