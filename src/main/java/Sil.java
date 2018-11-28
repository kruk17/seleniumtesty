import java.util.InputMismatchException;
import java.util.Scanner;

public class Sil {



    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj inta");

            int a = scanner.nextInt();
            int wynik = si(a);
            int wynikCiag = ciag(a);
        System.out.println(wynik);
        System.out.println(wynikCiag);




    }


    public static int si(int i){
        if (i < 1) {
            return 1;
        }
        else
            return i *si(i -1);
    }

    public static int ciag(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return ciag(i - 1) + ciag(i - 2);
        }

    }
}


