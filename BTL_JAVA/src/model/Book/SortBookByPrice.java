package model.Book;

import java.util.Comparator;

public class SortBookByPrice implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
