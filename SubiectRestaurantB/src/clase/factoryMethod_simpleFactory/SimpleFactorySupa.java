package clase.factoryMethod_simpleFactory;

public class SimpleFactorySupa {
    public Supa creareSupa(TipSupa tipSupa,int pret){
        if(tipSupa==TipSupa.SupaDeCiuperci){
            return new SupaDeCiuperci(pret);
        }else if(tipSupa==TipSupa.SupaDeLegume)
            return new SupaDeLegume(pret);
        else if(tipSupa==TipSupa.SupaDeVita)
            return new SupaDeVita(pret);
        else throw new IllegalArgumentException();

    }
}
