package clase;

public class PlataCash implements iPlata {
    @Override
    public void plateste(float sum) {
        System.out.println("Plateste cash "+sum);
    }
}
