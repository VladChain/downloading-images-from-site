import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {

            Document doc = Jsoup.connect("https://lenta.ru/").get();
            Images images = new Images();
            images.download(doc);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
