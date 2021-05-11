package clase.adapter;

import clase.factoryMethod.Medic;

public class Medicament {
    private String nume;

    public Medicament(String nume){
        this.nume=nume;
    }

    public void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println("Medicament achizit");
    }

    public void prezintaReteta(){
        System.out.println("Reteta prezentata");
    }
}
