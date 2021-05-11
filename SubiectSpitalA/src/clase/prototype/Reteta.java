package clase.prototype;

public class Reteta implements PrototipAbstract{

    private String denumireSolutie;
    private int cantitateSolutie;

    public Reteta(String denumireSolutie, int cantitateSolutie) {
        this.denumireSolutie = denumireSolutie;
        this.cantitateSolutie = cantitateSolutie;
    }

    public Reteta(){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("denumireSolutie='").append(denumireSolutie).append('\'');
        sb.append(", cantitateSolutie=").append(cantitateSolutie);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public PrototipAbstract copiaza() {
        Reteta copie=new Reteta();
        copie.cantitateSolutie=this.cantitateSolutie;
        copie.denumireSolutie=this.denumireSolutie;
        return copie;
    }
}
