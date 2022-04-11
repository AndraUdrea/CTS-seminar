package observer.main;

import observer.clase.Calator;
import observer.clase.ICalator;
import observer.clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport mijlocTransport = new MijlocTransport(125);
        ICalator c1 = new Calator("Ana");
        ICalator c2 = new Calator("Maria");
        ICalator c3 = new Calator("Mihai");

        mijlocTransport.adaugaCalator(c1);
        mijlocTransport.adaugaCalator(c2);
        mijlocTransport.trimiteMesajPlecareCapatLinie();

        mijlocTransport.stergeCalator(c2);
        mijlocTransport.adaugaCalator(c3);

        mijlocTransport.trimiteMesajPlecareCapatLinie();

    }
}
