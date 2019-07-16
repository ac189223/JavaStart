package ExceptionsAndRuntimeExc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManagerScan {

    public static void main(String[] args) {

    //    Exception are failing while we COMPILE file
    //    Runtime Exceptions are while we RUN it

        // IO Exceptions - Input/Output - handling files etc
        File file = new File("test.txt");
        boolean exists = file.exists();

        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            // System.out.println(e.getMessage());
            System.out.println("No such file");
        }




    }
}
