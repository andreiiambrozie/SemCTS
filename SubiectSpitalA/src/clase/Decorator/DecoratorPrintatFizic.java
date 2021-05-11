package clase.Decorator;

public class DecoratorPrintatFizic extends DecoratorAbstract{
    public DecoratorPrintatFizic(iRezultat rezultat) {
        super(rezultat);
    }

    @Override
    public void afisareRezultatDiferit() {
        System.out.println("Rezultat printat");
    }

}
