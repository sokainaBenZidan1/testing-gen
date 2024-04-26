package ma.zs.budgetAllocation.service.impl.admin.budget;


import ma.zs.budgetAllocation.bean.core.budget.CompteBudgetaire;
import ma.zs.budgetAllocation.dao.criteria.core.budget.CompteBudgetaireCriteria;
import ma.zs.budgetAllocation.dao.facade.core.budget.CompteBudgetaireDao;
import ma.zs.budgetAllocation.dao.specification.core.budget.CompteBudgetaireSpecification;
import ma.zs.budgetAllocation.service.facade.admin.budget.CompteBudgetaireAdminService;
import ma.zs.budgetAllocation.zynerator.service.AbstractServiceImpl;
import ma.zs.budgetAllocation.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class CompteBudgetaireAdminServiceImpl extends AbstractServiceImpl<CompteBudgetaire, CompteBudgetaireCriteria, CompteBudgetaireDao> implements CompteBudgetaireAdminService {








    public List<CompteBudgetaire> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(CompteBudgetaire.class, CompteBudgetaireSpecification.class);
    }



    public CompteBudgetaireAdminServiceImpl(CompteBudgetaireDao dao) {
        super(dao);
    }

}
