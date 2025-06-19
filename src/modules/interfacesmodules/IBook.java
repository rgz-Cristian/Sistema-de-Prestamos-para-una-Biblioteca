
package modules.interfacesmodules;

public interface ILibro {   
    
    String getIdLibro();
    
    void setIdLibro(String idLibro);
    
    String getTitulo();
    
    void setTitulo(String titulo);
    
    String getAutor();
    
    void setAutor(String autor);
    
    String getGenero();
    
    void setGenero(String genero);
    
    int getPublicacion();
    
    void setPublicacion(int publicacion);
    
    boolean getIsDisponible();
    
    void setIsDisponible(boolean isDisponible);
}
