package ro.ase.acs.clase;

class Politie {
    public static boolean esteUrmarit(Persoana persoana){
        if(Integer.parseInt(""+persoana.getCNP().charAt(12)) %2==0){
            return true;
        }else
        {
            return false;
        }
    }
}
