import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegeXp {

@Test
public static void pat() {
    Pattern pattern = Pattern.compile("kr?uk");         //optional przed

    System.out.println(pattern.matcher("uk").find());
    System.out.println(pattern.matcher("krukus").find());
    System.out.println(pattern.matcher("kuk").matches());
    System.out.println(pattern.matcher("krukus").matches());

}

@Test
public static void pat2(){
    Pattern pattern = Pattern.compile("[0-9]{1,3}.{1}[0-9]{1,6}");
    Matcher liczba1 = pattern.matcher("111.3345");
    Matcher liczba2 = pattern.matcher("1.1");

    System.out.println(liczba1.find());
    System.out.println(liczba2.matches());

}

    @Test
    public static void pat3(){
        Pattern pattern = Pattern.compile("\\d{1,3}.{1}\\d{1,6}");
        Matcher liczba1 = pattern.matcher("111.3345");
        Matcher liczba2 = pattern.matcher("1.1");

        System.out.println(liczba1.find());
        System.out.println(liczba2.matches());

    }

    /// [^a-zA-z] - negacja   a+ - co najmniej raz lub wiecej   a* = 0,albo wiecej a  \. - doslowna kropka   a?  nic albo a.
    //   .+ = dowolny symbol przyjajmniej raz      .* = dodowlny symbol 0, albo wiecej


}





