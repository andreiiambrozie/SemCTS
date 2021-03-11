package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends iReader {

    public AngajatiReader(String file) {
        super(file);

    }

    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException {
            Scanner input2 = new Scanner(new File(super.numeFisier));
            input2.useDelimiter(",");
            List<Aplicant> angajati = new ArrayList<>();

            while (input2.hasNext()) {
                Angajat angajat=new Angajat();
                super.citireAplicant(input2,angajat);
                int salariu = input2.nextInt();
                String ocupatie = input2.next();
                angajat.setSalariu(salariu);
                angajat.setOcupatie(ocupatie);

                angajati.add(angajat);
            }
            input2.close();
            return angajati;
        }
    }

