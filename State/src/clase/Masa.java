package clase;

public class Masa {
    private Stare stare;
    private int numar;

    public Masa(int nr){
        this.numar=nr;
        this.stare=new StareLibera();
    }

    public int getNumar() {
        return numar;
    }

    public Stare getStare() {
        return stare;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void ocupaMasa(){
        StareOcupata ocupata=new StareOcupata();
        ocupata.modificaStare(this);
    }
    public void rezervaMasa(){
        StareRezervata rezervata=new StareRezervata();
        rezervata.modificaStare(this);
    }
    public void elibereazaMasa(){
        StareLibera libera=new StareLibera();
        libera.modificaStare(this);
    }

}
