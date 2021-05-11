package clase.factoryMethod;

public class FactoryBrancardier implements iFactory{
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Brancardier(nume);
    }
}
