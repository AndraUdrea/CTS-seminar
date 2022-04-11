package flyweightFactory.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<Integer, Linie> linii;

    public FlyweightFactory() {
        this.linii = new HashMap<>();
    }

    public Linie getLinie(int numarLinie) {
        if (linii.get(numarLinie) != null) {
            return linii.get(numarLinie);
        } else {
            linii.put(numarLinie, new Linie(numarLinie, "primaStatie", "ultimaStatie"));
            return linii.get(numarLinie);
        }

    }
}
