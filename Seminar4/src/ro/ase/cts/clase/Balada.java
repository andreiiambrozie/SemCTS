package ro.ase.cts.clase;

public class Balada {
    private String titlu;
    private int nr_versuri;
    private boolean estePublicata;

    private Balada(String titlu, int nr_versuri, boolean estePublicata) {
        this.titlu = titlu;
        this.nr_versuri = nr_versuri;
        this.estePublicata = estePublicata;
    }

    private Balada(){

    }

    private static Balada instance=null;

    public static synchronized Balada getInstance(String titlu,int nr_versuri,boolean publicata) {
            if (instance == null) {
                instance = new Balada(titlu, nr_versuri, publicata);
            }
        return instance;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setNr_versuri(int nr_versuri) {
        this.nr_versuri = nr_versuri;
    }

    public void setEstePublicata(boolean estePublicata) {
        this.estePublicata = estePublicata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Balada{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", nr_versuri=").append(nr_versuri);
        sb.append(", publicata=").append(estePublicata);
        sb.append('}');
        return sb.toString();
    }
}
