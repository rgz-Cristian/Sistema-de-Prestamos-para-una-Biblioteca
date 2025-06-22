
package modules;

import modules.interfacesmodules.IBook;

public class Book implements IBook {
    
    private String idBook;
    private String title;
    private String author;
    private String genre;
    private int yearRelease;
    private boolean isAvailable;

    public Book(String idBook, String title, String genre, int yearRelease, boolean isAvailable, String author) {
        this.idBook = idBook;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearRelease = yearRelease;
        this.isAvailable = isAvailable;
    }

    public Book(String textoID, String textoTitulo, String textoAutor, String textoGenero, int anio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String getIdBook() {
        return idBook;
    }
    @Override
    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }
    @Override
    public String getTitle() {
        return title;
    }
    @Override
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String getAuthor() {
        return author;
    }
    @Override
    public void setAuthor(String autor) {
        this.author = autor;
    }
    
    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int getYearRelease() {
        return yearRelease;
    }

    @Override
    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    @Override
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public boolean getIsAvailable() {
        return isAvailable;
    }
    
   
}
