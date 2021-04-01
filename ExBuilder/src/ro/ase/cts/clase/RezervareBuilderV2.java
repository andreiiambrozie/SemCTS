package ro.ase.cts.clase;

public class RezervareBuilderV2 implements AbstractBuilder {

    private int codRezervare;
    private boolean areMancare;
    private boolean areScaunErgonomic;
    private boolean areBautura;
    private boolean areMuzicaAmb;
    private String genMuzica;

    public RezervareBuilderV2(){
        this.codRezervare=100;
        this.areMancare=false;
        this.areScaunErgonomic=false;
        this.areBautura=false;
        this.areMuzicaAmb=false;
        this.genMuzica="-";
    }
    @Override
    public Rezervare build() {
        return new Rezervare(codRezervare,areMancare,areScaunErgonomic,areBautura,areMuzicaAmb,genMuzica);
    }

    public RezervareBuilderV2 setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
        return this;
    }

    public RezervareBuilderV2 setAreMancare(boolean areMancare) {
        this.areMancare = areMancare;
        return this;
    }

    public RezervareBuilderV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
        return this;
    }

    public RezervareBuilderV2 setAreBautura(boolean areBautura) {
        this.areBautura = areBautura;
        return this;
    }

    public RezervareBuilderV2 setAreMuzicaAmb(boolean areMuzicaAmb) {
        this.areMuzicaAmb = areMuzicaAmb;
        return this;
    }

    public RezervareBuilderV2 setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

}
