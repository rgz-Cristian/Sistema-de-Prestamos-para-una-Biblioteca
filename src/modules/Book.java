
package modules;

import modules.interfacesmodules.ILibro;

public class Libro implements ILibro {
    
    private String idLibro;
    private String titulo;
    private String autor;
    private String genero;
    private int publicacion;
    private boolean isDisponible;

    public Libro(String idLibro, String titulo, String autor, String genero, int publicacion, boolean isDisponible) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.publicacion = publicacion;
        this.isDisponible = isDisponible;
    }
    


    @Override
    public String getIdLibro() {
        return idLibro;
    }
    @Override
    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String getGenero() {
        return genero;
    }

    @Override
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getPublicacion() {
        return publicacion;
    }

    @Override
    public void setPublicacion(int Publicacion) {
        this.publicacion = Publicacion;
    }

    @Override
    public boolean getIsDisponible() {
        return isDisponible;
    }

    @Override
    public void setIsDisponible(boolean isDisponible) {
        this.isDisponible = isDisponible;
    }
}
