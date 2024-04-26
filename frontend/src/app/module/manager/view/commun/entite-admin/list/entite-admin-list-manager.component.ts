import {Component, OnInit} from '@angular/core';
import {EntiteAdminManagerService} from 'src/app/shared/service/manager/commun/EntiteAdminManager.service';
import {EntiteAdminDto} from 'src/app/shared/model/commun/EntiteAdmin.model';
import {EntiteAdminCriteria} from 'src/app/shared/criteria/commun/EntiteAdminCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import {EmployeDto} from 'src/app/shared/model/commun/Employe.model';
import {EmployeManagerService} from 'src/app/shared/service/manager/commun/EmployeManager.service';


@Component({
  selector: 'app-entite-admin-list-manager',
  templateUrl: './entite-admin-list-manager.component.html'
})
export class EntiteAdminListManagerComponent extends AbstractListController<EntiteAdminDto, EntiteAdminCriteria, EntiteAdminManagerService>  implements OnInit {

    override fileName = 'EntiteAdmin';




    constructor( private entiteAdminService: EntiteAdminManagerService  , private employeService: EmployeManagerService) {
        super(entiteAdminService);
    }

    ngOnInit(): void {
        this.activateSecurityConstraint('EntiteAdmin').subscribe(() => {
            if (true || this.listActionIsValid){
                this.findPaginatedByCriteria();
                this.initExport();
                this.initCol();
            }
        });
    }


    public override  initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public override initDuplicate(res: EntiteAdminDto) {
        if (res.employe != null) {
             res.employe.forEach(d => { d.entiteAdmin = null; d.id = null; });
        }
	}


   public  override prepareColumnExport(): void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                 'Libelle': e.libelle ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Libelle': this.criteria.libelle ? this.criteria.libelle : environment.emptyForExport ,
        }];
      }
}
