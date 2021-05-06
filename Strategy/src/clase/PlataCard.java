package clase;

public class PlataCard implements iPlata {
    @Override
    public void plateste(float sum) {
        System.out.println("Plateste Card "+sum);
    }
}
