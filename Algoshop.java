/*
* README
* ======
*
* This is simple source code for bookstore application.
* The functional requirement that you needed to help you understand the user story has been written.
*
* Your mission is :
*
* 1. Complete these source code at "PLACE YOUR CODE HERE" parts and run them without any error.
* 2. The result has to be:
*    1:true
*    2:true
*    3:true
*    4:true
*    5:true
* 3. Send the source code file with your answers.
*/

import java.util.*;

public class App {

    public static void main(String[] args) {

        Shop shop = new Shop();

        List<Book> books = Arrays.asList(
            new Book("The Fellowship of the Ring", "J.R.R. Tolkien"),
            new Book("The Two Towers", "J.R.R. Tolkien"),
            new Book("The Return of the King", "J.R.R. Tolkien"),
            new Book("The Hobbit", "J.R.R. Tolkien"),
            new Book("Harry Potter and the Sorcerer\"s Stone", "J.K. Rowling"),
            new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling"),
            new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling"),
            new Book("Harry Potter and the Goblet of Fire", "J.K. Rowling"),
            new Book("Harry Potter and the Order of the Phoenix", "J.K. Rowling"),
            new Book("Harry Potter and the Half-Blood Prince", "J.K. Rowling"),
            new Book("Harry Potter and the Deathly Hallows", "J.K. Rowling")
        );

        for (Book book : books) {
            shop.bookAdd(book);
        }

        // Ahmad goes to the bookstore.
        // He looks for a book title "Two Towers"
        // If the book is there, he puts it on book cart.

        Person ahmad = new Person("Ahmad Ramadhan");

        Boolean available = shop.bookIsAvailable("The Two Towers");

        if(available) {

            Book book = shop.bookGet("The Two Towers");
            ahmad.addToBag(book);

            System.out.println("1: true");
        } else {
            System.out.println("1: false");
        }

        // Ahmad goes to bookcase collection from author J.K. Rowling
        // He looks for a book title "Harry Potter and The Goblet of Fire" from author J.K Rowling
        // If the book is there, he puts it on book cart.

        List<String> rowlingBooks = shop.bookListByAuthor("J.K. Rowling");

        if(rowlingBooks.contains("Harry Potter and the Goblet of Fire")) {

            Book book = shop.bookGet("Harry Potter and the Goblet of Fire");
            ahmad.addToBag(book);

            System.out.println("2: true");
        } else {
            System.out.println("2: false");
        }

        // Ahmad has finished choose the books and goes to cashier.
        // He checked the bookcart and sees that there are 2 books on bookcart

        if(ahmad.countBag() == 2) {
            System.out.println("3: true");
        } else {
            System.out.println("3: false");
        }

        // Ahmad finished buy the books





        // Bayu goes to the bookstore.
        // He looks for a book that he only remembers part of the title is "The King" in entire bookcase.
        // After he finds 1 book with title matched, he puts in on bookcart.

        Person bayu = new Person("Bayu Sakti");

        List<String> booksTheKing = shop.bookListByTitleContains("The King");

        if(booksTheKing.size() > 0 ){

            Book book = shop.bookGet(booksTheKing.get(0));
            bayu.addToBag(book);

            System.out.println("4: true");
        } else {
            System.out.println("4: false");
        }


        // Accidentally, He looks new arrival of the newest Harry potter's book series.
        // Then he put it on bookcart and turn book "The Return of The King" back to bookcase.

        Boolean availableBookTwoTowers = shop.bookIsAvailable("Harry Potter and the Deathly Hallows");

        if(availableBookTwoTowers) {
            Book book = shop.bookGet("Harry Potter and the Deathly Hallows");
            bayu.addToBag(book);
            bayu.removeFromBag("The Return of the King");
        }


        // Bayu has finished choose the books and goes to cashier.
        // He checked the bookcart and sees that there is 1 book on bookcart


        if (bayu.countBag() == 1) {
            System.out.println("5: true");
        } else {
            System.out.println("5: false");
        }

        // Bayu finished buy the books.
    }



    static class Shop {

        private books;

        public void books() {
            this.books = [];
        }

        public void bookAdd(Book book){
            this.books[] = book;
        }

        public void bookIsAvailable(String title) {
        for (this.books = book) {
            if (book.getTitle() == title) {
                return true;
            }
        }
        return false;
    }
    
    public void bookGet(String title) {
        for (this.books = book) {
            if (book.getTitle() == title) {
                return book;
            }
        }
        return null;
    }
    
    public void bookListByAuthor(String author) {
        int list[];
        for (this.books = book) {
            if (book.getAuthor() == author) {
                list[] = book.getTitle();
            }
        }
        return list;
    }
    
    public void bookListByTitleContains(String title_contains) {
        int list[];
        foreach (this.books = book) {
            if (stripos(book.getTitle(), title_contains) != false) {
                list[] = book->getTitle();
                }
            }
        return list;
        }
    }

    static class Book {

        private String title;
        private String author;

        public void Book(String title, String author) {
            this.title    = title;
            this.author   = author;
        }

        public void getTitle() {
            return this.title;
        }
    
        public void getAuthor() {
        
    }

    static class Person {

        private String name;
        private String bag;

        public void Person(String name) {
            this.name = name;
            this.bag = [];
        }

        public void addToBa(Book book) {
            this.bag[] = book;
        }
    
        public void countBag() {
            return count(this.bag);
        }
    
        public void removeFomBag(String title) {
            for (this.bag = index => book) {
                if (book.getTitle() == title) {
                    unset(this.bag[index]);
                }
            }
        }
    }
}
