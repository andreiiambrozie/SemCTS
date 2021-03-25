package cts.ase.ro.clase;

public class Medic extends PersonalSpital{
    public Medic(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return "\nMedicul: "+super.getNume();
    }
}
