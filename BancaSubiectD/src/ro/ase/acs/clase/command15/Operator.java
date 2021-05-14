package ro.ase.acs.clase.command15;

import java.util.ArrayList;
import java.util.List;

public class Operator {

    private List<iCommand> listaComenzi;

    public Operator() {
        this.listaComenzi = new ArrayList<>();
    }

    public void invocaComanda(iCommand command){
        this.listaComenzi.add(command);
    }

    public void executaComanda(int suma){
        listaComenzi.get(0).executa(suma);
        listaComenzi.remove(0);
    }
}
