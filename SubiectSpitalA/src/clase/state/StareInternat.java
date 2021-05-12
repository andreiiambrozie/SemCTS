package clase.state;

import clase.Pacient;

public class StareInternat implements Stare {
    @Override
    public void modificaStare(Pacient pacient) {
        if(pacient.getStare() instanceof StareInternat){
            System.out.println("Nu poti interna cv internat");
        }else{
            pacient.setStare(this);
            System.out.println("Pacientul "+pacient.getNume()+
                    "a fost internat");
        }
    }
}
