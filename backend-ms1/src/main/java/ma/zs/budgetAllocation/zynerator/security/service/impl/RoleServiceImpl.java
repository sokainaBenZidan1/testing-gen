package ma.zs.budgetAllocation.zynerator.security.service.impl;


import ma.zs.budgetAllocation.zynerator.security.bean.Role;
import ma.zs.budgetAllocation.zynerator.security.dao.criteria.core.RoleCriteria;
import ma.zs.budgetAllocation.zynerator.security.dao.facade.core.RoleDao;
import ma.zs.budgetAllocation.zynerator.security.dao.specification.core.RoleSpecification;
import ma.zs.budgetAllocation.zynerator.security.service.facade.RoleService;
import ma.zs.budgetAllocation.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl extends AbstractServiceImpl<Role, RoleCriteria, RoleDao> implements RoleService {


    @Override
    public Role findByAuthority(String authority) {
        return dao.findByAuthority(authority);
    }

    @Override
    public int deleteByAuthority(String authority) {
        return deleteByAuthority(authority);
    }



    public Role findByReferenceEntity(Role t){
        return  dao.findByAuthority(t.getAuthority());
    }


    public List<Role> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(Role.class, RoleSpecification.class);
    }



    public RoleServiceImpl(RoleDao dao) {
        super(dao);
    }

}
