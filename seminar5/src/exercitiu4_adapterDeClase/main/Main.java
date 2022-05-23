package exercitiu4_adapterDeClase.main;

import exercitiu4_adapterDeClase.clase.STB.ValidatorAdapter;
import exercitiu4_adapterDeClase.clase.STB.ValidatorNFC;
import exercitiu4_adapterDeClase.clase.STB.ValidatorStb;

public class Main {
    private static void validareAbonamente(ValidatorStb validator){
        validator.valideazaAbonament();
    }

    public static void main(String[] args){
        ValidatorStb val=new ValidatorNFC();

        ValidatorAdapter adapter=new ValidatorAdapter();
        adapter.valideazaAbonament();
        adapter.valideazaBilet();
    }
}
