package ma.zs.budgetAllocation.dao.facade.core.budget;

import ma.zs.budgetAllocation.zynerator.repository.AbstractRepository;
import ma.zs.budgetAllocation.bean.core.budget.BudgetCompteBudgetaire;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface BudgetCompteBudgetaireDao extends AbstractRepository<BudgetCompteBudgetaire,Long>  {

    List<BudgetCompteBudgetaire> findByBudgetId(Long id);
    int deleteByBudgetId(Long id);
    long countByBudgetId(Long id);
    List<BudgetCompteBudgetaire> findByCompteBudgetaireId(Long id);
    int deleteByCompteBudgetaireId(Long id);
    long countByCompteBudgetaireId(Long id);


}
