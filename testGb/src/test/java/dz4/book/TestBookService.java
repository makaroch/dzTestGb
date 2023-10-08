package dz4.book;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestBookService {
    @Test
    public void testFindBookById(){
        BookRepository bookRepositoryMock = mock(BookRepository.class);

        when(bookRepositoryMock.findById("1")).thenReturn(new Book("1", "Book1", "Author1"));

        BookService BookRepositoryMock = new BookService(bookRepositoryMock);

        assertEquals(BookRepositoryMock.findBookById("1"), new Book("1", "Book1", "Author1"));
    }

    @Test
    public void testFindAllBooks(){
        BookRepository bookRepositoryMock = mock(BookRepository.class);
        List<Book> books = new ArrayList<>();
        books.add(new Book("1", "Book1", "Author1"));
        books.add(new Book("2", "Book2", "Author2"));

        when(bookRepositoryMock.findAll()).thenReturn(books);

        BookService bookService = new BookService(bookRepositoryMock);

        assertEquals(bookService.findAllBooks(), books);
    }

}
