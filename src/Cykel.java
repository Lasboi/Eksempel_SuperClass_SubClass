public class Cykel extends Koretoj {

    //Vores klasse variabler for subklassen
    protected String model = "Gangsta";

    protected int ringBell = 1;

    //Vi overskriver superklasse metoden og laver den til vores egen
    @Override
    public void honk() {
        System.out.print("Cyklen siger: ");
        System.out.println("RING RING!");
    }
}
