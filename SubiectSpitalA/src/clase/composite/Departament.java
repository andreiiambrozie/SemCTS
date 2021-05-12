package clase.composite;

import java.util.ArrayList;
import java.util.List;

public class Departament implements iComponentaAbstracta{

    private String nume;
    private List<iComponentaAbstracta> listaSectii;

    public Departament(String nume){
        this.nume=nume;
        this.listaSectii=new ArrayList<>();
    }

    @Override
    public void descrie() {
        System.out.println("Departamentul: "+this.nume);
        for(iComponentaAbstracta componenta:listaSectii){
            componenta.descrie();
        }
    }

    @Override
    public void addNod(iComponentaAbstracta componenta) {
        listaSectii.add(componenta);
    }

    @Override
    public void removeNod(iComponentaAbstracta componenta) {
        this.listaSectii.remove(componenta);

    }

    @Override
    public iComponentaAbstracta getNod(int position) {
        return listaSectii.get(position);
    }


}
