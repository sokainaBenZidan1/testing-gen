package ma.zs.budgetAllocation.service.impl.manager.commun;


import ma.zs.budgetAllocation.bean.core.commun.EntiteAdmin;
import ma.zs.budgetAllocation.dao.criteria.core.commun.EntiteAdminCriteria;
import ma.zs.budgetAllocation.dao.facade.core.commun.EntiteAdminDao;
import ma.zs.budgetAllocation.dao.specification.core.commun.EntiteAdminSpecification;
import ma.zs.budgetAllocation.service.facade.manager.commun.EntiteAdminManagerService;
import ma.zs.budgetAllocation.zynerator.service.AbstractServiceImpl;
import ma.zs.budgetAllocation.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.zs.budgetAllocation.service.facade.manager.commun.EntiteAdminManagerService ;
import ma.zs.budgetAllocation.bean.core.commun.EntiteAdmin ;
import ma.zs.budgetAllocation.service.facade.manager.commun.EmployeManagerService ;
import ma.zs.budgetAllocation.bean.core.commun.Employe ;

import java.util.List;
@Service
public class EntiteAdminManagerServiceImpl extends AbstractServiceImpl<EntiteAdmin, EntiteAdminCriteria, EntiteAdminDao> implements EntiteAdminManagerService {


    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public EntiteAdmin create(EntiteAdmin t) {
        EntiteAdmin saved= super.create(t);
        if (saved != null && t.getEmploye() != null) {
                t.getEmploye().forEach(element-> {
                element.setEntiteAdmin(saved);
                employeService.create(element);
            });
        }
        return saved;

    }

    public EntiteAdmin findWithAssociatedLists(Long id){
        EntiteAdmin result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setEmploye(employeService.findByEntiteAdminId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        employeService.deleteByEntiteAdminId(id);
    }


    public void updateWithAssociatedLists(EntiteAdmin entiteAdmin){
    if(entiteAdmin !=null && entiteAdmin.getId() != null){
            List<List<Employe>> resultEmploye= employeService.getToBeSavedAndToBeDeleted(employeService.findByEntiteAdminId(entiteAdmin.getId()),entiteAdmin.getEmploye());
            employeService.delete(resultEmploye.get(1));
            ListUtil.emptyIfNull(resultEmploye.get(0)).forEach(e -> e.setEntiteAdmin(entiteAdmin));
            employeService.update(resultEmploye.get(0),true);
        }
    }




    public EntiteAdmin findByReferenceEntity(EntiteAdmin t){
        return  dao.findByCode(t.getCode());
    }


    public List<EntiteAdmin> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(EntiteAdmin.class, EntiteAdminSpecification.class);
    }


    @Autowired
    private EntiteAdminManagerService entiteAdminService ;
    @Autowired
    private EmployeManagerService employeService ;

    public EntiteAdminManagerServiceImpl(EntiteAdminDao dao) {
        super(dao);
    }

}
