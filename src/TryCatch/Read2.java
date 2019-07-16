package TryCatch;

import java.util.Scanner;

public class Read2 {

    public static void main(String[] args) {

        int tab[] = {1,2,3,4,5};
        Scanner read = new Scanner(System.in);
        int index = -1;

        System.out.println("Write an index of this field from the table, which value you would like to know: ");
        index = read.nextInt();


        try {
            System.out.println(tab[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unacceptable index, size of the table is "+tab.length);
        }

    }

}

