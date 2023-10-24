package javaapplication27;
class Library {
    private int inventory;

    public Library(int inventory) {
        this.inventory = inventory;
    }

    public synchronized boolean checkoutBook() {
        if (inventory > 0) {
            inventory--;
            return true;
        }
        return false;
    }

    public synchronized void returnBook() {
        inventory++;
    }
}

class User extends Thread {
    private Library library;

    public User(Library library) {
        this.library = library;
    }

    public void run() {
        if (library.checkoutBook()) {
            System.out.println(getName() + " checked out a book.");
            try {
                Thread.sleep(2000); // Simulate reading the book
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            library.returnBook();
            System.out.println(getName() + " returned the book.");
        } else {
            System.out.println(getName() + " couldn't check out a book.");
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library(5);

        User user1 = new User(library);
        User user2 = new User(library);
        User user3 = new User(library);

        user1.start();
        user2.start();
        user3.start();
    }
}

