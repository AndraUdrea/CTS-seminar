package exercitiu8_proxy.main;

import exercitiu8_proxy.clase.Autobuz;
import exercitiu8_proxy.clase.AutobuzDeNoapte;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz(5,434);
//        autobuz.opresteInstatie();
//        autobuz.setNrCalatori(0);
//        autobuz.opresteInstatie();

        AutobuzDeNoapte autobuzDeNoapte=new AutobuzDeNoapte(autobuz);
        autobuzDeNoapte.setNrCalatori(2);
        autobuzDeNoapte.opresteInstatie();
        autobuzDeNoapte.setNrCalatori(0);
        autobuzDeNoapte.opresteInstatie();
    }
}
