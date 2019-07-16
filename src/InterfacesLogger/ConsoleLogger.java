package InterfacesLogger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String text) {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        System.out.println(timeStamp + " " + text);                   // Prints log on the console
    }

    @Override
    public void error(String text) {
        // no activity but method must be implemented
    }

    @Override
    public void warn(String text) {
        // no activity but method must be implemented
    }


}
