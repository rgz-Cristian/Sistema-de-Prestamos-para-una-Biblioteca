
package modules;

import java.util.Date;
import modules.interfacesmodules.IBook;

public class LoanRegister extends Register{
    private String idUser;
    private Date loanDate;
    private Date devolutionHopedDate;

    public LoanRegister(String idUser, Date loanDate, Date devolutionHopedDate, String idRegister, IBook book) {
        super(idRegister, book);
        this.idUser = idUser;
        this.loanDate = loanDate;
        this.devolutionHopedDate = devolutionHopedDate;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getDevolutionHopedDate() {
        return devolutionHopedDate;
    }

    public void setDevolutionHopedDate(Date devolutionHopedDate) {
        this.devolutionHopedDate = devolutionHopedDate;
    }
    
    

}