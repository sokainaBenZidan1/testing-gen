package ma.zs.budgetAllocation.zynerator.security.service.facade;

import ma.zs.budgetAllocation.zynerator.security.bean.Role;
import ma.zs.budgetAllocation.zynerator.security.dao.criteria.core.RoleCriteria;
import ma.zs.budgetAllocation.zynerator.service.IService;



public interface RoleService extends  IService<Role,RoleCriteria>  {
    Role findByAuthority(String authority);
    int deleteByAuthority(String authority);


    



}
