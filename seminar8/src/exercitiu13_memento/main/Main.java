package exercitiu13_memento.main;

import exercitiu13_memento.clase.Autobaza;
import exercitiu13_memento.clase.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Gigel",6,2010,"Otokar");
        Autobaza autobaza=new Autobaza();
        autobaza.adaugaMemento(  autobuz.createMemento());

        autobuz.setNumeSofer("Doru");
        autobaza.adaugaMemento(autobuz.createMemento());

        autobuz.setConsumMediu(8);
        autobaza.adaugaMemento(autobuz.createMemento());

        System.out.println(autobuz.toString());

        System.out.println("----Reveniri");
        autobuz.setMemento(autobaza.getMemento(0));
        System.out.println(autobuz.toString());


    }
}
