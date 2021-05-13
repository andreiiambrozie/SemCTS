package clase.adapter;

public class Medicament {
    private String nume;

    public Medicament(String nume){
        this.nume=nume;
    }

    public String getNume() {
        return nume;
    }

    public void achizitioneazaMedicament(RetetaMedicament retetaMedicament){
       if(prezintaReteta(retetaMedicament)){
           System.out.println("Medicament achizitionat");
       }else System.out.println("Nu se poate vinde fara reteta");

    }

    public boolean prezintaReteta(RetetaMedicament retetaMedicament)
    {
        if(retetaMedicament.esteValabila){
            return true;
        }else return false;

    }
}
