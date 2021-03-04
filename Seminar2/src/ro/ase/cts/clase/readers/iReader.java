package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public abstract class iReader {

    protected String numeFisier;

    public iReader(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    abstract public List<Aplicant> readAplicants() throws FileNotFoundException,NumberFormatException;

}
