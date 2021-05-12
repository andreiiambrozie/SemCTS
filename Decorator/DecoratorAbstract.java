package clase.Decorator;

public abstract class DecoratorAbstract implements iRezultat{

    private iRezultat rezultat;

    public DecoratorAbstract(iRezultat rezultat) {
        this.rezultat=rezultat;
    }

    @Override
    public void afisareRez() {
        rezultat.afisareRez();
    }

    public abstract void afisareRezultatDiferit();
}
