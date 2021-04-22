public class Client implements Flyweight{
    private String nume;
    private String email;
    private String nrTelefon;

    public Client(String nume, String email, String nrTelefon) {
        this.nume = nume;
        this.email = email;
        this.nrTelefon = nrTelefon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void printeazaRezervare(Rezervare rezervare) {
        System.out.println(this.toString()+" "+rezervare.toString());
    }
}
