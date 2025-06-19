
package modules;

import java.util.ArrayList;
import java.util.List;
import modules.interfacesmodules.IBook;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.mockito.Mock;


public class LibraryServicesTest {
    
    LibraryServices instance = new LibraryServices();


    private final List<Register> mockRegisters = new ArrayList<>();
    private final List<IBook> mockBooks = new ArrayList<>();
    
    
    

    @Test
    public void testGetLibros() {
        System.out.println("getLibros");
        List<IBook> result = instance.getLibros();
        assertEquals(mockBooks, result);
    }


    @Test
    public void testSetLibros() {
        System.out.println("setLibros");
        List<IBook> books = mockBooks;
        instance.setLibros(books);
    }


    @Test
    public void testGetRegistros() {
        System.out.println("getRegistros");
        List<Register> result = instance.getRegistros();
        assertEquals(mockRegisters, result);
    }


    @Test
    public void testSetRegistros() {
        System.out.println("setRegistros");
        List<Register> registers = null;
        instance.setRegistros(registers);
    }

    @Test
    public void testAddRegister() {
        System.out.println("addRegister");
        Register register = null;
        instance.addRegister(register);
    }
    
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        IBook book = null;
        instance.addBook(book);
    }


    @Test
    public void testFindByTitle() {
        System.out.println("findByTitle");
        String title = "";
        IBook expResult = null;
        IBook result = instance.findByTitle(title);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindByAuthor() {
        System.out.println("findByAuthor");
        String author = "";
        IBook expResult = null;
        IBook result = instance.findByAuthor(author);
        assertEquals(expResult, result);
    }
    
}
