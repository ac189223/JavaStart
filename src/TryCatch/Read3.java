package TryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read3 {

    public static void main(String[] args) {

        int tab[] = {1,2,3,4,5};
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int index = -1;

        System.out.println("Write an index of this field from the table, which value you would like to know: ");
        boolean czyPoprawne = false;

        while (!czyPoprawne) {
            try {
                index = Integer.parseInt(read.readLine());
            } catch (NumberFormatException n) {
                System.out.println("Unacceptable data!" + "\n Write an index from the table");
            } catch (IOException e) {
                System.out.println("Data read error");
            }
            czyPoprawne = index == -1? false : true;
            // same as below
            //if (index == -1) {czyPoprawne = false;} else {czyPoprawne = true;}
        }

        try {
            System.out.println(tab[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unacceptable index, size of the table is "+tab.length);
        }

    }

}

