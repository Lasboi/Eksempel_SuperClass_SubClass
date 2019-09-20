public class Koretoj {

    //Variablerne som subklasserne kommer til at arve fra denne superklasse

    protected String brand = "Tesla";

    protected int wheels;

    protected String color;


    //Metoden som subklasserne kommer til at arve fra denne superklasse
    public void honk() {
        System.out.println("BEEP BEEP!");
    }
}
