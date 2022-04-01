package ch06_object_1;

public class DocumentTest {

    public static void main(String[] args) {
        DocumentTest d1 = new DocumentTest();
        DocumentTest d2 = new DocumentTest("자바.txt");
        DocumentTest d3 = new DocumentTest();
        DocumentTest d4 = new DocumentTest();
    }

    static int count = 0;
    String name;

    DocumentTest() {
        this("제묵없음" + ++count);
    }

    public DocumentTest(String name) {
        this.name = name;
        System.out.println("문서 " + this.name + "가 생성되었습니다.");
    }
}
