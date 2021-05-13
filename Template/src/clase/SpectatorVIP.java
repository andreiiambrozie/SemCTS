package clase;

public class SpectatorVIP extends SpectatorAbstract{

    private String nume;


    public SpectatorVIP(String nume) {
        this.nume = nume;
    }

    @Override
    public void asezareLaCoada() {
        System.out.println("Nu mai sta la coada");
    }

    @Override
    public void prezentareBilet() {
        System.out.println("Prezinta bilet: "+this.nume);
    }

    @Override
    public void controlCorporal() {
        System.out.println("Nu il controleaza la piele");
    }

    @Override
    public void ocupareLoc() {
        System.out.println("Ocupa loc: "+this.nume);
    }
}
