package clase.command;

public abstract class Comanda {

     Medic medic; //catre el trimitem comanda

    public abstract void executa();

    public Comanda(Medic medic) {
        this.medic = medic;
    }
}
