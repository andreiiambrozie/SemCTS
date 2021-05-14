package ChainEX1.clase;

public class ConditieVarsta extends Conditie{
    @Override
    public void verificaConditie(Client client) {
        if(client.getVarsta()>=21 && client.getVarsta()<=60){
            if(super.getConditie()!=null){
                super.getConditie().verificaConditie(client);
            }else
                System.out.println("Primeste credit");
        }else System.out.println("Nu are varsta");

            System.out.println(client);
    }
}
