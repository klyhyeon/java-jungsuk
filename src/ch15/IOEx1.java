package ch15;

import java.io.*;
import java.util.Arrays;

public class IOEx1 {

    public static void main(String[] args) throws IOException {

        //byteArrayStream
        System.out.println("byte array stream examples:");
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,8,9};
        byte[] outSrc = null;

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        int data = 0;

        while ((data = input.read()) != -1) {
            output.write(data);
        }

        outSrc = output.toByteArray();

        System.out.println("Input Source : " + Arrays.toString(inSrc));
        System.out.println("Output Source : " + Arrays.toString(outSrc));

        //fileStream
        //커맨드에서 실행
//        System.out.println("file stream examples:");
//        FileInputStream fis = new FileInputStream(args[0]);
//        int data1 = 0;
//
//        while ((data1 = fis.read()) != -1) {
//            char c = (char) data1;
//            System.out.print(c);
//        }

        //buffered stream
        System.out.println("buffered stream examples:");
        FileOutputStream fos = new FileOutputStream("123.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
        for (int i = '1'; i <= '9'; i++) {
            bos.write(i);
        }
//        fos.close();
        bos.close();
    }
}
