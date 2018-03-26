package pl.ttpsc.solid.srp.book.solution;

import java.util.Map;

public class BookPrinter {
    /**
     * Prints the current page.
     */
    public void printCurrentPage(Book book) {
        System.out.println(book.getCurrentPageContents());
    }

    /**
     * Prints all pages
     */
    public void printAllPages(Book book) {
        do {
            printCurrentPage(book);
        } while(book.turnPage());
    }
}
