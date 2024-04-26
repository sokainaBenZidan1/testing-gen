package ma.zs.budgetAllocation.service.facade.manager.commun;

import java.util.List;
import ma.zs.budgetAllocation.bean.core.commun.Employe;
import ma.zs.budgetAllocation.dao.criteria.core.commun.EmployeCriteria;
import ma.zs.budgetAllocation.zynerator.service.IService;



public interface EmployeManagerService extends  IService<Employe,EmployeCriteria>  {

    List<Employe> findByEntiteAdminId(Long id);
    int deleteByEntiteAdminId(Long id);
    long countByEntiteAdminCode(String code);




}
