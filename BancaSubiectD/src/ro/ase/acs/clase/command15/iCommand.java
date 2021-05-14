package ro.ase.acs.clase.command15;

public abstract class iCommand {

    public abstract void executa(int suma);
    protected ContCom cont;

    public iCommand(ContCom cont) {
        this.cont = cont;
    }
}
