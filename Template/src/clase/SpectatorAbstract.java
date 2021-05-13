package clase;

public abstract class SpectatorAbstract {

    public void intrareStadion(){
        asezareLaCoada();
        prezentareBilet();
        controlCorporal();
        ocupareLoc();
    }
    public abstract void asezareLaCoada();
    public abstract void prezentareBilet();
    public abstract void controlCorporal();
    public abstract void ocupareLoc();
}
