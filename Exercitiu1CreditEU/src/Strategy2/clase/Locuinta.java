package Strategy2.clase;

import Flyweight3.clase.Flyweight;

public class Locuinta implements Flyweight {
    private int nrCamere;
    private int pret;
    private int metriPatrati;
    private int cod;

    public Locuinta(int nrCamere, int pret, int metriPatrati) {
        this.nrCamere = nrCamere;
        this.pret = pret;
        this.metriPatrati = metriPatrati;
    }
    public Locuinta(){

    }

    public int getNrCamere() {
        return nrCamere;
    }

    public int getPret() {
        return pret;
    }

    public int getMetriPatrati() {
        return metriPatrati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Locuinta{");
        sb.append("nrCamere=").append(nrCamere);
        sb.append(", pret=").append(pret);
        sb.append(", metriPatrati=").append(metriPatrati);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public void arataPret() {
        System.out.println("Costa "+this.pret);
    }
}
