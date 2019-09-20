public class Fly extends Koretoj{

    //Vores klasse variabler for subklassen
    protected String model = "F47";

    protected int windows = 142;

    //Vi overskriver metoden fra superklassen og laver den til vores egen
    @Override
    public void honk() {
        System.out.print("Flyet siger: ");
        System.out.println("WHEEEEEEEEEEZ");;
    }
}
