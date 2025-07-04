
package modules;

import java.util.ArrayList;
import java.util.List;
import modules.interfacesmodules.IBook;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;



public class LibraryServicesTest {
    
    
    LibraryServices instance = new LibraryServices();


    private final ArrayList<Register> mockRegisters = instance.getRegistros();
    private final ArrayList<IBook> mockBooks = instance.getBooks();
    
    
    

    @Test
    public void testGetBooks() {
        //When
        List<IBook> result = instance.getBooks();
        
        //Then
        assertEquals(mockBooks, result);
    }


    @Test
    public void testSetBooks() {
        //Given
        ArrayList<IBook> books = mockBooks;
        
        //Then
        instance.setBooks(books);
    }


    @Test
    public void testGetRegistros() {
        //When
        ArrayList<Register> result = instance.getRegistros();
        
        //Then
        assertEquals(mockRegisters, result);
    }


    @Test
    public void testSetRegistros() {
        //Given
        ArrayList<Register> registers = mockRegisters;
        
        //Then
        instance.setRegistros(registers);
    }

    @Test
    public void testAddRegister() {
        //Given
        Register register = mock(Register.class);
        
        //Then
        instance.addRegister(register);
        assertEquals(register, instance.getRegistros().get(0));
    }
    
    @Test
    public void testAddBook() {
        //Given
        IBook book = mock(Book.class);
        
        //Then
        instance.addBook(book);
        assertEquals(book, instance.getBooks().get(0));
    }


    @Test
    public void testFindByTitle() {
        //Given
        String title = "The Witcher";
        IBook expResult2 = new Book("1010L", "The Witcher", "Heroic", 1998, true, "Andrew Sapowski");
        IBook expResult = new Book("1211L", "Doc", "History", 1960, true, "Andrew Guilt");
        instance.addBook(expResult2);
        instance.addBook(expResult);
        
        //When
        IBook resultTrue = instance.findByTitle(title);
        IBook resultFalse = instance.findByTitle(title);

        
        //Then
        assertEquals(expResult2, resultTrue);
        assertNotEquals(expResult, resultFalse);
    }

    @Test
    public void testFindByAuthor() {
        //Given
        String author = "Julien Tolkien";
        IBook expResult2 = new Book("1010L","The Witcher", "Heroic", 1998, true, "Andrew Sapowski");
        IBook expResult = new Book("1011L", "Lord of The Ring", "Epic", 1960, true, "Julien Tolkien");
        instance.addBook(expResult2);
        instance.addBook(expResult);
        
        //When
        IBook resultTrue = instance.findByAuthor(author);
        IBook resultFalse = instance.findByAuthor(author);

        
        //Then
        assertEquals(expResult, resultTrue);
        assertNotEquals(expResult2, resultFalse);

    }
    
    @Test
    public void testFindByID() {
        //Given
        String id = "1010L";
        IBook expResult = new Book("1010L","The Witcher", "Heroic", 1998, true, "Andrew Sapowski");
        instance.addBook(expResult);
        IBook expResult2 = new Book("1011L", "Lord of The Ring", "Epic", 1960, true, "Julien Tolkien");
        instance.addBook(expResult2);
        
        //When
        IBook resultTrue = instance.findByID(id);
        IBook resultFalse = instance.findByID(id);

        
        //Then
        assertEquals(expResult, resultTrue);
        assertNotEquals(expResult2, resultFalse);
    }
    
    
    @Test
    public void testDeleteByID() {
        //Given
        String id = "1234";
        IBook expResult1 = new Book("1234", id, id, 0, true, id);
        IBook expResult2 = new Book("1010L", "Lord of The Ring", "Epic", 1960, true, "Julien Tolkien");
        instance.addBook(expResult1);        
        instance.addBook(expResult2);

        
        
        //When
        boolean resultTrue = instance.deleteByID(id);
        boolean resultFalse = instance.deleteByID(id);
        
        //Then
        assertTrue(resultTrue);
        assertFalse(resultFalse);
    }
}
