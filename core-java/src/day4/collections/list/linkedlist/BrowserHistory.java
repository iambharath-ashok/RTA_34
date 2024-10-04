package day4.collections.list.linkedlist;

import java.util.LinkedList;

public class BrowserHistory {

    private LinkedList<String> history;// to store the browsing history of user
    private LinkedList<String> forwardStack; // to store the pages that can be navigated forward to

    public BrowserHistory() {
        history = new LinkedList<>();
        forwardStack = new LinkedList<>();
    }


    public void visit(String url) {
        history.add(url);
        forwardStack.clear(); // clear forward stack when new page is visited
        System.out.println("Visited:: "+ url);
    }

    // navigating back functionality
    public void back() {
        if (this.history.size() > 1) {
            String lastVisited = history.removeLast();
            forwardStack.add(lastVisited);
            System.out.println("Back to "+ history.getLast());
        }
    }


    public void forward() {
        if (!this.forwardStack.isEmpty()) {
            String nextPage = forwardStack.removeLast();
            history.add(nextPage);
            System.out.println("Forward to:: "+ nextPage);
        } else {
            System.out.println("No forward page available");
        }
    }

    public void printHistory() {
        System.out.println("History:: "+ this.history);
        System.out.println("Forward Stack:: "+ forwardStack);
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();

        browserHistory.visit("www.google.com");
        browserHistory.visit("www.github.com");
        browserHistory.visit("www.instagram.com");
        browserHistory.visit("www.stackoverflow.com");

        browserHistory.printHistory();

        browserHistory.back();
        browserHistory.printHistory();

        browserHistory.back();
        browserHistory.printHistory();

        browserHistory.forward();
        browserHistory.printHistory();
    }
}
