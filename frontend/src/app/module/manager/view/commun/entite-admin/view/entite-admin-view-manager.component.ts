import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {EntiteAdminManagerService} from 'src/app/shared/service/manager/commun/EntiteAdminManager.service';
import {EntiteAdminDto} from 'src/app/shared/model/commun/EntiteAdmin.model';
import {EntiteAdminCriteria} from 'src/app/shared/criteria/commun/EntiteAdminCriteria.model';

import {EmployeDto} from 'src/app/shared/model/commun/Employe.model';
import {EmployeManagerService} from 'src/app/shared/service/manager/commun/EmployeManager.service';
@Component({
  selector: 'app-entite-admin-view-manager',
  templateUrl: './entite-admin-view-manager.component.html'
})
export class EntiteAdminViewManagerComponent extends AbstractViewController<EntiteAdminDto, EntiteAdminCriteria, EntiteAdminManagerService> implements OnInit {

    employe = new EmployeDto();
    employes: Array<EmployeDto> = [];

    constructor(private entiteAdminService: EntiteAdminManagerService, private employeService: EmployeManagerService){
        super(entiteAdminService);
    }

    ngOnInit(): void {
    }




}
