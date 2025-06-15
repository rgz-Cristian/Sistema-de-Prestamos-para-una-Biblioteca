/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;

import modules.interfacesmodules.ILibro;
import modules.interfacesmodules.IServiciosBiblioteca;

/**
 *
 * @author criss
 */
public class GestionBiblioteca implements IServiciosBiblioteca{
    private String nombre;
    private IServiciosBiblioteca servicios;

    @Override
    public void registrarLibro(ILibro libro) {
        servicios.registrarLibro(libro);
    }

    @Override
    public void addRegistro(Registro registro) {
        servicios.addRegistro(registro);
    }

    @Override
    public ILibro buscarPorTitulo(String titulo) {
        return servicios.buscarPorTitulo(titulo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public IServiciosBiblioteca getServicios() {
        return servicios;
    }

    public void setServicios(IServiciosBiblioteca servicios) {
        this.servicios = servicios;
    }

    @Override
    public ILibro buscarPorAutor(String autor) {
        return servicios.buscarPorAutor(autor);
    }

    public GestionBiblioteca(String nombre, IServiciosBiblioteca servicios) {
        this.nombre = nombre;
        this.servicios = servicios;
    }
}
