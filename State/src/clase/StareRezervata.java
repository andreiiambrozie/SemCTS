package clase;

public class StareRezervata implements Stare{
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareRezervata){
            System.out.println("Nu poate fi rezervata");
        }else{
            masa.setStare(this);
            System.out.println("Masa nr: "+masa.getNumar()+" a fost rezervata");
        }
    }
}
