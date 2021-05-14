package ro.ase.acs.clase.flyweight10;

public class Cont {
    private int nrCont;
    private int sumaCont;
    private String numeBanca;
    private String sucursala;

    public Cont(int nrCont, int sumaCont, String numeBanca, String sucursala) {
        this.nrCont = nrCont;
        this.sumaCont = sumaCont;
        this.numeBanca = numeBanca;
        this.sucursala = sucursala;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContCom{");
        sb.append("nrCont=").append(nrCont);
        sb.append(", sumaCont=").append(sumaCont);
        sb.append(", numeBanca='").append(numeBanca).append('\'');
        sb.append(", sucursala='").append(sucursala).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
