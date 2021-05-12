package clase.composite;

import java.util.ArrayList;
import java.util.List;

public class Spital implements iComponentaAbstracta {
    private List<iComponentaAbstracta> listaDepartamente;

    public Spital(){
        listaDepartamente=new ArrayList<>();
    }

    @Override
    public void descrie() {
        System.out.println("Spitalul are: ");
        for(iComponentaAbstracta componenta:listaDepartamente){
            componenta.descrie();
        }
    }

    @Override
    public void addNod(iComponentaAbstracta componenta) {
        listaDepartamente.add(componenta);
    }

    @Override
    public void removeNod(iComponentaAbstracta componenta) {
        listaDepartamente.remove(componenta);
    }

    @Override
    public iComponentaAbstracta getNod(int position) {
        return listaDepartamente.get(position);
    }
}
