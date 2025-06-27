
package modules;

import java.util.ArrayList;
import java.util.List;
import modules.interfacesmodules.IBook;
import modules.interfacesmodules.ILibraryServices;

public class LibraryManagement implements ILibraryServices{
    private final ILibraryServices service;

    public LibraryManagement(ILibraryServices service){
        this.service = service;
    }

    
    @Override
    public void setBooks(ArrayList<IBook> books) {
        service.setBooks(books);
    }
    
    @Override
    public ArrayList<IBook> getBooks() {
        return service.getBooks();
    }
    
    @Override
    public void setRegistros(ArrayList<Register> registers){
        service.setRegistros(registers);
    }
    
    @Override
    public ArrayList<Register> getRegistros(){
        return service.getRegistros();
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
    public IBook findByID(String id) {
        return service.findByID(id);
    }

    @Override
    public boolean deleteByID(String id) {
        return service.deleteByID(id);
    }

    @Override
    public void sortByTitle() {
        service.sortByTitle();
    }

    @Override
    public void sortByAuthor() {
        service.sortByAuthor();
    }
    
}
