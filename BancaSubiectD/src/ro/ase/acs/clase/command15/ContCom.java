package ro.ase.acs.clase.command15;

import ro.ase.acs.clase.flyweight10.Cont;

public class ContCom {
    private int nrCont;
    private int suma;
    private boolean constituit;

    public ContCom(int nrCont, int suma) {
        this.nrCont = nrCont;
        this.suma = suma;
    }

    public ContCom(int nrCont){
        this.nrCont=nrCont;
        this.suma=0;
    }

    public int getSuma() {
        return suma;
    }

    public void constituieCont(int suma){

        if(this.constituit==false){
            this.constituit = true;
            this.suma = suma;
            System.out.println("Cont "+this.nrCont+" constituit");
        }else
            System.out.println("Cont deja constituit");

    }

    public void depunereSuma(int sumaDepusa){
        if(this.constituit==true){
            this.suma+=sumaDepusa;
            System.out.println("Suma "+sumaDepusa+" a fost depusa");
        }else System.out.println("Cont neconstituit");

    }

    public void retragereSuma(int sumaSolicitata){
        if(this.constituit==true){
            if(sumaSolicitata<=this.suma){
                this.suma-=sumaSolicitata;
                System.out.println("Suma "+sumaSolicitata+
                        "a fost retrasa");
            }else System.out.println("Suma solicitata prea mare");
        }else System.out.println("Nu a fost constituit");
    }
    
}
