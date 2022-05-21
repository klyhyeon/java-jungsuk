package ch14_lambda_stream.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx1 {

    public static void main(String[] args) {

        Arrays.setAll(new int[5], (i) -> (int) (Math.random() * 5) + 1);

        Collections.sort(List.of(), new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });

        Collections.sort(List.of("test1", "test2", "ddd"), (s1, s2) -> s2.compareTo(s1));

        Function<String, Integer> fNotMethodRef = s1 -> Integer.parseInt(s1);
        Function<String, Integer> f = Integer::parseInt;

        BiFunction<String, String, Boolean> bfNotMethodRef = (s1, s2) -> s1.equals(s2);
        BiFunction<String, String, Boolean> bf = String::equals;

        Supplier<LambdaEx4> sNotMethodRef = () -> new LambdaEx4();
        Supplier<LambdaEx4> s = LambdaEx4::new;

        Predicate<String> isEmptyStr = str -> str.length() == 0;
    }

    public int notLambda() {
        return (int) (Math.random() * 5) + 1;
    }
}
