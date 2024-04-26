package  ma.zs.budgetAllocation.ws.dto.budget;

import ma.zs.budgetAllocation.zynerator.audit.Log;
import ma.zs.budgetAllocation.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;




@JsonInclude(JsonInclude.Include.NON_NULL)
public class BudgetCompteBudgetaireDto  extends AuditBaseDto {

    private BigDecimal montant  ;

    private BudgetDto budget ;
    private CompteBudgetaireDto compteBudgetaire ;



    public BudgetCompteBudgetaireDto(){
        super();
    }



    @Log
    public BigDecimal getMontant(){
        return this.montant;
    }
    public void setMontant(BigDecimal montant){
        this.montant = montant;
    }


    public BudgetDto getBudget(){
        return this.budget;
    }

    public void setBudget(BudgetDto budget){
        this.budget = budget;
    }
    public CompteBudgetaireDto getCompteBudgetaire(){
        return this.compteBudgetaire;
    }

    public void setCompteBudgetaire(CompteBudgetaireDto compteBudgetaire){
        this.compteBudgetaire = compteBudgetaire;
    }






}
