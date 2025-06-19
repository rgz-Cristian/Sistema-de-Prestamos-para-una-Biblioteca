
package modules;

import modules.interfacesmodules.IBook;


public abstract class Register {
    protected String idRegister;
    protected IBook book;

    public Register(String idRegister, IBook book) {
        this.idRegister = idRegister;
        this.book = book;
    }
    
 
    public String getIdRegister() {
        return idRegister;
    }

    public void setIdRegister(String idRegister) {
        this.idRegister = idRegister;
    }

    public IBook getBook() {
        return book;
    }

    public void setBook(IBook book) {
        this.book = book;
    }

   
}
