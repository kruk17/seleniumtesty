import java.lang.reflect.Array;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

public class Inne {




    public static void main(String[]args){

        int[] tab = {1, 3, 4, 11};
        System.out.println(tab[0]);
        System.out.println(tab.length);

        int[] tab3 = {99,91,30};

        Arrays.sort(tab3);
        System.out.println("arraytab3: "+tab3[0]);


        int[][]tab4={tab,tab3};
        System.out.println(tab4[0][3]);

        Random random = new Random();
        int r2 = random.nextInt(10000);
        System.out.println("random");
        System.out.println(r2*0.1);
        System.out.println(r2);


        Instant instant1 = Instant.now();
        Instant instant2 = Instant.now();

        System.out.println(instant1);
        System.out.println(instant2);

        Duration duration = Duration.between(instant1,instant2);

        System.out.println(duration);



        System.out.println(" ");

        int[][]tab2 = {
                {1, 2 ,7},
                {6, 5, 9},
                {99, 98,95},
                {90, 30 ,100},

        };


        System.out.println(tab2.length);
    }
}
