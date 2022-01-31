package Book;


import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);

        Library library = new Library();
        library.add(bookOne);
        library.add(bookTwo);
        library.add(bookThree);

        List<Book> books = library.getBooks();
      /* Извикваме с BookComparator:
        books.stream().sorted(new BookComparator()).forEach(System.out::println);*/


        Collections.sort(books);
        for (Book book : books) {
            System.out.println(book);
        }

      /*  for (Book book:library) {
            System.out.println(book.getTitle());
        }*/
    }
}
