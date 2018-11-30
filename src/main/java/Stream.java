import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {


    public static void main(String[]args){

        Integer[] arrays = {1, 3, 100 ,15 ,13, 12};
        List<Integer> list = Arrays.asList(arrays);

         list = list.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toList());

        System.out.println(list);

    }
}
