package ChainEX1.clase;

public class ConditieSalariu extends Conditie{
    @Override
    public void verificaConditie(Client client) {
        if(client.getSalariu()>=2500){
            if(super.getConditie()!=null){
                super.getConditie().verificaConditie(client);
            }else
            {
                System.out.println("Acorda credit");
            }
        }else System.out.println("Nu indepl salariu");

        System.out.println(client);
    }
}
