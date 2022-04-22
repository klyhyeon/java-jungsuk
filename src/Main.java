import ch09_.Item13;

import java.util.Arrays;

public class Main {


    void test() {
    }

    public static void main(String[] args) {
//        Practice.Child p = new Practice().new Child();

//        Item13 test01 = new Item13(1, new int[]{1,2,3});
//        Item13 test02 = test01.clone();
//
//        System.out.println(Arrays.toString(test02.arr));  // [1,2,3]
//
//        test02.arr[0] = 100; //클론 객체 0번 값 변경
//        System.out.println(Arrays.toString(test01.arr));  //[100, 2, 3] test01, test02가 참조하는 값이 모두 바뀌어버림
//        System.out.println(Arrays.toString(test02.arr));
//
//
        Item13 test03 = new Item13(2, new int[]{1,2,3});
        Item13 test04 = test03.copy();
        test04.arr[0] = 100;
        System.out.println(Arrays.toString(test03.arr));  // [1, 2, 3]
        System.out.println(Arrays.toString(test04.arr));  // [100, 2, 3]
    }


}
