import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.stream.Collectors;



public class Stream {


    public static void main(String[]args) {

        Integer[] arrays = {1, 3, 100, 15, 13, 12, 111, 20, 24, 90, 80};
        List<Integer> list = Arrays.asList(arrays);

        list = list.stream()
                .filter(x -> x % 2 == 0 && x > 12)
                .collect(Collectors.toList());

        System.out.println(list);
        list.forEach(System.out::println);

        forik(list);


    }



        public static <T> void forik(List<T> listeczka){
            for (T a: listeczka) {

                listeczka.add(a);
            }
        }

}
