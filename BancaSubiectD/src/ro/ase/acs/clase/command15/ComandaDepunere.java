package ro.ase.acs.clase.command15;

public class ComandaDepunere extends iCommand {
    @Override
    public void executa(int suma) {
        super.cont.depunereSuma(suma);
    }

    public ComandaDepunere(ContCom cont) {
        super(cont);
    }


}
