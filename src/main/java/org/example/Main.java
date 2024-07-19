package org.example;

public class Main {
    public static void main(String[] args) {

        PracticeSet names = new PracticeSet(new String[]{"Igor","Vlad","Viktor","Boris"});
        System.out.println(names.search("Vlad")?"contains":"nope");
        System.out.println(names.search("Blad")?"contains":"nope");
        names.addNewName("Oleg");
        names.deleteOldName(2);
        System.out.println(names);



    }
}