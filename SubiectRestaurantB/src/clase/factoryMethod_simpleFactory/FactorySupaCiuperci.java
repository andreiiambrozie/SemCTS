package clase.factoryMethod_simpleFactory;

public class FactorySupaCiuperci implements iFactory{
    @Override
    public Supa getSupa(int pret) {
        return new SupaDeCiuperci(pret);
    }
}
