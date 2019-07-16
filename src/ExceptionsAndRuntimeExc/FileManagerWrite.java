package ExceptionsAndRuntimeExc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManagerWrite {

    public static void main(String[] args) {

    //    Exception are failing while we COMPILE file
    //    Runtime Exceptions are while we RUN it

        try {
            run();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void run() throws IOException {
        File file = new File("test.txt");

        FileWriter writer = new FileWriter(file);
        writer.write("just a test");
        writer.close();
    }
}
