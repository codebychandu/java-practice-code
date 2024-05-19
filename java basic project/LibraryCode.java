// Problem Statement:
//    You have to implement a library using Java Class "Library"//
//      Methods: addBook(), issueBook(), returnBook(), showAvailableBooks()
//      Properties: Array to store the available AvailableBooks,
//      Array to store the issued AvailableBooks

class Library{
    String[] AvailableBooks = new String[100];
    String[] IssuedBooks = new String[100];
    int NumberOfAvailableBooks = 0;
    int NumberOfIssuedBooks = 0;

    void showAvailableBooks(){
        System.out.println("The available books are: ");
        for (int i = 0; i < this.AvailableBooks.length; i++){
            if (this.AvailableBooks[i] == null){
                continue;
            }
            System.out.println("* " + this.AvailableBooks[i]);
        }
    }
    void showIssuedBooks(){
        System.out.println("The issued books are: ");
        for (int i = 0; i < this.IssuedBooks.length; i++){
            if (this.IssuedBooks[i] == null){
                continue;
            }
            System.out.println("* " + this.IssuedBooks[i]);
        }
    }
    void addBook(String Book){
        this.AvailableBooks[this.NumberOfAvailableBooks] = Book;
        this.NumberOfAvailableBooks++;
        System.out.println("The book " + Book + " has been added.");
    }
    void issueBook(String Book){
        boolean BookFound = false;
        for (int i = 0; i < this.AvailableBooks.length; i++) {
            if (this.AvailableBooks[i] == Book){
                // Remove the book from AvailableBooks Array
                    for (int j = i; j < this.AvailableBooks.length-1; j++) {
                        this.AvailableBooks[j] = this.AvailableBooks[j+1];
                    }
                    this.NumberOfAvailableBooks--;

                // Add the book into IssuedBooks Array
                    this.IssuedBooks[this.NumberOfIssuedBooks] = Book;
                    NumberOfIssuedBooks++;

                // Notify that the book has been issued
                    System.out.println("The book " + Book + " has been issued.");

                // I found the book
                    BookFound = true;

                // Break from the loop
                    break;

            }
        }
        if (!BookFound){
            System.out.println("The book you've entered is not available.");
        }
    }
    void returnBook(String Book){
        boolean IdentifyBook = false;
        for (int i = 0; i < this.IssuedBooks.length; i++) {
            if (this.IssuedBooks[i] == Book){
                // Remove the book from IssuedBooks Array
                    for (int j = i; j < this.IssuedBooks.length-1; j++) {
                        this.IssuedBooks[j] = this.IssuedBooks[j+1];
                    }
                    this.NumberOfIssuedBooks--;

                // Add the book in AvailableBooks Array
                    this.AvailableBooks[this.NumberOfAvailableBooks] = Book;
                    this.NumberOfAvailableBooks++;

                // Confirm Identification
                    IdentifyBook = true;

                // Break from the loop
                    break;

            }
        }

        if (!IdentifyBook){
            System.out.println("The book " + Book + " doesn't belong to our Library.");
        }
    }
}
public class LibraryCode {
    public static void main(String[] args) {
        Library Lib = new Library();

        Lib.addBook("Rich Dad Poor Dad");
        Lib.addBook("Don Quixote");
        Lib.addBook("Lord of the Rings");
        Lib.addBook("Lord of the Rings");
        Lib.addBook("The Lion, the Witch, and the Wardrobe");
        Lib.addBook("Harry Potter and the Sorcerer's Stone");
        Lib.addBook("Bhagavad Gita");
        Lib.addBook("How to crack JEE in one minute");
        Lib.addBook("C++");
        Lib.addBook("Java");
        System.out.println();

        Lib.showAvailableBooks();
        System.out.println();

        Lib.issueBook("Lord of the Rings");
        System.out.println();

        Lib.showAvailableBooks();
        System.out.println();

        Lib.issueBook("Lord");
        System.out.println();

        Lib.showAvailableBooks();
        System.out.println();

        Lib.showIssuedBooks();
        System.out.println();

        Lib.returnBook("Lord of the Rings");
        System.out.println();

        Lib.showIssuedBooks();
        System.out.println();

        Lib.showAvailableBooks();
        System.out.println();

        Lib.returnBook("uhhjhj");
        System.out.println();

    }

}