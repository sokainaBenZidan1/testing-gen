import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {EmployeManagerService} from 'src/app/shared/service/manager/commun/EmployeManager.service';
import {EmployeDto} from 'src/app/shared/model/commun/Employe.model';
import {EmployeCriteria} from 'src/app/shared/criteria/commun/EmployeCriteria.model';

import {EntiteAdminDto} from 'src/app/shared/model/commun/EntiteAdmin.model';
import {EntiteAdminManagerService} from 'src/app/shared/service/manager/commun/EntiteAdminManager.service';
@Component({
  selector: 'app-employe-view-manager',
  templateUrl: './employe-view-manager.component.html'
})
export class EmployeViewManagerComponent extends AbstractViewController<EmployeDto, EmployeCriteria, EmployeManagerService> implements OnInit {


    constructor(private employeService: EmployeManagerService, private entiteAdminService: EntiteAdminManagerService){
        super(employeService);
    }

    ngOnInit(): void {
    }


    get entiteAdmin(): EntiteAdminDto {
       return this.entiteAdminService.item;
    }
    set entiteAdmin(value: EntiteAdminDto) {
        this.entiteAdminService.item = value;
    }
    get entiteAdmins(): Array<EntiteAdminDto> {
       return this.entiteAdminService.items;
    }
    set entiteAdmins(value: Array<EntiteAdminDto>) {
        this.entiteAdminService.items = value;
    }


}
