package modules;

import modules.interfacesmodules.IBook;
import modules.interfacesmodules.ILibraryServices;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;


public class LibraryManagementTest {
    
    @Mock
    private ILibraryServices mockLibraryServices;
    
    @Mock
    private IBook mockBook;
    @Mock
    private Register register;
    
    @InjectMocks
    private LibraryManagement libraryManagement;
    
    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    public void testToRegisterBook_DelegaCorrectamente() {
        // When
        libraryManagement.toRegisterBook(mockBook);

        // Then
        verify(mockLibraryServices).toRegisterBook(mockBook);
    }
    
    @Test
    public void testAddRegister() {
        // When
        libraryManagement.addRegister(register);

        // Then
        verify(mockLibraryServices).addRegister(register);
    }
    
    @Test
    public void testFindByTitle() {
        // Given
        String title = "Padre rico, Padre pobre";
        
        //When
        libraryManagement.findByTitle(title);

        // Then
        verify(mockLibraryServices).findByTitle(title);
    }
    
    @Test
    public void testFindByAuthor() {
        // Given
        String author = "James Stewart";
        
        //When
        libraryManagement.findByTitle(author);

        // Then
        verify(mockLibraryServices).findByTitle(author);
    }
    
    @Test
    public void testFindById() {
        String id = "1010L";
        
        //When
        libraryManagement.findByTitle(id);

        // Then
        verify(mockLibraryServices).findByTitle(id);
    }
    
    @Test
    public void testDeleteById() {
        String id = "1010L";
        
        //When
        libraryManagement.findByID(id);

        // Then
        verify(mockLibraryServices).findByID(id);
    }
    
    
}
