package ro.ase.cts.clase;

public class Rezervare {
    private int codRezervare;
    private boolean areMancare;
    private boolean areScaunErgonomic;
    private boolean areBautura;
    private boolean areMuzicaAmb;
    private String genMuzica;

    public Rezervare(int codRezervare,
                     boolean areMancare,
                     boolean areScaunErgonomic,
                     boolean areBautura,
                     boolean areMuzicaAmb,
                     String genMuzica) {
        this.codRezervare = codRezervare;
        this.areMancare = areMancare;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areBautura = areBautura;
        this.areMuzicaAmb = areMuzicaAmb;
        this.genMuzica = genMuzica;
    }
    public Rezervare(){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("codRezervare=").append(codRezervare);
        sb.append(", areMancare=").append(areMancare);
        sb.append(", areScaunErgonomic=").append(areScaunErgonomic);
        sb.append(", areBautura=").append(areBautura);
        sb.append(", areMuzicaAmb=").append(areMuzicaAmb);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Rezervare(int codRezervare){
        this.codRezervare=codRezervare;
    }

    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    public void setAreMancare(boolean areMancare) {
        this.areMancare = areMancare;
    }

    public void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public void setAreBautura(boolean areBautura) {
        this.areBautura = areBautura;
    }

    public void setAreMuzicaAmb(boolean areMuzicaAmb) {
        this.areMuzicaAmb = areMuzicaAmb;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }
}
