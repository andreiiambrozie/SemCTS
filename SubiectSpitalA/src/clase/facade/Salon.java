package clase.facade;

import clase.builder.Pacient;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private static List<Pat> listaPaturi=new ArrayList<>();

    public static void adaugaPat(Pat pat){
        listaPaturi.add(pat);
    }


   public static boolean verificaPat(Pacient pacient){
        int c=0;
        for(Pat pat:listaPaturi){
            if(pat.isOcupat()==false){
                c++;
                if(c==1){
                    pat.setOcupat(true);
                    pat.setNumePacient(pacient.getNume());
                    return true;
                }
            }
        }
        return false;
   }
}
