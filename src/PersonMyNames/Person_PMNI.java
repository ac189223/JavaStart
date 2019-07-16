package PersonMyNames;

public class Person_PMNI {

    static int ileRazy;
    int ileRazyP;

    String name;
    int age;
    boolean isAlive;
    boolean isWorking;


    void przedstawSie(boolean formal) {
        if (formal) {
            System.out.println("Dzien dobry. Nazywam sie " + name + ". Mam " + age + " lat.");
            ileRazy++;
            ileRazyP++;
        } else {
            System.out.println("Hej ! Jestem " + name + ".");
            ileRazy++;
            ileRazyP++;
        }
    }

    String potwierdzImie() {
        return "Tak jak mowilem, jestem " + name + ".";
    }

    static int iloscPrzedstawien() {
        return ileRazy;
    }

    int iloscPrzedstawienP() {
        return ileRazyP;
    }

}

