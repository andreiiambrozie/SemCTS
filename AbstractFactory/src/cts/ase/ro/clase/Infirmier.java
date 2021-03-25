package cts.ase.ro.clase;

public class Infirmier extends PersonalSpital{
    public Infirmier(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return "Infirmierul: "+super.getNume();
    }
}
