package clase.composite;

public class Sectie implements iComponentaAbstracta{

    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void descrie() {
        System.out.println("-->Sectie: "+this.nume);
    }

    @Override
    public void addNod(iComponentaAbstracta componenta) throws Exception {
        throw new Exception("N am impl");
    }

    @Override
    public void removeNod(iComponentaAbstracta componenta) throws Exception {
        throw new Exception("N am impl");
    }

    @Override
    public iComponentaAbstracta getNod(int position) throws Exception {
        throw new Exception("N am impl");
    }
}
