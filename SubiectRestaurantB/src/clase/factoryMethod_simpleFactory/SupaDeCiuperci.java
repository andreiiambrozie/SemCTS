package clase.factoryMethod_simpleFactory;

public class SupaDeCiuperci extends Supa{
    public SupaDeCiuperci(int pret) {
        super(pret);
    }

    @Override
    public String toString() {
        return "SupaCiuperci costa "+super.getPret();
    }
}
