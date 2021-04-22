package clase;

public class Masa {
    private int numarMasa;
    private Boolean esteOcupata=false;
    private Boolean esteRezervata=false;

    public Masa(int nrMasa){
        this.numarMasa=nrMasa;
    }

    public void ocupaMasa(){
        if(!this.esteOcupata){
            System.out.println("Ocupam masa");
            this.esteOcupata=true;
        }else {
            System.out.println("clase.Masa nu poate fi ocupata");
        }
    }

    public void rezervaMasa(){
        if(!this.esteRezervata){
            System.out.println("Rezervam masa");
            this.esteRezervata=true;
        }else
        {
            System.out.println("clase.Masa ");
        }
    }
}
