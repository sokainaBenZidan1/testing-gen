package ma.zs.budgetAllocation.service.impl.admin.budget;


import ma.zs.budgetAllocation.bean.core.budget.BudgetCompteBudgetaire;
import ma.zs.budgetAllocation.dao.criteria.core.budget.BudgetCompteBudgetaireCriteria;
import ma.zs.budgetAllocation.dao.facade.core.budget.BudgetCompteBudgetaireDao;
import ma.zs.budgetAllocation.dao.specification.core.budget.BudgetCompteBudgetaireSpecification;
import ma.zs.budgetAllocation.service.facade.admin.budget.BudgetCompteBudgetaireAdminService;
import ma.zs.budgetAllocation.zynerator.service.AbstractServiceImpl;
import ma.zs.budgetAllocation.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.budgetAllocation.service.facade.admin.budget.BudgetAdminService ;
import ma.zs.budgetAllocation.bean.core.budget.Budget ;
import ma.zs.budgetAllocation.service.facade.admin.budget.CompteBudgetaireAdminService ;
import ma.zs.budgetAllocation.bean.core.budget.CompteBudgetaire ;

import java.util.List;
@Service
public class BudgetCompteBudgetaireAdminServiceImpl extends AbstractServiceImpl<BudgetCompteBudgetaire, BudgetCompteBudgetaireCriteria, BudgetCompteBudgetaireDao> implements BudgetCompteBudgetaireAdminService {






    public void findOrSaveAssociatedObject(BudgetCompteBudgetaire t){
        if( t != null) {
            t.setBudget(budgetService.findOrSave(t.getBudget()));
            t.setCompteBudgetaire(compteBudgetaireService.findOrSave(t.getCompteBudgetaire()));
        }
    }

    public List<BudgetCompteBudgetaire> findByBudgetId(Long id){
        return dao.findByBudgetId(id);
    }
    public int deleteByBudgetId(Long id){
        return dao.deleteByBudgetId(id);
    }
    public long countByBudgetId(Long id){
        return dao.countByBudgetId(id);
    }
    public List<BudgetCompteBudgetaire> findByCompteBudgetaireId(Long id){
        return dao.findByCompteBudgetaireId(id);
    }
    public int deleteByCompteBudgetaireId(Long id){
        return dao.deleteByCompteBudgetaireId(id);
    }
    public long countByCompteBudgetaireId(Long id){
        return dao.countByCompteBudgetaireId(id);
    }






    public void configure() {
        super.configure(BudgetCompteBudgetaire.class, BudgetCompteBudgetaireSpecification.class);
    }


    @Autowired
    private BudgetAdminService budgetService ;
    @Autowired
    private CompteBudgetaireAdminService compteBudgetaireService ;

    public BudgetCompteBudgetaireAdminServiceImpl(BudgetCompteBudgetaireDao dao) {
        super(dao);
    }

}
