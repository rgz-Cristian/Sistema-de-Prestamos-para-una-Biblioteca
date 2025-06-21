
package modules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import modules.auxclass.ComparisonCriterionByAuthor;
import modules.auxclass.ComparisonCriterionById;
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
    
    private int getIndexByTitle(String title){
        return Collections.binarySearch(books, new Book(title, title, title, 0, true, title), new ComparisonCriterionByTitle());
    }
    

    @Override
    public IBook findByTitle(String title) {
        int index = getIndexByTitle(title);
        return (index >= 0)
                ?books.get(index)
                :null;
    }
    
    private int getIndexByAuthor(String author){
        return Collections.binarySearch(books, new Book(author, author, author, 0, true, author), new ComparisonCriterionByAuthor());
    }

    @Override
    public IBook findByAuthor(String author) {
        int index = getIndexByAuthor(author);
        return (index >= 0)
            ?books.get(index)
            :null;
    }
    
    private int getIndexFindById(String id){
        return Collections.binarySearch(books, new Book(id, id, id, 0, true, id), new ComparisonCriterionById());
    }
    
    @Override
    public IBook finByID(String id) {
        int index = getIndexFindById(id);
        return (index >= 0)
                ?books.get(index)
                :null;
    }

    @Override
    public IBook deleteByID(String id) {
        int index = getIndexFindById(id);
        return books.remove(index);
    }
}
