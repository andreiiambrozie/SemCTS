package clase.factoryMethod_simpleFactory;

public class SupaDeVita extends Supa{
    public SupaDeVita(int pret) {
        super(pret);
    }

    @Override
    public String toString() {
        return "SupaVita costa"+super.getPret();
    }
}
