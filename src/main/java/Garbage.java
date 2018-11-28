import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Garbage {



    public static void main(String[]args){


        List<String> myList = new ArrayList<>();

        myList.add("Pierwszy");
        myList.add("Drugi");
        myList.add("trzeci");


        Iterator iter = myList.iterator();

        String pierwszy = iter.next().toString();
        System.out.println(pierwszy);
        String dwa = iter.next().toString();
        System.out.println(dwa);
    }
}
