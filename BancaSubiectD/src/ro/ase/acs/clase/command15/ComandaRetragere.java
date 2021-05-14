package ro.ase.acs.clase.command15;

public class ComandaRetragere extends iCommand{
    public ComandaRetragere(ContCom cont) {
        super(cont);
    }

    @Override
    public void executa(int suma) {
        super.cont.retragereSuma(suma);
    }
}
