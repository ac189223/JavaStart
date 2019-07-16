package InterfacesLogger;

public class Main_IL {

    public static void main(String[] args) {

        Logger logger1 = new ConsoleLogger();
        logger1.log("Test of logger");
        logger1.error("There was an error");
        logger1.warn("Warning! Something may not work correct!");

        Logger logger2 = new FileLogger();
        logger2.log("Test of logger");
        logger2.error("There was an error");
        logger2.warn("Warning! Something may not work correct!");


    }
}

