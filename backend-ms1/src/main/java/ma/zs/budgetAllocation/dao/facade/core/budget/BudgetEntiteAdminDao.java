package ma.zs.budgetAllocation.dao.facade.core.budget;

import ma.zs.budgetAllocation.zynerator.repository.AbstractRepository;
import ma.zs.budgetAllocation.bean.core.budget.BudgetEntiteAdmin;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface BudgetEntiteAdminDao extends AbstractRepository<BudgetEntiteAdmin,Long>  {

    List<BudgetEntiteAdmin> findByEntiteAdminId(Long id);
    int deleteByEntiteAdminId(Long id);
    long countByEntiteAdminCode(String code);
    List<BudgetEntiteAdmin> findByBudgetId(Long id);
    int deleteByBudgetId(Long id);
    long countByBudgetId(Long id);


}
