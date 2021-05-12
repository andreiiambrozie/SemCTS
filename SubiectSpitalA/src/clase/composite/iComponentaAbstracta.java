package clase.composite;

public interface iComponentaAbstracta {

    public void descrie();
    public void addNod(iComponentaAbstracta componenta) throws Exception;
    public void removeNod(iComponentaAbstracta componenta)throws Exception;
    public iComponentaAbstracta getNod(int position) throws Exception;
}
