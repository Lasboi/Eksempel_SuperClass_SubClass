public class Main {

    public static void main(String[] args) {

        //Vi opretter nye objekter af vores subklasser
        Bil bil = new Bil();
        Cykel cykel = new Cykel();
        Fly fly = new Fly();
        Cykel cykel2 = new Cykel();

        //Vi sætter vores variabler fra superklassen i subklassen
        bil.wheels = 4;
        cykel.wheels = 2;
        fly.wheels = 3;

        bil.color = "Sort";
        cykel.color = "Regnbue";
        fly.color = "Blå";

        cykel2.color = "Orange";
        cykel2.model = "Badass";

        //Vi kalder metoderne som vi har overskrevet fra subklasserne
        cykel.honk();
        bil.honk();
        fly.honk();

        //Vi skriver en masse information ud til skærmen
        System.out.println("************************************");
        System.out.println("Bilens mærke er: " + bil.brand + " og modellen er: " + bil.model);
        System.out.println("Cyklens mærke er: " + cykel.brand + " og modellen er: " + cykel.model);
        System.out.println("Flyets mærke er: " + fly.brand + " og modellen er: " + fly.model);

        System.out.println("************************************");
        System.out.println("Bilen har " + bil.wheels + " dæk & " + bil.windows + " vinduer.");
        System.out.println("Cyklen har " + cykel.wheels + " dæk & 0 vinduer.");
        System.out.println("Flyet har " + fly.wheels + " dæk & " + fly.windows + " vinduer.");

        System.out.println("************************************");
        System.out.println("Bilens farve er: " + bil.color);
        System.out.println("Cyklens farve er: " + cykel.color);
        System.out.println("Fly farve er: " + fly.color);

        System.out.println("************************************");
        System.out.println("Cyklen har " + cykel.ringBell + " ringeklokke");
        System.out.println("Jeg er en ny Cykel, min model hedder " + cykel2.model + " og min farve er " + cykel2.color);




    }

}
