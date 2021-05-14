package ro.ase.acs.clase.flyweight10;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String,Detinator> listaDetinatori;

    public FlyweightFactory(){
        this.listaDetinatori=new HashMap<>();
    }

    public Flyweight getFlyweight(String nume){
        if(listaDetinatori.containsKey(nume)) {
            return listaDetinatori.get(nume);
        }else{
            Detinator detinator1=new Detinator(nume,"112","amb","ltilie");
            listaDetinatori.put(nume,detinator1);
            return detinator1;
        }

    }
}
