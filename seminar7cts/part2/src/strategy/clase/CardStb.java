package strategy.clase;

public class CardStb implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Plata a fost efectuata prin card stb si este in valoare de: " + suma);
    }
}
