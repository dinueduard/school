package oop.streams;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class Write {
    public static void main(String[] args) {
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("src/oop/streams/numbers.txt", true) );
            writer.append("6");
            writer.append("7");
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
