package Proxy1.clase;

public class Client implements iClient{
    private int varsta;
    private int salariu;
    private String nume;

    public Client(int varsta, int salariu, String nume) {
        this.varsta = varsta;
        this.salariu = salariu;
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public int getSalariu() {
        return salariu;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void acordaCredit(int suma) {
        System.out.println("Clientului "+this.nume+" i a fost" +
                "acordat "+suma);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("varsta=").append(varsta);
        sb.append(", salariu=").append(salariu);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
