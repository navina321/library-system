import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JSONConvert {

    private String filePath = "./books.json";

    public JSONConvert(String filePath) {
        this.filePath = filePath;
    }

    public void write(List<Book> books) {
        try (FileWriter writer = new FileWriter(filePath)){
            JSONArray jsonArray = new JSONArray();
            for(Book book: books) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("Number", book.getNumber());
                jsonObject.put("Title", book.getTitle());
                jsonObject.put("Author", book.getAuthor());
                jsonObject.put("Genre", book.getGenre());
                jsonObject.put("SubGenre", book.getSubGenre());
                jsonObject.put("Publisher", book.getPublisher());
                jsonArray.put(jsonObject);
            }
            writer.write(jsonArray.toString(2));
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }
}
