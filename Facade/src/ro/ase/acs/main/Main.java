package ro.ase.acs.main;

import ro.ase.acs.clase.Persoana;
import ro.ase.acs.clase.VerificatorPersoaneFacade;

public class Main {
    public static void main(String[] args) {
        Persoana persoana=new Persoana("Amb","5000312440025");
       if(VerificatorPersoaneFacade.esteEligibil(persoana)){
           System.out.println("Ii putem acorda creditul");
       }else
           System.out.println("Nu ii putem acorda creditul");

    }
}
