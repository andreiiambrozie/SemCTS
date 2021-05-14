package Strategy2.clase;

import java.util.List;

public class StrategiePretNrCamere implements iStrategie{
    @Override
    public void calculPretMinim(List<Locuinta> listaLocuinte,ClientNou clientNou) {
        Locuinta primaLocuinta=null;
        int minim=listaLocuinte.get(0).getPret()/listaLocuinte.get(0).getNrCamere();

        for(Locuinta loc :listaLocuinte){
            if(loc.getPret()/loc.getNrCamere()<=minim && clientNou.getValoareCredit()>=loc.getPret()){
                primaLocuinta=loc;
            }
        }
        if(primaLocuinta!=null) {
            System.out.println("Clientul doreste pret/camere minim si va alege " +
                    primaLocuinta.toString());
        }else System.out.println("N are bani");
    }
}
