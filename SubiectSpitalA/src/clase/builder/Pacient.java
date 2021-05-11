package clase.builder;

public class Pacient {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuci;
    private boolean areHalat;
    private boolean stareGrava;



    public Pacient(String nume, boolean arePatRabatabil, boolean areMicDejunInclus, boolean arePapuci, boolean areHalat) {
        this.nume = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejunInclus = areMicDejunInclus;
        this.arePapuci = arePapuci;
        this.areHalat = areHalat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejunInclus=").append(areMicDejunInclus);
        sb.append(", arePapuci=").append(arePapuci);
        sb.append(", areHalat=").append(areHalat);
        sb.append('}');
        return sb.toString();
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    public void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    public void setArePapuci(boolean arePapuci) {
        this.arePapuci = arePapuci;
    }

    public void setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
    }

    public boolean isStareGrava() {
        return stareGrava;
    }

    public void setStareGrava(boolean stareGrava) {
        this.stareGrava = stareGrava;
    }

    public String getNume() {
        return nume;
    }
}
