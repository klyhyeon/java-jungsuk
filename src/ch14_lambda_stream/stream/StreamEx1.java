package ch14_lambda_stream.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {

    static Student yuhyeon = new Student(2, 80, "yuhyeon");
    static Student jaewon = new Student(1, 95, "jaewon");
    static Student sodam = new Student(1, 100, "sodam");

    public static void main(String[] args) {
        middleOperator();
        finalOperator();
    }

    public static void middleOperator() {
        //skip, limit
        System.out.println("skip, limit example:");
        int[] ints = {1,2,3,4,5,6,6,7};
        IntStream intStream = Arrays.stream(ints);
        intStream.skip(2).limit(2).forEach(System.out::println);

        //filter, distinct
        System.out.println("filter example:");
        IntStream intStream2 = Arrays.stream(ints);
        intStream2.filter(i -> i > 3)
                .filter(i -> i % 2 != 0)
                .forEach(System.out::println);
        System.out.println("distinct example:");
        IntStream intStream3 = Arrays.stream(ints);
        intStream3.distinct().forEach(System.out::println);

        //sorted
        System.out.println("sorted example:");

        Stream<Student> studentStream = Stream.of(yuhyeon, jaewon, sodam);

        studentStream.sorted(Comparator.comparing(Student::getBan)
                .thenComparing(Student::getScore, (s1, s2) -> s2 - s1)
//                .thenComparing(Student::getScore,Comparator.reverseOrder())
                .thenComparing(Student::getName))
                .forEach(System.out::println);

        //flatMap
        System.out.println("flatMap example:");
        Stream<String[]> strArrStream = Stream.of(
                new String[]{"abc","def","ghi"},
                new String[]{"ABC","GHI","JKLMN"}
        );
        strArrStream.flatMap(Arrays::stream).forEach(System.out::println);
//        strArrStream.map(Arrays::stream).forEach(System.out::println);

        String[] lines = {
                "Believe or not It is true",
                "Do or do not There is no try",
        };
        Stream<String> lineStream = Arrays.stream(lines);
        lineStream.flatMap(line -> Stream.of(line.split(" ")))
                .map(String::toLowerCase)
                .distinct()
                .forEach(System.out::println);

        //optional
        System.out.println("optional example:");
//        Optional<String> optionalStr = Optional.of("abc");
        Optional<String> optionalStr = Optional.ofNullable(null);
        String optionalVal = optionalStr.orElse("def");
        System.out.println(optionalVal);

        int result = Optional.of("123")
                .filter(str -> str.length() > 0)
                .map(Integer::parseInt).orElse(-1);
        System.out.println(result + 100);
    }

    public static void finalOperator() {
        //reduce
        System.out.println("reduce example:");
        IntStream intStreamF = IntStream.of(1,2,3,4,5,6,7,7);
        int max = intStreamF.reduce((a,b) -> a > b? a : b).getAsInt();
        System.out.println(max);

        String[] strArr = {
                "Inheritance", "Java", "Lambda", "stream",
                "OptionalDouble", "IntStream", "count", "sum"
        };
        IntStream strArrToIntStream = Arrays.stream(strArr).mapToInt(String::length);
//        int count = strArrToIntStream.reduce(0, (a,b) -> a + 1);
        long count = strArrToIntStream.count();
        System.out.println(count);

        //collect
        System.out.println("collect examples:");
        Stream<Student> studentStream = Stream.of(yuhyeon, jaewon, sodam);
        Stream<Student> studentStream1 = Stream.of(yuhyeon, jaewon, sodam);
        Stream<Student> studentStream2 = Stream.of(yuhyeon, jaewon, sodam);
        List<String> names = studentStream.map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(names);
        Map<String,Student> studentsMap = studentStream1.collect(
                Collectors.toMap(Student::getName, s -> s)
        );
        System.out.println(studentsMap);
//        Student[] studentArr = studentStream2.toArray(new Student[5]);
//        Student[] studentArr = studentStream2.toArray(Student[]::new);
//        System.out.println(studentArr.length);

    }
}
