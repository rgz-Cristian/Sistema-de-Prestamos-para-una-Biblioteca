
package modules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import modules.auxclass.ComparisonCriterionByAuthor;
import modules.auxclass.ComparisonCriterionByTitle;
import modules.interfacesmodules.IBook;
import modules.interfacesmodules.ILibraryServices;


public class LibraryServices implements ILibraryServices{
    
    private List<IBook> books = new ArrayList<>();
    private List<Register> registers = new ArrayList<>();

    public List<IBook> getLibros() {
        return books;
    }

    public void setLibros(List<IBook> books) {
        this.books = books;
    }

    public List<Register> getRegistros() {
        return registers;
    }

    public void setRegistros(List<Register> registers) {
        this.registers = registers;
    }

    @Override
    public void toRegisterBook(IBook book) {
        this.books.add(book);
    }

    @Override
    public void addRegister(Register register) {
        this.registers.add(register);
    }
    
    @Override
    public void addBook(IBook book){
        this.books.add(book);
    }

    @Override
    public IBook findByTitle(String title) {
        int index = Collections.binarySearch(books, new Book(title, title, title, 0, true, title), new ComparisonCriterionByTitle());
        
        return (index >= 0)
                ?books.get(index)
                :null;
    }

    @Override
    public IBook findByAuthor(String author) {
        int index = Collections.binarySearch(books, new Book(author, author, author, 0, true, author), new ComparisonCriterionByAuthor());
        return (index >= 0)
            ?books.get(index)
            :null;
    }
}
