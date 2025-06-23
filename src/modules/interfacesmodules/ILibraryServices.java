
package modules.interfacesmodules;

import java.util.List;
import modules.Register;

public interface ILibraryServices {
    void setRegistros(List<Register> registro);
    List<Register> getRegistros();
    void setBooks(List<IBook> books);
    List<IBook> getBooks();
    void addRegister(Register register);
    void addBook(IBook book);
    IBook findByID(String id);
    IBook findByTitle(String title);
    IBook findByAuthor(String author);
    boolean deleteByID(String id);
}
