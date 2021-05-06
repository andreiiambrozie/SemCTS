package clase;

public class NotificatorEmail extends Notificator{
    @Override
    public void trimiteNotificare(Client client,String text) {

        if(client.getEmail()!=null){
            System.out.println("Trimitere email catre: "
            +client.getNume()+" mesaj "+text);
        }else{
            //verificam daca avem notificator pt manager
            //verificam daca exista un succesor
            if(super.getNotificator()!=null){
                super.getNotificator().trimiteNotificare(client,text);
            }else{
                System.out.println("Nu avem date de contact pt clientul "+
                        client.getNume());
            }
        }
    }
}
