package ma.zs.budgetAllocation.service.facade.admin.budget;

import java.util.List;
import ma.zs.budgetAllocation.bean.core.budget.BudgetEntiteAdmin;
import ma.zs.budgetAllocation.dao.criteria.core.budget.BudgetEntiteAdminCriteria;
import ma.zs.budgetAllocation.zynerator.service.IService;



public interface BudgetEntiteAdminAdminService extends  IService<BudgetEntiteAdmin,BudgetEntiteAdminCriteria>  {

    List<BudgetEntiteAdmin> findByEntiteAdminId(Long id);
    int deleteByEntiteAdminId(Long id);
    long countByEntiteAdminCode(String code);
    List<BudgetEntiteAdmin> findByBudgetId(Long id);
    int deleteByBudgetId(Long id);
    long countByBudgetId(Long id);




}
