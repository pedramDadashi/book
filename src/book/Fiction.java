package book;

import book.Book;

public class Fiction extends Book {
    public Fiction(String title) {
        super(title);
    }

    @Override
    public void setPrice() {
        this.price=24.99;
    }
}
