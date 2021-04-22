package main;

import clase.*;

public class Main {
    public static void main(String[] args) {

        Masa masa1=new Masa(1);
        Masa masa2=new Masa(2);

        Comanda comandaRezervare=new ComandaRezervare(masa1);
        Comanda comandaOcupare=new ComandaOcupare(masa1);
        Comanda comandaRezervare1=new ComandaRezervare(masa2);

        Operator operator=new Operator();
        operator.invoca(comandaRezervare);
        operator.executaComanda();

        operator.invoca(comandaOcupare);
        operator.invoca(comandaRezervare1);

        operator.executaComanda();
        operator.executaComanda();
    }
}
