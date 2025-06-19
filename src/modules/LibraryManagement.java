
package modules;

import modules.interfacesmodules.IBook;
import modules.interfacesmodules.ILibraryServices;

public class LibraryManagement implements ILibraryServices{
    private ILibraryServices service;

    @Override
    public void toRegisterBook(IBook book) {
        service.toRegisterBook(book);
    }

    @Override
    public void addRegister(Register register) {
        service.addRegister(register);
    }

    @Override
    public IBook findByTitle(String title) {
        return service.findByTitle(title);
    }

    @Override
    public IBook findByAuthor(String author) {
        return service.findByAuthor(author);
    }
    
    
    
    
}
