package clase.command;

public class ComandaInternare extends Comanda {

    public ComandaInternare(Medic medic) {
        super(medic);
    }

    @Override
    public void executa() {
        super.medic.interneaza();
    }
}
