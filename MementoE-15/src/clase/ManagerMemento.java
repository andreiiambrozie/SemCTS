package clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {

    private List<Memento> listaMementos;

    public ManagerMemento(){
        this.listaMementos=new ArrayList<>();
    }

    public void adaugaMemento(Memento memento){
        listaMementos.add(memento);
    }

    public Memento cereMemento(int index){
        if(index<listaMementos.size() && index>=0)
           return listaMementos.get(index);
        return null;
    }

    public Memento getLastMemento(){
        return listaMementos.get(listaMementos.size()-1);
    }
}
