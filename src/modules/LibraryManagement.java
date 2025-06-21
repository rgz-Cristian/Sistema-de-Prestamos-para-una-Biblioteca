
package modules;

import modules.interfacesmodules.IBook;
import modules.interfacesmodules.ILibraryServices;

public class LibraryManagement implements ILibraryServices{
    private final ILibraryServices service;

    public LibraryManagement(ILibraryServices service){
        this.service = service;
    }
    
    
    @Override
    public void toRegisterBook(IBook book) {
        service.toRegisterBook(book);
    }

    @Override
    public void addRegister(Register register) {
        service.addRegister(register);
    }
    
    @Override
    public void addBook(IBook book){
        service.addBook(book);
    }

    @Override
    public IBook findByTitle(String title) {
        return service.findByTitle(title);
    }

    @Override
    public IBook findByAuthor(String author) {
        return service.findByAuthor(author);
    }

    @Override
    public IBook finByID(String id) {
        return service.finByID(id);
    }

    @Override
    public IBook deleteByID(String id) {
        return service.deleteByID(id);
    }
}
