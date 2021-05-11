package clase.adapter;

public class MedicamentAdapter implements iMedicamentFaraReteta {
    private Medicament medicament;

    public MedicamentAdapter(Medicament medicament){
        this.medicament=medicament;
    }


    @Override
    public void cumparaMedicament() {
        System.out.println("Cumpara Medicament fara reteta");
    }
}
