package flyweightFactory.main;

import flyweightFactory.clase.Autobuz;
import flyweightFactory.clase.AutobuzLinie;
import flyweightFactory.clase.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie a1 = new Autobuz("model1", 2020, 20);
        AutobuzLinie a2 = new Autobuz("model2", 2019, 25);
        AutobuzLinie a3 = new Autobuz("model3", 2022, 15);
        AutobuzLinie a4 = new Autobuz("model4", 2021, 32);

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        a1.descrie(flyweightFactory.getLinie(168));
        a2.descrie(flyweightFactory.getLinie(226));
        a3.descrie(flyweightFactory.getLinie(168));
        a4.descrie(flyweightFactory.getLinie(137));
    }
}
