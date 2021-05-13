package clase;

public class Meci {
    private String echipaGazda;
    private String echipaOaspete;
    private int nrBileteVandute;
    private int nrSpectatori;
    private int nrJandarmi;
    private int nrStewarzi;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("clase.Meci{");
        sb.append("echipaGazda='").append(echipaGazda).append('\'');
        sb.append(", echipaOaspete='").append(echipaOaspete).append('\'');
        sb.append(", nrBileteVandute=").append(nrBileteVandute);
        sb.append(", nrSpectatori=").append(nrSpectatori);
        sb.append(", nrJandarmi=").append(nrJandarmi);
        sb.append(", nrStewarzi=").append(nrStewarzi);
        sb.append('}');
        return sb.toString();
    }

    public Memento creareMemento(){
        Memento memento=new Memento(this.nrSpectatori,this.echipaGazda,this.echipaOaspete);
        return memento;
    }

    public void setareMemento(Memento memento){
       this.echipaGazda=memento.getNumeGazda();
       this.echipaOaspete=memento.getNumeOaspeti();
       this.nrSpectatori=memento.getNrSpectator();

    }

    public void setEchipaGazda(String echipaGazda) {
        this.echipaGazda = echipaGazda;
    }

    public void setEchipaOaspete(String echipaOaspete) {
        this.echipaOaspete = echipaOaspete;
    }

    public void setNrBileteVandute(int nrBileteVandute) {
        this.nrBileteVandute = nrBileteVandute;
    }

    public void setNrSpectatori(int nrSpectatori) {
        this.nrSpectatori = nrSpectatori;
    }

    public void setNrJandarmi(int nrJandarmi) {
        this.nrJandarmi = nrJandarmi;
    }

    public void setNrStewarzi(int nrStewarzi) {
        this.nrStewarzi = nrStewarzi;
    }

    public Meci(String echipaGazda, String echipaOaspete, int nrBileteVandute, int nrSpectatori, int nrJandarmi, int nrStewarzi) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
        this.nrBileteVandute = nrBileteVandute;
        this.nrSpectatori = nrSpectatori;
        this.nrJandarmi = nrJandarmi;
        this.nrStewarzi = nrStewarzi;
    }
}
