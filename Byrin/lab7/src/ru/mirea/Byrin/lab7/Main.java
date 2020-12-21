package ru.mirea.Byrin.lab7;

import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> game = new ArrayList<String>();
        game.add("Марио");
        game.add("Тетрис");
        game.add("Сапер");

        for (String t : game) System.out.println(t);

        LinkedList<String> countries = new LinkedList<String>();
        countries.add("Япония");
        countries.add("Зимбабве");
        countries.add("Чили");
        countries.addFirst("Китай");
        countries.addLast("Болгария");
        countries.add(1, "Монголия");
        for (int i = 0; i < countries.size(); i++)
            System.out.println(countries.get(i));
        countries.remove(1);

        if (countries.contains("Болгария")) System.out.println("Есть такое государство");
        countries.remove(0);
        countries.remove("Зимбабве");

        for (String p : countries) {
            System.out.println(p);

        }
        LinkedList<CollectionApp> friends = new LinkedList<CollectionApp>();
        friends.add(new CollectionApp("Alfred"));
        friends.add(1, new CollectionApp("Tom"));
        friends.addFirst(new CollectionApp("Garry"));
        friends.addLast(new CollectionApp("Alex"));

        for(CollectionApp p : friends) System.out.println(p);
        friends.remove(1);
        for(CollectionApp p : friends) System.out.println(p);
        CollectionApp tmp = friends.getFirst();
        System.out.println(tmp);
    }
}