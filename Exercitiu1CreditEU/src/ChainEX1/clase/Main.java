package ChainEX1.clase;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Jon",19,3000);
        Client client1=new Client("MGK",22,1700);

        Client client2=new Client("NBN",22,5000);

        ConditieSalariu conditieSalariu=new ConditieSalariu();
        ConditieVarsta conditieVarsta=new ConditieVarsta();

        conditieVarsta.setConditie(conditieSalariu);

        conditieVarsta.verificaConditie(client);
        conditieVarsta.verificaConditie(client1);
        conditieVarsta.verificaConditie(client2);
    }
}
