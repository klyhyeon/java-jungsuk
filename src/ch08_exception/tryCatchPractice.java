package ch08_exception;

import java.util.LinkedHashMap;
import java.util.Map;

public class tryCatchPractice {

    public static void main(String[] args) {
        Map<String, String> hashMap = new LinkedHashMap<>();
        hashMap.put("ele1", null);
        hashMap.put("ele2", "NotError");
        hashMap.put("ele3", "Error");

        for (String key : hashMap.keySet()) {
            try {
                if (hashMap.get(key).equals("NotError")) {
                    System.out.println("NotError");
                } else {
                    System.out.println("Error");
                    throw new IndexOutOfBoundsException("Error Test");
                }
            } catch (NullPointerException | IndexOutOfBoundsException e) {
                if (e instanceof NullPointerException) {
                    System.out.println("NPE occurred");
                } else {
                    System.out.println("IndexOutOfBounds occurred");
                }
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println(e.getClass() + " occurred");
                e.printStackTrace();
            } finally {
                System.out.println("current Key:[" + key + "]");
            }
        }
        System.out.println("end try catch");
    }
}
