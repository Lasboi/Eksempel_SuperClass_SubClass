public class Bil extends Koretoj {

    //Vores klasse variabler for subklassen
    protected String model = "X";

    protected int windows = 6;

    //Vi overskriver den metode som er arvet fra superklassen
    @Override
    public void honk() {
        System.out.print("Bilen siger: ");
        super.honk();
    }
}
