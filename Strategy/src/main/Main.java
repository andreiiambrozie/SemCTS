package main;

import clase.Client;
import clase.PlataCard;

public class Main {
    public static void main(String[] args) {
        Client c1=new Client("Amb");
        Client c2=new Client("Ditu");
        Client c3=new Client("Sclav");

        c1.plateste(30);
        c1.setPlata(new PlataCard());
        c1.plateste(30);
    }
}
