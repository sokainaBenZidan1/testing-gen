package ma.zs.budgetAllocation.dao.facade.core.budget;

import org.springframework.data.jpa.repository.Query;
import ma.zs.budgetAllocation.zynerator.repository.AbstractRepository;
import ma.zs.budgetAllocation.bean.core.budget.CompteBudgetaire;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface CompteBudgetaireDao extends AbstractRepository<CompteBudgetaire,Long>  {


    @Query("SELECT NEW CompteBudgetaire(item.id,item.libelle) FROM CompteBudgetaire item")
    List<CompteBudgetaire> findAllOptimized();

}
