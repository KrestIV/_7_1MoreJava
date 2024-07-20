package org.example;

public class Main {
    public static void main(String[] args) {

        PracticeList names = new PracticeList(new String[]{"Igor","Vlad","Viktor","Ivan"});
        System.out.println(names.search("Vlad")?"contains":"nope");
        System.out.println(names.search("Blad")?"contains":"nope");
        names.addNewName("Kirill");
        names.deleteOldName(2);
        System.out.println(names + "\n");

        PracticeSet nickNames = new PracticeSet(new String[]{"Bloody","Stacker","Tooth","Silver dodger"});
        System.out.println(nickNames.search("Tooth")?"contains":"nope");
        System.out.println(nickNames.search("Tool")?"contains":"nope");
        nickNames.addNew("Batty");
        nickNames.deleteOld("Bloody");
        System.out.println(nickNames + "\n");

        PracticeQueue clients = new PracticeQueue(new String[]{"Doc","Grumpy","Sleepy","Bashful","Happy","Sneezy"});
        System.out.println(clients.search("Grumpy")?"contains":"nope");
        System.out.println(clients.search("Sneazy")?"contains":"nope");
        clients.addNew("Dopey");
        clients.deleteFirst();
        System.out.println(clients + "\n");

        PracticeMap groceries = new PracticeMap(new String[]{"Carrot","Milk","Bread","Yogurt","Tomato"});
        System.out.println(groceries.search(2)?"contains":"nope");
        System.out.println(groceries.search(10)?"contains":"nope");
        groceries.addNew("Peach");
        groceries.deleteOld(0);
        System.out.println(groceries + "\n");
    }
}