package ro.ase.acs.clase.strategy11;

public class Persoana {
    private iStrategy strategieTipClient;
    private String nume;

    public Persoana(String nume) {
        this.nume = nume;
        this.strategieTipClient=new StrategiePersFizica();
    }

    public void setStrategieTipClient(iStrategy strategieTipClient) {
        this.strategieTipClient = strategieTipClient;
    }

    public void prezintaDocomente(){
        if(strategieTipClient instanceof StrategiePersFizica){

            System.out.println("Persoana este fizica");
        }else
            System.out.println("Persoana este juridica");
        strategieTipClient.prezintaDocumente();
    }

}
