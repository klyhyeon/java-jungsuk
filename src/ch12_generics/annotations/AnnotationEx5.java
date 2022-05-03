package ch12_generics.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@TestInfo(testedBy="baekho", testDate=@DateTime(yyyymmdd="20220504", hhmmss="124849"))
public class AnnotationEx5 {

    public static void main(String[] args) {
        Class<AnnotationEx5> cls = AnnotationEx5.class;
        TestInfo ti = cls.getAnnotation(TestInfo.class);
        System.out.println("TestInfo testedBy: " + ti.testedBy());
        System.out.println("TestInfo testDate: " + ti.testDate().yyyymmdd() + " " + ti.testDate().hhmmss());

        for (String tool : ti.testTools()) {
            System.out.println(tool);
        }

        for (Annotation a : cls.getAnnotations()) {
            System.out.println(a);
        }
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo {

    String testedBy() default "user1";
    DateTime testDate();
    String[] testTools() default "Junit";
}

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime {
    String yyyymmdd();
    String hhmmss();
}