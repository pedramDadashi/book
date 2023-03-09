package book;

public class UseBook {
    public static void main(String[] args) {
        Book[] bookArray = new Book[10];
        for (int j = 0; j < bookArray.length; j++) {
            bookArray[j] = new Fiction("book" + j);
            bookArray[j].setPrice();
            j++;
            bookArray[j] = new NonFiction("book" + j);
            bookArray[j].setPrice();
        }
        for (Book book : bookArray) {
            System.out.println(book.toString());
        }
    }
}
