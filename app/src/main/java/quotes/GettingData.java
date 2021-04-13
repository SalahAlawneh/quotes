package quotes;

import com.google.gson.Gson;

public class GettingData {
   String author;
   String text;

    public GettingData(String author, String text) {
        this.author = author;
        this.text = text;
    }

    @Override
    public String toString() {
        return "GettingData{" +
                "author='" + author + '\'' +
                ", quotes='" + text + '\'' +
                '}';
    }
}
