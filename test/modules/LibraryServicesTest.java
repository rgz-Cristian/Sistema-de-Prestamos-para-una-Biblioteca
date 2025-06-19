
package modules;

import java.util.List;
import modules.interfacesmodules.IBook;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.mockito.Mock;


public class LibraryServicesTest {
    
    LibraryServices instance = new LibraryServices();
    
    @Mock
    IBook book;
        

    @Test
    public void testGetLibros() {
        System.out.println("getLibros");
        List<IBook> result = instance.getLibros();
        assertEquals(expResult, result);
    }


    @Test
    public void testSetLibros() {
        System.out.println("setLibros");
        List<IBook> books = null;
        LibraryServices instance = new LibraryServices();
        instance.setLibros(books);
    }


    @Test
    public void testGetRegistros() {
        System.out.println("getRegistros");
        LibraryServices instance = new LibraryServices();
        List<Register> expResult = null;
        List<Register> result = instance.getRegistros();
        assertEquals(expResult, result);
    }


    @Test
    public void testSetRegistros() {
        System.out.println("setRegistros");
        List<Register> registers = null;
        LibraryServices instance = new LibraryServices();
        instance.setRegistros(registers);
    }

    @Test
    @Before
    public void testAddRegister() {
        System.out.println("addRegister");
        Register register = ;
        LibraryServices instance = new LibraryServices();
        instance.addRegister(register);
    }


    @Test
    public void testFindByTitle() {
        System.out.println("findByTitle");
        String title = "";
        LibraryServices instance = new LibraryServices();
        IBook expResult = null;
        IBook result = instance.findByTitle(title);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindByAuthor() {
        System.out.println("findByAuthor");
        String author = "";
        LibraryServices instance = new LibraryServices();
        IBook expResult = null;
        IBook result = instance.findByAuthor(author);
        assertEquals(expResult, result);
    }
    
}
