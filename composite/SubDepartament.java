package clase.composite;

public class SubDepartament implements iComponentaAbstracta{
    private String nume;

    public SubDepartament(String nume) {
        this.nume = nume;
    }

    @Override
    public void descrie() {
        System.out.println("-->Subdepartament: "+this.nume);
    }

    @Override
    public void addNod(iComponentaAbstracta componenta) throws Exception {
        throw new Exception("Nu e impl");
    }

    @Override
    public void removeNod(iComponentaAbstracta componenta) throws Exception {
        throw new Exception("Nu e impl");
    }

    @Override
    public iComponentaAbstracta getNod(int position) throws Exception {
        throw new Exception("Nu e impl");
    }
}
