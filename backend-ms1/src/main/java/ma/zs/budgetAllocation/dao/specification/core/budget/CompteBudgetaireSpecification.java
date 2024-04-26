package  ma.zs.budgetAllocation.dao.specification.core.budget;

import ma.zs.budgetAllocation.dao.criteria.core.budget.CompteBudgetaireCriteria;
import ma.zs.budgetAllocation.bean.core.budget.CompteBudgetaire;
import ma.zs.budgetAllocation.zynerator.specification.AbstractSpecification;


public class CompteBudgetaireSpecification extends  AbstractSpecification<CompteBudgetaireCriteria, CompteBudgetaire>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicateBigDecimal("montantMax", criteria.getMontantMax(), criteria.getMontantMaxMin(), criteria.getMontantMaxMax());
    }

    public CompteBudgetaireSpecification(CompteBudgetaireCriteria criteria) {
        super(criteria);
    }

    public CompteBudgetaireSpecification(CompteBudgetaireCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
