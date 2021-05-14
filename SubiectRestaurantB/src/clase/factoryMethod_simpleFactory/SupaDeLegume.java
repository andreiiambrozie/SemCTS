package clase.factoryMethod_simpleFactory;

public class SupaDeLegume extends Supa {
    public SupaDeLegume(int pret) {
        super(pret);
    }

    @Override
    public String toString() {
        return "SupaLegume costa:"+super.getPret();
    }
}
