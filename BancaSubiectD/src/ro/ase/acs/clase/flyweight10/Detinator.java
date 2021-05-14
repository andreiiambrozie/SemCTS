package ro.ase.acs.clase.flyweight10;

public class Detinator implements Flyweight {
    private String nume;
    private String nrTelefon;
    private String email;
    private String adresa;


    public Detinator(String nume, String nrTelefon, String email, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getEmail() {
        return email;
    }

    public String getAdresa() {
        return adresa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Detinator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazCont(Cont cont) {
        System.out.println("Contul "+cont.toString()+
                " este DETINUT DE: "+this.nume);
    }
}
