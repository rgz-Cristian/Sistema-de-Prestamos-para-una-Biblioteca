
package modules;

import modules.interfacesmodules.IBook;
import modules.interfacesmodules.ILibraryServices;

public class LibraryManagement implements ILibraryServices{
    private ILibraryServices service;

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
    
    
    
    
}
