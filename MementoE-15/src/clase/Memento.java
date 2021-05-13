package clase;

public class Memento {

    private int nrSpectator;
    private String numeGazda;
    private String numeOaspeti;

    public Memento(int nrSpectator, String numeGazda, String numeOaspeti) {
        this.nrSpectator = nrSpectator;
        this.numeGazda = numeGazda;
        this.numeOaspeti = numeOaspeti;
    }

    public int getNrSpectator() {
        return nrSpectator;
    }

    public void setNrSpectator(int nrSpectator) {
        this.nrSpectator = nrSpectator;
    }

    public String getNumeGazda() {
        return numeGazda;
    }

    public void setNumeGazda(String numeGazda) {
        this.numeGazda = numeGazda;
    }

    public String getNumeOaspeti() {
        return numeOaspeti;
    }

    public void setNumeOaspeti(String numeOaspeti) {
        this.numeOaspeti = numeOaspeti;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("clase.Memento{");
        sb.append("nrSpectator=").append(nrSpectator);
        sb.append(", numeGazda=").append(numeGazda);
        sb.append(", numeOaspeti=").append(numeOaspeti);
        sb.append('}');
        return sb.toString();
    }
}
