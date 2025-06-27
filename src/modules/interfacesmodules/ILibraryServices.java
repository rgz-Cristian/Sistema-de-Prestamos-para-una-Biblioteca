
package modules.interfacesmodules;

import java.util.ArrayList;
import modules.Register;

public interface ILibraryServices {
    void setRegistros(ArrayList<Register> registro);
    ArrayList<Register> getRegistros();
    void setBooks(ArrayList<IBook> books);
    ArrayList<IBook> getBooks();
    void addRegister(Register register);
    void addBook(IBook book);
    IBook findByID(String id);
    IBook findByTitle(String title);
    IBook findByAuthor(String author);
    boolean deleteByID(String id);
    void sortByTitle();
    void sortByAuthor();
}
