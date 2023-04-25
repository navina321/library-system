import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVParser {

    private String filePath = "C:\\Users\\navin\\Downloads\\books_data.csv";

    public CSVParser(String filePath) {
        this.filePath = filePath;
    }

    public List<Book> parse() {
        List<Book> books = new ArrayList<>();

        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            String [] headers = reader.readNeaxt();

            String [] row;
            while((row = reader.readNext()) != null){
                int number = Integer.parseInt(row[0]);
                String title = row[1];
                String author = row[2];
                String genre = row[3];
                String subGenre = row[4];
                String publisher = row[5];
                Book book = new Book(number, title, author, genre, subGenre, publisher);
                books.add(book);
            }
        }catch (Exception e) {
            e.printStackTrace();

        }
        return books;
    }
}
