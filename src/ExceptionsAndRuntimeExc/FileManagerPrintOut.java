package ExceptionsAndRuntimeExc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManagerPrintOut {

    public static void main(String[] args) {

    //    Exception are failing while we COMPILE file
    //    Runtime Exceptions are while we RUN it

        try {
            run();
        } catch (FileNotExistException e) {
            System.out.println(e.getMessage());
        }



    }

    private static void run() throws FileNotExistException {
        File file = new File("test.txt");
        if (file.exists()) {
            Scanner scanner = null;
            try {
                scanner = new Scanner(file);
            } catch (FileNotFoundException e) {
                throw new FileNotExistException("File does not exist");
            }
            System.out.println(scanner.nextLine());
        } else {
            throw new FileNotExistException("File does not exist");
        }
    }
}
