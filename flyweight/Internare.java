package clase.flyweight;

public class Internare {

    private String numarSalon;
    private int numarPat;
    private int nrZile;

    public Internare(String numarSalon, int numarPat, int nrZile) {
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.nrZile = nrZile;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("numarSalon='").append(numarSalon).append('\'');
        sb.append(", numarPat=").append(numarPat);
        sb.append(", nrZile=").append(nrZile);
        sb.append('}');
        return sb.toString();
    }
}
