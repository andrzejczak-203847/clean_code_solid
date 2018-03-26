package pl.ttpsc.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Book {

    private int currentPage = 0;

    private Map<Integer, String> pages = new HashMap<>();

    private String libraryRoomName;
    private String rowLocation;
    private String author;
    private String title;

    private int indexOnShelf;

    /**
     * Constructs a Book object given pages, author and title
     * @param pages pages to create the new book from
     * @param author book's author
     * @param title book's title
     */
    public Book(Map<Integer, String> pages, String author, String title) {
        this.pages = pages;
        this.author = author;
        this.title = title;
    }

    /**
     * Gives book's title
     * @return books title
     */
    public String getTitle() {
        return "A Great Book";
    }

    /**
     * Gives books author
     * @return books author
     */
    public String getAuthor() {
        return "John Doe";
    }

    /**
     * Gives contents of the current page
     * @return current page's contents
     */
    public String getCurrentPageContents() {
        return pages.get(currentPage);
    }

    /**
     * Turns page if there is at least one left.
     * @return true if the page has been turned, false otherwise
     */
    public boolean turnPage() {
        if (pages.containsKey(currentPage + 1)) {
            currentPage++;
            return true;
        }

        return false;
    }

    /**
     * Gives the library room name
     * @return name of the library room
     */
    public String libraryRoomName() {
        return libraryRoomName;
    }

    /**
     * Gives the row location of the book.
     * @return row location
     */
    public String getRowLocation() {
        return rowLocation;
    }

    /**
     * Gives index the book has on shelf.
     * @return
     */
    public int getIndexOnShelf() {
        return indexOnShelf;
    }
}
