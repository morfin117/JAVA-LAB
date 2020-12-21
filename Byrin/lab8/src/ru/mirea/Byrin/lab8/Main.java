package ru.mirea.Byrin.lab8;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("/Users/user/lab8/src/ru/mirea/Byrin/lab8/note.txt", false);
            String text = "Бог не играет в кости";
            file.write(text);
            file.write("!!!");
            file.append('\n');
            file.append("Эйнштейн");
            file.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            FileReader reader = new FileReader("/Users/user/lab8/src/ru/mirea/Byrin/lab8/note.txt");
            int c;

            while((c=reader.read()) !=-1){
                System.out.print((char)c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}