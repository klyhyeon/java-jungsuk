package ch14_lambda_stream.lambda;

import java.util.function.Function;

public class LambdaEx6 {

    public static void main(String[] args) {
        Function<Integer, String> g = Integer::toBinaryString;
        Function<String, Integer> f = s -> Integer.parseInt(s, 16);
//        f.andThen(g);
        Function<Integer, Integer> h = f.compose(g);

        System.out.println(h.apply(2));
    }
}
