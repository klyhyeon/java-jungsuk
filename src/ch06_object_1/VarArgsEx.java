package ch06_object_1;

public class VarArgsEx {

    public static void main(String[] args) {
        System.out.println(concatenate("-", new String[]{"100", "200", "300"}));
        System.out.println(concatenate("1", "2"));
    }


    static String concatenate(String delim, String... args) {
        String result = "";

        for (String ele : args) {
            result += ele + delim;
        }
        return result;
    }

//    static String concatenate(String... args) {
//        return concatenate("", args);
//    }
}
