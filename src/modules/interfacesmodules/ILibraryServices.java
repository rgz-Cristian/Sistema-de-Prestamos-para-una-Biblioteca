
package modules.interfacesmodules;

import modules.Register;

public interface ILibraryServices {
    void toRegisterBook(IBook book);
    void addRegister(Register register);
    void addBook(IBook book);
    IBook findByID(String id);
    IBook findByTitle(String title);
    IBook findByAuthor(String author);
    boolean deleteByID(String id);
}
