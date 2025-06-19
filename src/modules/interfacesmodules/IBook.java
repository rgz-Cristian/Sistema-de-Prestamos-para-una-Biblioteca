
package modules.interfacesmodules;

public interface IBook {   
    
    String getIdBook();
    
    void setIdBook(String idLibro);
    
    String getTitle();
    
    void setTitle(String titulo);
    
    String getAuthor();
    
    void setAuthor(String autor);
    
    String getGenre();
    
    void setGenre(String genero);
    
    int getYearRelease();
    
    void setYearRelease(int publicacion);
    
    boolean getIsAvailable();
    
    void setIsAvailable(boolean isDisponible);
}
