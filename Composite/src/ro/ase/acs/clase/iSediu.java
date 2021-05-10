package ro.ase.acs.clase;

public interface iSediu {
    public void afiseazaDescriere();
    public void adaugaNod(iSediu iSediu) throws Exception;
    public void stergeNod(iSediu iSediu) throws Exception;
    public iSediu getNod(int poz) throws Exception;
}
