package com.hust.kstn.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        String filename = "2mb-examplefile-com.txt";
        byte[] inputBytes = { 0 };
        long startTime, endTime;
        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));

            startTime = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder(inputBytes.length);

            for (byte b : inputBytes) {
                sb.append((char) b);
            }

            String outputString = sb.toString();
            endTime = System.currentTimeMillis();

            System.out.println(endTime - startTime);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
