package ma.zs.budgetAllocation.dao.facade.core.commun;

import org.springframework.data.jpa.repository.Query;
import ma.zs.budgetAllocation.zynerator.repository.AbstractRepository;
import ma.zs.budgetAllocation.bean.core.commun.EntiteAdmin;
import org.springframework.stereotype.Repository;
import ma.zs.budgetAllocation.bean.core.commun.EntiteAdmin;
import java.util.List;


@Repository
public interface EntiteAdminDao extends AbstractRepository<EntiteAdmin,Long>  {
    EntiteAdmin findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW EntiteAdmin(item.id,item.libelle) FROM EntiteAdmin item")
    List<EntiteAdmin> findAllOptimized();

}
