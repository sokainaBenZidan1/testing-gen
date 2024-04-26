package ma.zs.budgetAllocation.service.impl.admin.budget;


import ma.zs.budgetAllocation.bean.core.budget.BudgetEntiteAdmin;
import ma.zs.budgetAllocation.dao.criteria.core.budget.BudgetEntiteAdminCriteria;
import ma.zs.budgetAllocation.dao.facade.core.budget.BudgetEntiteAdminDao;
import ma.zs.budgetAllocation.dao.specification.core.budget.BudgetEntiteAdminSpecification;
import ma.zs.budgetAllocation.service.facade.admin.budget.BudgetEntiteAdminAdminService;
import ma.zs.budgetAllocation.zynerator.service.AbstractServiceImpl;
import ma.zs.budgetAllocation.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.budgetAllocation.service.facade.admin.commun.EntiteAdminAdminService ;
import ma.zs.budgetAllocation.bean.core.commun.EntiteAdmin ;
import ma.zs.budgetAllocation.service.facade.admin.budget.BudgetAdminService ;
import ma.zs.budgetAllocation.bean.core.budget.Budget ;

import java.util.List;
@Service
public class BudgetEntiteAdminAdminServiceImpl extends AbstractServiceImpl<BudgetEntiteAdmin, BudgetEntiteAdminCriteria, BudgetEntiteAdminDao> implements BudgetEntiteAdminAdminService {






    public void findOrSaveAssociatedObject(BudgetEntiteAdmin t){
        if( t != null) {
            t.setEntiteAdmin(entiteAdminService.findOrSave(t.getEntiteAdmin()));
            t.setBudget(budgetService.findOrSave(t.getBudget()));
        }
    }

    public List<BudgetEntiteAdmin> findByEntiteAdminId(Long id){
        return dao.findByEntiteAdminId(id);
    }
    public int deleteByEntiteAdminId(Long id){
        return dao.deleteByEntiteAdminId(id);
    }
    public long countByEntiteAdminCode(String code){
        return dao.countByEntiteAdminCode(code);
    }
    public List<BudgetEntiteAdmin> findByBudgetId(Long id){
        return dao.findByBudgetId(id);
    }
    public int deleteByBudgetId(Long id){
        return dao.deleteByBudgetId(id);
    }
    public long countByBudgetId(Long id){
        return dao.countByBudgetId(id);
    }






    public void configure() {
        super.configure(BudgetEntiteAdmin.class, BudgetEntiteAdminSpecification.class);
    }


    @Autowired
    private EntiteAdminAdminService entiteAdminService ;
    @Autowired
    private BudgetAdminService budgetService ;

    public BudgetEntiteAdminAdminServiceImpl(BudgetEntiteAdminDao dao) {
        super(dao);
    }

}
