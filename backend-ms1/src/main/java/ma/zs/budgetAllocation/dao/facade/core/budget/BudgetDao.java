package ma.zs.budgetAllocation.dao.facade.core.budget;

import ma.zs.budgetAllocation.zynerator.repository.AbstractRepository;
import ma.zs.budgetAllocation.bean.core.budget.Budget;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface BudgetDao extends AbstractRepository<Budget,Long>  {



}
