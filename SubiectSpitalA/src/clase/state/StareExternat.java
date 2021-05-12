package clase.state;

import clase.Pacient;

public class StareExternat implements Stare {
    @Override
    public void modificaStare(Pacient pacient) {
        if(pacient.getStare() instanceof StareExternat){
            System.out.println("Nu putem externa cv externat");
        }else{
            pacient.setStare(this);
            System.out.println("Pacientul "+pacient.getNume()+
                    " a fost externat");
        }
    }
}
