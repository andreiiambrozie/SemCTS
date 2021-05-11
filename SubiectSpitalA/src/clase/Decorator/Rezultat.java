package clase.Decorator;

public class Rezultat implements iRezultat{

    private String numePacient;
    private int cod;

    public Rezultat(String numePacient, int cod) {
        this.numePacient = numePacient;
        this.cod = cod;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezultat{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", cod=").append(cod);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afisareRez() {
        System.out.println("Afisare rezultat "+toString());
    }
}
