package ro.ase.acs.clase;

import java.util.ArrayList;
import java.util.List;

public class CompositeAgentie implements iSediu {
    private List<iSediu> listaSedii;

    public CompositeAgentie() {
        this.listaSedii=new ArrayList<>();
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Este o agentie");
        for(iSediu iSediu :listaSedii){
            iSediu.afiseazaDescriere();
        }
    }

    @Override
    public void adaugaNod(iSediu iSediu) {
        listaSedii.add(iSediu);
    }

    @Override
    public void stergeNod(iSediu iSediu) {
        listaSedii.remove(iSediu);
    }

    @Override
    public iSediu getNod(int poz) {
        return listaSedii.get(poz);
    }
}
