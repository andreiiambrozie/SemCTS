package ro.ase.acs.clase;

public class VerificatorPersoaneFacade {
    public static boolean esteEligibil(Persoana persoana) {
        if (persoana.getVarsta() >= 18) {
            if(!Politie.esteUrmarit(persoana)){
                if(!BirouDeCredite.areCredit(persoana))
                    return true;
            }
        }
        return false;
    }
}
