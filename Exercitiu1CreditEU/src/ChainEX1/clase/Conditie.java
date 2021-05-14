package ChainEX1.clase;

public abstract class Conditie {
    private Conditie conditie;

    public void setConditie(Conditie conditie) {
        this.conditie = conditie;
    }

    public Conditie getConditie() {
        return conditie;
    }

    public abstract void verificaConditie(Client client);
}
