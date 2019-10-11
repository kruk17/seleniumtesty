import java.util.Arrays;

public class TestTablicy {


    public static void main(String[] args) {

        Tablica tablica = new Tablica();

        String[]tab ={"a","b","c"};

        tablica.setHobby(tab);


        for (String x: tablica.getHobby()) {
            System.out.println(x);
        }

        for (int i = 0; i < tablica.getHobby().length ; i++) System.out.println(tablica.getHobby()[i]);
    }
}
