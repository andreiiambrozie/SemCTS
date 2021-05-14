package ChainEX1.clase;

public class Client {
    private String nume;
    private int varsta;
    private int salariu;


    public Client(String nume, int varsta, int salariu) {
        this.nume = nume;
        this.varsta = varsta;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public int getSalariu() {
        return salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
