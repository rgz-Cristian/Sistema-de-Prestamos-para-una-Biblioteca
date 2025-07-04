
package modules;

import java.util.ArrayList;
import java.util.Collections;
import modules.auxclass.ComparisonCriterionByAuthor;
import modules.auxclass.ComparisonCriterionById;
import modules.auxclass.ComparisonCriterionByTitle;
import modules.interfacesmodules.IBook;
import modules.interfacesmodules.ILibraryServices;


public class LibraryServices implements ILibraryServices{
    
    private ArrayList<IBook> books = new ArrayList<>();
    private ArrayList<Register> registers = new ArrayList<>();

    @Override
    public ArrayList<IBook> getBooks() {
        return books;
    }

    @Override
    public void setBooks(ArrayList<IBook> books) {
        this.books = books;
    }

    @Override
    public ArrayList<Register> getRegistros() {
        return registers;
    }

    @Override
    public void setRegistros(ArrayList<Register> registers) {
        this.registers = registers;
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
    public IBook findByID(String id) {
        int index = getIndexFindById(id);
        return (index >= 0)
                ?books.get(index)
                :null;
    }

    @Override
    public boolean deleteByID(String id) {
        IBook object = findByID(id);
        return (object != null)
                ?books.remove(object)
                :false;
    }
    public void sortByTitle(){
        Collections.sort(books, new ComparisonCriterionByTitle());
    }
    public void sortByAuthor(){
        Collections.sort(books, new ComparisonCriterionByAuthor());
    }

}
