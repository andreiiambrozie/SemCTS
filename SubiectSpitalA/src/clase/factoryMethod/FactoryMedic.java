package clase.factoryMethod;

public class FactoryMedic implements iFactory{
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Medic(nume);
    }
}
