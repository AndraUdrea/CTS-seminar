package clase;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class AngajatiReader extends IReader{

    public AngajatiReader(String file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException {
        super.scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (  super.scanner.hasNext()) {
        Angajat angajat=new Angajat();
        readAplicant(  super.scanner,angajat);
        angajat.setSalariu(  super.scanner.nextInt());
        angajat.setOcupatie(  super.scanner.next());
            angajati.add(angajat);
        }
        super.scanner.close();
        return angajati;
    }
}
