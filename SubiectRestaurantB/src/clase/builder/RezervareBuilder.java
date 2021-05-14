package clase.builder;

public class RezervareBuilder extends AbstractBuilder{

    private int codRez;
    private boolean esteAsezareLaGeam;
    private boolean areScaunErgonomic;
    private boolean decorareMasa;
    private boolean muzicaAmbientalaPers;
    private String genMuzica;

    public RezervareBuilder() {
        this.codRez = 10;
        this.esteAsezareLaGeam=false;
        this.areScaunErgonomic=false;
        this.decorareMasa=false;
        this.muzicaAmbientalaPers=false;
        this.genMuzica="-";
    }

    @Override
    public Rezervare build() {
        return new Rezervare(codRez,esteAsezareLaGeam,areScaunErgonomic,decorareMasa,
                muzicaAmbientalaPers,genMuzica);
    }

    @Override
    public AbstractBuilder setCodRez(int codRez) {
        this.codRez=codRez;
        return this;
    }


    @Override
    public AbstractBuilder setAsezareGeam(boolean areAsezareGeam) {
        this.esteAsezareLaGeam=areAsezareGeam;
        return this;
    }

    @Override
    public AbstractBuilder setScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic=areScaunErgonomic;
        return this;
    }

    @Override
    public AbstractBuilder setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa=decorareMasa;
        return this;
    }

    @Override
    public AbstractBuilder areMuzicaAmbPers(boolean areMuzicaAmbPers) {
        this.muzicaAmbientalaPers=areMuzicaAmbPers;
        return this;
    }

    @Override
    public AbstractBuilder setGenMuzica(String genMuzica) {
        if(this.muzicaAmbientalaPers==true)
            this.genMuzica=genMuzica;

        return this;
    }

}
