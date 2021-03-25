package cts.ase.ro.clase;

public class FactoryAsistent implements iFactory{
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Asistent(nume);
    }
}
