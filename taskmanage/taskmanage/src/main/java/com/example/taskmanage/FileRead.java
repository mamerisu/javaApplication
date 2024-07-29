package com.example.taskmanage;
import java.io.FileReader;
import java.io.IOException;
public class FileRead {
    public static void main(String[] args) {
        String filePath = "output.txt";
        FileReader reader = null;
        try {
            reader = new FileReader(filePath);
            int character = 0;
            String str = ""
                    ;
            while (character != -1) {
                character = reader.read();
                //整数になってしまった文字を元に戻す
                str = str + (char)character;
            }
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}