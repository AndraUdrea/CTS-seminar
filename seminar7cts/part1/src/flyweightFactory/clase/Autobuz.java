package flyweightFactory.clase;

public class Autobuz implements AutobuzLinie{
    private String model;
    private int an;
    private int numarLocuri;

    public Autobuz(String model, int an, int numarLocuri) {
        this.model = model;
        this.an = an;
        this.numarLocuri = numarLocuri;
    }

    @Override
    public void descrie(Linie linie) {
        System.out.println(this.toString() + " " + linie.toString());
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", an=" + an +
                ", numarLocuri=" + numarLocuri +
                '}';
    }
}
