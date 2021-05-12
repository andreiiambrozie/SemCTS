package clase;

import clase.flyweight.Flyweight;
import clase.flyweight.Internare;
import clase.state.Stare;
import clase.state.StareExternat;
import clase.state.StareInternat;
import clase.state.StareSubObsv;
import clase.strategy.PlataCash;
import clase.strategy.iPlata;

public class Pacient implements Flyweight {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuci;
    private boolean areHalat;
    private boolean stareGrava;
    private iPlata tipDePlata=new PlataCash();
    private Stare stare=new StareInternat();

    public Stare getStare() {
        return stare;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public void setStareInternat(){
        StareInternat internat=new StareInternat();
        internat.modificaStare(this);
    }

    public void setStareSubObsv(){
        StareSubObsv stareSubObsv=new StareSubObsv();
        stareSubObsv.modificaStare(this);
    }

    public void setStareExternat(){
        StareExternat stareExternat=new StareExternat();
        stareExternat.modificaStare(this);
    }

    public boolean getAreAsigurare() {
        return areAsigurare;
    }

    public void setTipDePlata(iPlata tipDePlata) {
        this.tipDePlata = tipDePlata;
    }

    public void platesteInternare(){
        System.out.println("Pacientul "+this.nume+" va achita: ");
        tipDePlata.plateste();
    }

    private boolean areAsigurare;

    private String numarDeTelefon;
    private String adresa;



    public void setAreAsigurare(boolean areAsigurare) {
        this.areAsigurare = areAsigurare;
    }

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

    public boolean getStareGrava() {
        return stareGrava;
    }

    public void setStareGrava(boolean stareGrava) {
        this.stareGrava = stareGrava;
    }

    public String getNume() {
        return nume;
    }

    public void setNumarDeTelefon(String numarDeTelefon) {
        this.numarDeTelefon = numarDeTelefon;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public void afisareInternare(Internare internare) {
        System.out.println("Pacientul "+this.nume+" "+internare.toString());
    }

    public Pacient(String nume, String numarDeTelefon, String adresa) {
        this.nume = nume;
        this.numarDeTelefon = numarDeTelefon;
        this.adresa = adresa;
    }
}
