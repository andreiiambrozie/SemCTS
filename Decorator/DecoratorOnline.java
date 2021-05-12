package clase.Decorator;

public class DecoratorOnline extends DecoratorAbstract {


    public DecoratorOnline(iRezultat rezultat) {
        super(rezultat);
    }

    @Override
    public void afisareRezultatDiferit() {
        System.out.println("Rezultat online ");
    }

}
