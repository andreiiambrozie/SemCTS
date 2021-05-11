package clase.builder;

public class PacientBuilder implements AbstractBuilder{
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuci;
    private boolean areHalat;

    public PacientBuilder(String nume) {
        this.nume=nume;
        this.arePatRabatabil=false;
        this.areMicDejunInclus=false;
        this.arePapuci=false;
        this.areHalat=false;
    }

    public PacientBuilder addPatRabatabil(boolean arePatRabatabil){
        this.arePatRabatabil=arePatRabatabil;
        return this;
    }

    public PacientBuilder addMicDejunInclus(boolean areMicDejunInclus){
        this.areMicDejunInclus=areMicDejunInclus;
        return this;
    }

    public PacientBuilder addPapuci(boolean arePapuci){
        this.arePapuci=arePapuci;
        return this;
    }

    public PacientBuilder addHalat(boolean areHalat){
        this.areHalat=areHalat;
        return this;
    }
    @Override
    public Pacient build() {
        return new Pacient(nume,arePatRabatabil,areMicDejunInclus,arePapuci,areHalat);
    }

}
