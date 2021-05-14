package ro.ase.acs.clase.command15;

public class ComandaConstituire extends iCommand {
    public ComandaConstituire(ContCom cont) {
        super(cont);
    }

    @Override
    public void executa(int suma) {
        super.cont.constituieCont(suma);
    }
}
