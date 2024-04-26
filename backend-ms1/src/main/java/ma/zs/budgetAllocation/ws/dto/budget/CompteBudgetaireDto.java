package  ma.zs.budgetAllocation.ws.dto.budget;

import ma.zs.budgetAllocation.zynerator.audit.Log;
import ma.zs.budgetAllocation.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;




@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompteBudgetaireDto  extends AuditBaseDto {

    private String libelle  ;
    private String code  ;
    private BigDecimal montantMax  ;




    public CompteBudgetaireDto(){
        super();
    }



    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public BigDecimal getMontantMax(){
        return this.montantMax;
    }
    public void setMontantMax(BigDecimal montantMax){
        this.montantMax = montantMax;
    }








}
