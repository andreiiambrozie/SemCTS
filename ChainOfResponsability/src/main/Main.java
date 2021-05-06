package main;

import clase.Client;
import clase.Notificator;
import clase.NotificatorEmail;
import clase.NotificatorSMS;

public class Main {
    public static void main(String[] args) {
        Client c1=new Client("Amb","0728331032","amb@gmail.com");
        Client c2=new Client("Jon","0745123542",null);
        Client c3=new Client("Ditu",null,"ditu@gmail.com");
        Client c4=new Client("Nutu",null,null);


        NotificatorSMS notificatorSMS=new NotificatorSMS();
        NotificatorEmail notificatorEmail=new NotificatorEmail();

        notificatorSMS.trimiteNotificare(c4,"alupigus");

        notificatorSMS.setNotificator(notificatorEmail);
        notificatorSMS.trimiteNotificare(c3,"msj");
    }
}
