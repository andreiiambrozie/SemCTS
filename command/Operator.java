package clase.command;

import java.util.ArrayList;
import java.util.List;

//manager-ul (invoker)
public class Operator {

    private List<Comanda> listaComenzi;

    public Operator(){
        this.listaComenzi=new ArrayList<>();
    }

    public void addComanda(Comanda comanda){
        listaComenzi.add(comanda);
    }

    public void executaComanda(){
        this.listaComenzi.get(0).executa();
        this.listaComenzi.remove(0);
    }
}
