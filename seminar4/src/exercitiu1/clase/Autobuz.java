package exercitiu1.clase;

import clase.MijlocTransport;

public class Autobuz extends MijlocTransport {

    public Autobuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Autobuz "+ this.nrInmatriculare);
    }

}
