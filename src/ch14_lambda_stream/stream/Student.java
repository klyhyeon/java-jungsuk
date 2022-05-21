package ch14_lambda_stream.stream;

public class Student {

    private final int ban;
    private final int score;
    private final String name;

    public Student(int ban, int score, String name) {
        this.ban = ban;
        this.score = score;
        this.name = name;
    }

    public int getBan() {
        return ban;
    }
    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ban=" + ban +
                ", score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}
