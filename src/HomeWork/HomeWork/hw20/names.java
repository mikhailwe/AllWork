package HomeWork.HomeWork.hw20;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class names {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna","Bob","Julia","Andrey");
        Collections.sort(names,new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(names);

        names = Arrays.asList("Anna","Bob","Julia","Andrey");
        names.sort((o1, o2) -> -1);
        System.out.println(names);
    }
}
