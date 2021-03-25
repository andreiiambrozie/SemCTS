package cts.ase.ro.clase;

public class FactoryInfirmier implements iFactory {

    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Infirmier(nume);
    }
}
