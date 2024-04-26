package ma.zs.budgetAllocation.service.impl.manager.commun;


import ma.zs.budgetAllocation.bean.core.commun.Employe;
import ma.zs.budgetAllocation.dao.criteria.core.commun.EmployeCriteria;
import ma.zs.budgetAllocation.dao.facade.core.commun.EmployeDao;
import ma.zs.budgetAllocation.dao.specification.core.commun.EmployeSpecification;
import ma.zs.budgetAllocation.service.facade.manager.commun.EmployeManagerService;
import ma.zs.budgetAllocation.zynerator.service.AbstractServiceImpl;
import ma.zs.budgetAllocation.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.budgetAllocation.service.facade.manager.commun.EntiteAdminManagerService ;
import ma.zs.budgetAllocation.bean.core.commun.EntiteAdmin ;

import java.util.List;
@Service
public class EmployeManagerServiceImpl extends AbstractServiceImpl<Employe, EmployeCriteria, EmployeDao> implements EmployeManagerService {






    public Employe findByReferenceEntity(Employe t){
        return  dao.findByNom(t.getNom());
    }
    public void findOrSaveAssociatedObject(Employe t){
        if( t != null) {
            t.setEntiteAdmin(entiteAdminService.findOrSave(t.getEntiteAdmin()));
        }
    }

    public List<Employe> findByEntiteAdminId(Long id){
        return dao.findByEntiteAdminId(id);
    }
    public int deleteByEntiteAdminId(Long id){
        return dao.deleteByEntiteAdminId(id);
    }
    public long countByEntiteAdminCode(String code){
        return dao.countByEntiteAdminCode(code);
    }

    public List<Employe> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(Employe.class, EmployeSpecification.class);
    }


    @Autowired
    private EntiteAdminManagerService entiteAdminService ;

    public EmployeManagerServiceImpl(EmployeDao dao) {
        super(dao);
    }

}
