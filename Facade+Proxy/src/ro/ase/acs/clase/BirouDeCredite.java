package ro.ase.acs.clase;

class BirouDeCredite {
    public static boolean areCredit(Persoana persoana){
        return Integer.parseInt(""+persoana.getCNP().charAt(12))%2==0;

    }
}
