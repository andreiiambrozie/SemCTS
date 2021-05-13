package main;

import clase.Spectator;
import clase.SpectatorAbstract;
import clase.SpectatorVIP;

public class Main {

    public static void main(String[] args) {
        SpectatorAbstract spectatorAbstract=new Spectator("Ditu");
        SpectatorAbstract spectatorAbstract1=new SpectatorVIP("Amb");


        spectatorAbstract.intrareStadion();
        spectatorAbstract1.intrareStadion();
    }
}
