import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add("Оно");
        books.add("Ана");
        books.add("Оно");
        books.add("Ана");
        books.add("Оно");
        books.add("Ана");
        books.add("Оно");
        books.add("Ана");
        books.add("Оно");
        books.add("Ана");
        List<List<String>> distributionBooks = distributionBooks(books);
        System.out.println(distributionBooks);
    }

    public static List<List<String>> distributionBooks(List<String> books) {
        List<List<String>> bookshelves = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            bookshelves.add(new ArrayList<>());
        }
        Collections.sort(books);
        int index = 0;
        int averageValueBooks = (int) Math.ceil((double) books.size()/5);
        for (String book : books) {
            bookshelves.get(index).add(book);
            if (bookshelves.get(index).size() >= averageValueBooks) {
                index++;
            }
        }
        return bookshelves;
    }
}