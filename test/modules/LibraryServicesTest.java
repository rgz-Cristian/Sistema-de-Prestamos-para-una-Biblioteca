
package modules;

import java.util.ArrayList;
import java.util.List;
import modules.interfacesmodules.IBook;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static org.mockito.Mockito.*;



public class LibraryServicesTest {
    
    
    LibraryServices instance = new LibraryServices();


    private final List<Register> mockRegisters = new ArrayList<>();
    private final List<IBook> mockBooks = new ArrayList<>();
    
    
    

    @Test
    public void testGetLibros() {
        //When
        List<IBook> result = instance.getLibros();
        
        //Then
        assertEquals(mockBooks, result);
    }


    @Test
    public void testSetLibros() {
        //Given
        List<IBook> books = mockBooks;
        
        //Then
        instance.setLibros(books);
    }


    @Test
    public void testGetRegistros() {
        //When
        List<Register> result = instance.getRegistros();
        
        //Then
        assertEquals(mockRegisters, result);
    }


    @Test
    public void testSetRegistros() {
        //Given
        List<Register> registers = mockRegisters;
        
        //Then
        instance.setRegistros(registers);
    }

    @Test
    public void testAddRegister() {
        //Given
        Register register = mock(Register.class);
        
        //Then
        instance.addRegister(register);
    }
    
    @Test
    public void testAddBook() {
        //Given
        IBook book = mock(Book.class);
        
        //Then
        instance.addBook(book);
    }


    @Test
    public void testFindByTitle() {
        //Given
        String title = "";
        IBook expResult = null;
        
        //When
        IBook result = instance.findByTitle(title);
        
        //Then
        assertEquals(expResult, result);
    }

    @Test
    public void testFindByAuthor() {
        //Given
        String author = "";
        IBook expResult = null;
        
        //When
        IBook result = instance.findByAuthor(author);
        
        //Then
        assertEquals(expResult, result);
    }
    
}
