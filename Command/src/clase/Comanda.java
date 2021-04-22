package clase;

public abstract class Comanda {
    public abstract void executa();
    protected Masa masa;

    public Comanda(Masa masa) {
        this.masa = masa;
    }
}
