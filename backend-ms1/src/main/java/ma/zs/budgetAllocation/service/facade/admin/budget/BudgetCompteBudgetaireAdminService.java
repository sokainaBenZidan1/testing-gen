package ma.zs.budgetAllocation.service.facade.admin.budget;

import java.util.List;
import ma.zs.budgetAllocation.bean.core.budget.BudgetCompteBudgetaire;
import ma.zs.budgetAllocation.dao.criteria.core.budget.BudgetCompteBudgetaireCriteria;
import ma.zs.budgetAllocation.zynerator.service.IService;



public interface BudgetCompteBudgetaireAdminService extends  IService<BudgetCompteBudgetaire,BudgetCompteBudgetaireCriteria>  {

    List<BudgetCompteBudgetaire> findByBudgetId(Long id);
    int deleteByBudgetId(Long id);
    long countByBudgetId(Long id);
    List<BudgetCompteBudgetaire> findByCompteBudgetaireId(Long id);
    int deleteByCompteBudgetaireId(Long id);
    long countByCompteBudgetaireId(Long id);




}
