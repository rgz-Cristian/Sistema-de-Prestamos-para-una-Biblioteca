
package modules.interfacesmodules;

import modules.Register;

public interface ILibraryServices {
    void toRegisterBook(IBook book);
    void addRegister(Register register);
    IBook findByTitle(String title);
    IBook findByAuthor(String author);
}
