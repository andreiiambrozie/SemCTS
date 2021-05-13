package clase;

public class Manager extends ManagerSalaAbstract{

    public void anuntaMeci(String mesaj){
        super.trimiteMesajToObservator("Va avea loc un meci"+ mesaj);
    }
}
