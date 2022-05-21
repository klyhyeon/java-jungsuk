package ch15.practice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice1 {

    public static void main(String[] args) {
        //14-5
        String[] strArr = {"aaa", "bb", "c", "dddd"};
        int answer = Arrays.stream(strArr)
                .map(String::length)
                .reduce((a, b) -> a + b).get();
        System.out.println(answer);

        //14-8
        // groupingBy()에서 사용
        Student[] stuArr = {
                new Student("나자바", true, 1, 1, 300),
                new Student("김자바", true, 1, 1, 200),
                new Student("남자바", true, 1, 2, 100),
                new Student("이자바", true, 1, 3, 200),
                new Student("나자바", true, 2, 1, 300),
                new Student("김자바", true, 2, 1, 200),
                new Student("남자바", true, 2, 2, 100),
                new Student("이자바", true, 2, 3, 200),
                new Student("김지미", false, 1, 1, 250),
                new Student("이지미", false, 1, 2, 150),
                new Student("안지미", false, 1, 2, 50),
                new Student("황지미", false, 1, 3, 100),
                new Student("강지미", false, 1, 3, 150),
                new Student("김지미", false, 2, 1, 250),
                new Student("이지미", false, 2, 2, 150),
                new Student("안지미", false, 2, 2, 50),
                new Student("황지미", false, 2, 3, 100),
                new Student("강지미", false, 2, 3, 150),
        };
        Map<Boolean, Map<Boolean, Long>> failedStuBySex = Arrays.stream(stuArr)
                .collect(
                        Collectors.partitioningBy(
                                Student::isMale, Collectors.partitioningBy(
                                        s -> s.getScore() <= 100, Collectors.counting())
                        )
                );
        long failedFemaleStuNum = failedStuBySex.get(false).get(true);
        long failedMaleStuNum = failedStuBySex.get(true).get(true);
        System.out.println("불합격[남자]:" + failedMaleStuNum + "명");
        System.out.println("불합격[여자]:" + failedFemaleStuNum + "명");


        Map<Integer, Map<Integer, Long>> totalScoreByHakAndBan = Arrays.stream(stuArr)
                .collect(Collectors.groupingBy(
                                Student::getHak,
                                Collectors.groupingBy(
                                        Student::getBan, Collectors.summingLong(Student::getScore)
                                )
                        )
                );
        for (Object e : totalScoreByHakAndBan.entrySet()) {
            System.out.println(e);
        }

        // 1={1=750, 2=300, 3=450}
        // 2={1=750, 2=300, 3=450}
    }
}

//14-8
class Student {

    String name;
    boolean isMale; // 성별
    int hak; // 학년
    int ban; // 반
    int score;

    Student(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    String getName() {
        return name;
    }

    boolean isMale() {
        return isMale;
    }

    int getHak() {
        return hak;
    }

    int getBan() {
        return ban;
    }

    int getScore() {
        return score;
    }

    public String toString() {
        return String.format("[%s, %s, %d학년 %d반, %3d점]", name, isMale ?
                "남" : "여", hak, ban, score);
    }

    enum Level {
        HIGH, MID, LOW
    } //성적을상,중,하세단계로분류
}