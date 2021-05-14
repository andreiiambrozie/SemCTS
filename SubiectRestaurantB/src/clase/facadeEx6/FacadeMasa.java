package clase.facadeEx6;

public class FacadeMasa {
    public static void verificareMasa(Masa masa){
        if(MasaLibera.esteMasaLibera(masa) &&
        ServeteleNoi.areServeteleNoi(masa) && Debarasare.esteDebarasata(masa)){
            System.out.println("Masa este pregatita pentru un nou client");
        }else
            System.out.println("Masa inca nu este gata");
    }
}
