package InterfacesButton;

public class Main_IB {

    public static void main(String[] args) {

        Screen1 screen1 = new Screen1();                // Create a screen

        System.out.println("Application is running");

        try {
            Thread.sleep(3000);                          // Wait 3sek
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        screen1.getButton().click();                    // Push the button

    }
}

