package cts.ase.ro.Prototype;

public class Main {

    public static void main(String[] args){
        Reteta reteta=new Reteta("Maraciuga",1);
        Reteta reteta1= (Reteta) reteta.copiaza();
        System.out.println(reteta);
        System.out.println(reteta1);
    }
}
