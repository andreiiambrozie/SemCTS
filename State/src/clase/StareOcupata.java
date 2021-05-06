package clase;

public class StareOcupata implements Stare{
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareOcupata){
            System.out.println("Nu poate fi ocupata");
        }else{
            masa.setStare(this);
            System.out.println("Masa nr:"+masa.getNumar()+" a fost ocupata");
        }
    }
}
