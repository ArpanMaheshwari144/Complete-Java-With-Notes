package com.company;

public class ClassLibrary {
    public static void main(String[] args) {
//        Library obj = new Library();
//        obj.addBook("Think and Grow Rich");
//        obj.addBook("Algorithms");
//        obj.addBook("C++");
//        obj.addBook("Java");
//        obj.showAvailableBooks();
//        obj.issueBook("Algorithms");
//        obj.showAvailableBooks();
//        obj.returnBook("Algorithms");
//        obj.showAvailableBooks();

        // OR

        Library obj = new Library();
        obj.addBook("Think and Grow Rich");
        obj.addBook("Algorithms");
        obj.addBook("C++");
        obj.addBook("Java");
        obj.showAvailableBooks();
        obj.issueBook("Algorithms");
        obj.showAvailableBooks();
        obj.returnBook("Algorithms");
        obj.showAvailableBooks();
    }
}

//class Library{
//    String[] books;
//    int no_of_books;
//    Library(){
//        this.books = new String[100];
//        this.no_of_books = 0;
//    }
//
//    void addBook(String book){
//        this.books[no_of_books] = book;
//        no_of_books++;
//        System.out.println(book + " book has been added");
//    }
//
//    void showAvailableBooks(){
//        System.out.println("Available Books are:- ");
//        for(String book : this.books){
//            if(book == null){
//                continue;
//            }
//            System.out.println("* " + book);
//        }
//    }
//
//    void issueBook(String book){
//        for(int i = 0; i < this.books.length; i++) {
//            if (this.books[i].equals(book)) {
//                System.out.println(book + " book has been issued!!");
//                this.books[i] = null;
//                return;
//            }
//        }
//        System.out.println("This book is not present in the Library");
//    }
//
//    void returnBook(String book){
//        addBook(book);
//    }
//}

// OR

class Library {
    private String[] availableBooks = new String[100];
    public String[] issuedBooks = new String[100];


    public void addBook(String bookName){

        for(int i = 0;i<availableBooks.length;i++){
            // Checking if book is already present in library
            if(availableBooks[i] == bookName){
                System.out.println("Book is already there in the library you are going to add another copy of the same book");
            }

            //Adding our book at first null value as array is declared for 100 elements
            if(availableBooks[i] == null){
                availableBooks[i] = bookName;
                System.out.println("Thanks For your contribution!!! Book '" + bookName + "' has been added in library");
                return;
            }
        }
    }

    public void showAvailableBooks(){
        // Display all books available in library
        System.out.println("Available books are");
        for (String book: availableBooks) {
            if(book == null){
                return;
            }
            System.out.println(book + "  ");
        }
    }

    public void showIssuedBooks(){
        //Display all books that are issued
        for (String element:issuedBooks) {
            if(element==null){
                return;
            }
            System.out.println(element);
        }
    }

    public void issueBook(String book){
        //Checking if book is available in library to issue
        boolean bookFound=false;
        for (int i=0;i<availableBooks.length-1;i++) {
            if(availableBooks[i] == book){
                bookFound = true;
            }
            //After verification Removing that book from available books
            if(bookFound == true){
                availableBooks[i] = availableBooks[i+1];
            }
        }
        //After verification adding book to issued books
        if(bookFound == true){
            for (int i =0 ;i<issuedBooks.length;i++) {
                if(issuedBooks[i] == null){
                    issuedBooks[i] = book;
                    System.out.println("Book '" + book + "' issued Successfully !!!");
                    return;
                }
            }
        }
        else{
            System.out.println("Book is not available right now!!!");
        }
    }

    public void returnBook(String book){
        //Checking if book is issued or not
        boolean bookFoundinissued = false;
        for (int i =0;i<issuedBooks.length;i++) {
            if (issuedBooks[i] == book){
                //Removing Book from issued books list
                bookFoundinissued = true;
                for (int j =i;j<issuedBooks.length - 1;j++){
                    issuedBooks[j] = issuedBooks[j+1];
                }
                break;
            }
        }
        //Adding book in available books list
        if(bookFoundinissued == true){
            for (int i = 0;i<availableBooks.length;i++) {
                if(availableBooks[i] == null){
                    availableBooks[i] = book;
                    System.out.println("Book '"+book+ "' is returned successfully!!!");
                    break;
                }
            }
        }
        else{
            System.out.println("It seems this book is not issued to anyone !!!");
        }
    }
}
