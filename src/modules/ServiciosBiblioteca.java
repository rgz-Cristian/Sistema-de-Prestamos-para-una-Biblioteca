
package modules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import modules.auxclass.CriterioComparacionByAutor;
import modules.interfacesmodules.ILibro;
import modules.interfacesmodules.IServiciosBiblioteca;

/**
 *
 * @author criss
 */
public class ServiciosBiblioteca implements IServiciosBiblioteca{
    
    private List<ILibro> libros = new ArrayList<>();
    private List<Registro> registros = new ArrayList<>();

    public List<ILibro> getLibros() {
        return libros;
    }

    public void setLibros(List<ILibro> libros) {
        this.libros = libros;
    }

    public List<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Registro> registros) {
        this.registros = registros;
    }

    @Override
    public void registrarLibro(ILibro libro) {
        this.libros.add(libro);
    }

    @Override
    public void addRegistro(Registro registro) {
        this.registros.add(registro);

    }

    @Override
    public ILibro buscarPorTitulo(String titulo) {
        return libros.get(Collections.binarySearch(libros, new Libro(titulo, titulo, titulo, titulo, 0, true), new CriterioComparacionByAutor()));
    }

    @Override
    public ILibro buscarPorAutor(String autor) {
        return libros.get(Collections.binarySearch(libros, new Libro(autor, autor, autor, autor, 0, true), new CriterioComparacionByAutor()));
    }
}
