
package modules.interfacesmodules;

import modules.Register;

public interface ILibraryServices {
    void toRegisterBook(IBook book);
    void addRegister(Register register);
    void addBook(IBook book);
    IBook finByID(String id);
    IBook findByTitle(String title);
    IBook findByAuthor(String author);
    IBook deleteByID(String id);
}
