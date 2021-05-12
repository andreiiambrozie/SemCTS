package clase.flyweight;

import clase.Pacient;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,Pacient> pacientMap;

    public FlyweightFactory() {
        this.pacientMap = new HashMap<>();
    }

    public Flyweight getFlyweight(String nrTelefon){
        if(pacientMap.containsKey(nrTelefon)){
            return pacientMap.get(nrTelefon);
        }else {
            Pacient pacient = new Pacient("Zamfiroiu", "0000", "livezilor");
            pacientMap.put(nrTelefon, pacient);
            return pacient;
        }
    }
}
