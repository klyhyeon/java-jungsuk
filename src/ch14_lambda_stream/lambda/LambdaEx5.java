package ch14_lambda_stream.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx5 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.replaceAll(i -> i * 10);

        Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1;
        Consumer<Integer> c = i -> System.out.println(i + " ");
        Predicate<Integer> p = i -> i % 2 == 0;
        Function<Integer, String> f = i -> String.valueOf(i / 10 * 10);
    }
}
