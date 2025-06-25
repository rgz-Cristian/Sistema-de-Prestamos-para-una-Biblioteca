
package modules;

import java.util.Date;
import modules.interfacesmodules.IBook;

public class DevolutionRegister extends Register{
    private Date devolutionDate;

    public DevolutionRegister(String idRegister, IBook book, Date devolutionDate) {
        super(idRegister, book);
        this.devolutionDate = devolutionDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    @Override
    public String toString() {
        return "DevolutionRegister";
    }
    
}
