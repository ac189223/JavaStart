package InterfacesLogger;

import java.io.File;                        //Import method to create file
import java.io.FileWriter;                  //Import method to write in file
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger implements Logger {

    @Override
    public void log(String text) {

        // try to do sth but if impossible than catch other thing
        try {
            String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            File file = new File("InterfejsyLogger_logs.txt");
            FileWriter writer = new FileWriter(file, true);
            if (file.exists()) {
                writer.append(timeStamp + " " + text + "\n");
                writer.close();
            } else {
                writer.write(timeStamp + " " + text + "\n");
                writer.close();
            }
        } catch (IOException e) {
            //ignore
            //There can be exceptions - we just ignore them
        }
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
