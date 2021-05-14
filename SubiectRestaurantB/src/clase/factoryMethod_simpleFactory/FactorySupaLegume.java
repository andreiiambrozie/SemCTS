package clase.factoryMethod_simpleFactory;

public class FactorySupaLegume implements iFactory{
    @Override
    public Supa getSupa(int pret) {
        return new SupaDeLegume(pret);
    }
}
