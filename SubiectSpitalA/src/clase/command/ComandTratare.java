package clase.command;

public class ComandTratare extends Comanda{
    public ComandTratare(Medic medic) {
        super(medic);
    }

    @Override
    public void executa() {
        super.medic.trateaza();
    }
}
