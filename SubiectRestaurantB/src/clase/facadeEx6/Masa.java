package clase.facadeEx6;

public class Masa {
    private boolean esteLibera;
    private boolean esteDebarasata;
    private boolean areServeteleNoi;

    public Masa(boolean esteLibera, boolean esteDebarasata, boolean areServeteleNoi) {
        this.esteLibera = esteLibera;
        this.esteDebarasata = esteDebarasata;
        this.areServeteleNoi = areServeteleNoi;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public void setEsteLibera(boolean esteLibera) {
        this.esteLibera = esteLibera;
    }

    public boolean isEsteDebarasata() {
        return esteDebarasata;
    }

    public void setEsteDebarasata(boolean esteDebarasata) {
        this.esteDebarasata = esteDebarasata;
    }

    public boolean isAreServeteleNoi() {
        return areServeteleNoi;
    }

    public void setAreServeteleNoi(boolean areServeteleNoi) {
        this.areServeteleNoi = areServeteleNoi;
    }
}
