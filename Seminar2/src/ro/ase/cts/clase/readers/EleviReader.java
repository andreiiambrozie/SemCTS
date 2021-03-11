package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends iReader{

    public EleviReader(String numeFisier) {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException {
            Scanner input2 = new Scanner(super.numeFisier);
            input2.useDelimiter(",|\n");
            List<Aplicant> elevi = new ArrayList<>();

            while (input2.hasNext()) {
                Elev elev=new Elev();
                super.citireAplicant(input2,elev);
                int clasa = input2.nextInt();
                String tutore = input2.next();
                elev.setClasa(clasa);
                elev.setTutore(tutore);
                elevi.add(elev);
            }

            input2.close();
            return elevi;
        }
}
