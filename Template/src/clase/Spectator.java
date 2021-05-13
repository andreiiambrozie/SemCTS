package clase;

public class Spectator extends SpectatorAbstract{

    private String nume;

    public Spectator(String nume) {
        this.nume = nume;
    }

    @Override
    public void asezareLaCoada() {
        System.out.println("Spectatorul "+this.nume+" s a asezat la coada");
    }

    @Override
    public void prezentareBilet() {
        System.out.println("Spectatorul "+this.nume+" a prez biletul");
    }

    @Override
    public void controlCorporal() {
        System.out.println("Spec "+this.nume+" a fost controlat");
    }

    @Override
    public void ocupareLoc() {
        System.out.println("Spec "+this.nume+" a ocupat locul");
    }
}
