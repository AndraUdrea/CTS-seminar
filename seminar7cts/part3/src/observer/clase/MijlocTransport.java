package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class MijlocTransport {
    private List<ICalator> listaCalatori;
    private int numarLinie;

    public MijlocTransport(int numarLinie) {
        this.numarLinie = numarLinie;
        this.listaCalatori = new ArrayList<>();
    }

    public void adaugaCalator(ICalator calator) {
        this.listaCalatori.add(calator);
    }
    public void stergeCalator(ICalator calator) {
        this.listaCalatori.remove(calator);
    }
    public void trimiteMesaj(String mesaj) {
        for (ICalator c: listaCalatori) {
            c.primireMesaj(mesaj);
        }
    }

    public void trimiteMesajPlecareCapatLinie() {
        trimiteMesaj("Am plecat din capatul liniei " + this.numarLinie);
    }
}
