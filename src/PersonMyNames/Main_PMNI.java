package PersonMyNames;

public class Main_PMNI {
    public static void main(String[] args) {

        Person_PMNI pawel = new Person_PMNI();
        pawel.name = "Pawel";
        pawel.age = 18;
        pawel.isAlive = true;
        pawel.isWorking = true;

        Person_PMNI mikolaj = new Person_PMNI();
        mikolaj.name = "Mikolaj";
        mikolaj.age = 100;

        pawel.przedstawSie(false);
        mikolaj.przedstawSie(false);
        pawel.przedstawSie(true);

        String potwierdzenie = pawel.potwierdzImie();
        System.out.println(potwierdzenie);

        int ilosc = Person_PMNI.iloscPrzedstawien();
        System.out.println("Przedstawili sie " + ilosc + " razy.");

        int iloscM = mikolaj.iloscPrzedstawienP();
        System.out.println(mikolaj.name + " przedstawil sie " + iloscM + " razy.");

        int iloscP = pawel.iloscPrzedstawienP();
        System.out.println(pawel.name + "przedstawil sie " + iloscP + " razy.");



    }


}

