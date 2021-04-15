package ro.ase.cts.clase;

public class NotaDePlata implements iNota{
    private float sumaDePlata;

    public NotaDePlata(float sumaDePlata) {
        this.sumaDePlata = sumaDePlata;
    }

    public float getSumaDePlata() {
        return sumaDePlata;
    }


    @Override
    public void printeazaNota() {
        System.out.println(String.format("S-a printat nota cu suma: %f",sumaDePlata));
    }
}
