package day4.collections.list.arraylist;

import java.util.ArrayList;

public class UserSessionManager {

    private ArrayList<String> activeUsers = new ArrayList<>();


    //Add a user to the list when they log in
    public void userLoggedIn(String name) {
        activeUsers.add(name);
        System.out.println(name + " has logged in.");
    }

    //Remove a user from the list when they log out.
    public void userLoggedOut(String name) {
        activeUsers.remove(name);
        System.out.println(name + " has logged out.");
    }


    //Check if a user is currently active
    public boolean isUserLoggedIn(String name) {
        return activeUsers.contains(name);
    }

    //Print all the active users
    public void printActiveUsers() {
        System.out.println("Active users:"+activeUsers);
    }


    public static void main(String[] args) {
        UserSessionManager sessionManager = new UserSessionManager();
        sessionManager.userLoggedIn("Bharath");
        sessionManager.userLoggedIn("Aegon");
        sessionManager.userLoggedIn("Daemon");

        sessionManager.printActiveUsers();


        System.out.println("Is Aegon is active? "+ sessionManager.isUserLoggedIn("Aegon"));
        System.out.println("Is Daerion logged in? "+ sessionManager.isUserLoggedIn("Daerion"));

        sessionManager.userLoggedOut("Daemon");
        sessionManager.printActiveUsers();

    }





}
