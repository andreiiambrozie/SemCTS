import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,Flyweight> factory;

    public FlyweightFactory() {
        this.factory =new HashMap<>();
    }
    public Flyweight getFlyweight(String nrTel){
        if(factory.containsKey(nrTel)){
            return factory.get(nrTel);
        }else
        {
            Client client=new Client(nrTel,"jon@gmail.com","John");
            factory.put(nrTel,client);
            return client;
        }
    }
}
