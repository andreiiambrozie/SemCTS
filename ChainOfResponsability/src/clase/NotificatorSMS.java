package clase;

public class NotificatorSMS extends Notificator{
    @Override
    public void trimiteNotificare(Client client,String text) {
        if(client.getNrTelefon()!=null){
            System.out.println("Trimitere SMS catre: "
                    +client.getNume()+" mesaj "+text);
        }else{
            if(super.getNotificator()!=null){
                super.getNotificator().trimiteNotificare(client,text);
            }else{
                System.out.println("Nu avem date de contact pentru clientul "+
                        client.getNume());
            }
        }
}
}
