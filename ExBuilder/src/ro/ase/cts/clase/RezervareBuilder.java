package ro.ase.cts.clase;

public class RezervareBuilder implements AbstractBuilder {
    private Rezervare rezervare;

    public RezervareBuilder(int codRezervare){
        this.rezervare=new Rezervare(codRezervare,
                false,false,
                false,
                false,"Pop");
    }

    public RezervareBuilder addMuzicaAmb(boolean areMuzicaAmb){
       rezervare.setAreMuzicaAmb(areMuzicaAmb);
        return this;
    }

    public RezervareBuilder setCodRezervare(int codRezervare){
        rezervare.setCodRezervare(codRezervare);
        return this;
    }

    public RezervareBuilder setAreScaunErg(boolean areScaunErg){
        rezervare.setAreScaunErgonomic(areScaunErg);
        return this;
    }

    public RezervareBuilder setBautura(boolean areBautura){
        rezervare.setAreBautura(areBautura);
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        rezervare.setGenMuzica(genMuzica);
        return this;
    }

    public RezervareBuilder setMancare(boolean areMancare){
        rezervare.setAreMancare(areMancare);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
