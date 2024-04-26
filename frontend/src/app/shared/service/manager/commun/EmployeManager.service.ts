import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import {environment} from 'src/environments/environment';

import {EmployeDto} from 'src/app/shared/model/commun/Employe.model';
import {EmployeCriteria} from 'src/app/shared/criteria/commun/EmployeCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class EmployeManagerService extends AbstractService<EmployeDto, EmployeCriteria> {
     constructor(private http: HttpClient) {
        super();
        this.setHttp(http);
    }

    public constrcutDto(): EmployeDto {
        return new EmployeDto();
    }

    public constrcutCriteria(): EmployeCriteria {
        return new EmployeCriteria();
    }

    get API() {
        return environment.apiUrlBudgetAllocationservice + 'manager/employe/';
    }
}
