package ru.mirea.Byrin.lab2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Edgar Allan Poe", "edgarpoe@gmail.com", 'M');
        System.out.println(a1);
        Author a2 = new Author("Vladimir Vladimirovich Nabokov", "vvnabokov@gmail.com", 'M');
        System.out.println(a2);
        Author a3 = new Author("Joanne Kathleen Rowling", "jkrowling@gmail.com", 'F');
        System.out.println(a3);
    }
}
