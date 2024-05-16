package Unit_1_2_3;

/* 
 August Jones 
 01-26-2024
 AP CSA CQE2 FRQ
 :3
*/
public class Book {
    private String title;
    private final int numberOfPages;
    private final String author;
    private final String publisher;
    private final int yearPublished;

    public Book(String t, int nOP, String a, String p, int yP) {
        this.title = t;
        this.numberOfPages = nOP;
        this.author = a;
        this.publisher = p;
        this.yearPublished = yP;
    }

    public void setTitle(String t) {
        title = t;
    }

    public String getTitle() {
        return title;
    }
}