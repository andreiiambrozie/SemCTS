package clase.factoryMethod_simpleFactory;

public class FactorySupaVita implements iFactory {


    @Override
    public Supa getSupa(int pret) {
        return new SupaDeLegume(pret);
    }
}
