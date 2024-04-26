package ma.zs.budgetAllocation.zynerator.service;

import ma.zs.budgetAllocation.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.zs.budgetAllocation.zynerator.criteria.BaseCriteria;
import ma.zs.budgetAllocation.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, CRITERIA extends BaseCriteria, REPO extends AbstractRepository<T, Long>> extends AbstractServiceImpl<T, CRITERIA, REPO> {

    public AbstractReferentielServiceImpl(REPO dao) {
        super(dao);
    }

}
