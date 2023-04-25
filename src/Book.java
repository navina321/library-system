public class Book {
    private int number;
    private String title;
    private String author;
    private String genre;
    private String subGenre;
    private String publisher;
    private boolean isOnLoan;
    private int timesLoaned;

    public Book(int number, String title, String author, String genre, String subGenre, String publisher, boolean isOnLoan, int timesLoaned) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.subGenre = subGenre;
        this.publisher = publisher;
        this.isOnLoan = isOnLoan;
        this.timesLoaned = timesLoaned;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSubGenre() {
        return subGenre;
    }

    public void setSubGenre(String subGenre) {
        this.subGenre = subGenre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public boolean isOnLoan() {
        return isOnLoan;
    }

    public void setOnLoan(boolean onLoan) {
        isOnLoan = onLoan;
    }

    public int getTimesLoaned() {
        return timesLoaned;
    }

    public void setTimesLoaned(int timesLoaned) {
        this.timesLoaned = timesLoaned;
    }

    public void bookOnLoan(){
        this.isOnLoan = true;
        this.timesLoaned++;
    }
    public void returnBook(){
        this.isOnLoan = false;
    }
}
