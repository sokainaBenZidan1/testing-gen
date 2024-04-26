import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {EntiteAdminManagerService} from 'src/app/shared/service/manager/commun/EntiteAdminManager.service';
import {EntiteAdminDto} from 'src/app/shared/model/commun/EntiteAdmin.model';
import {EntiteAdminCriteria} from 'src/app/shared/criteria/commun/EntiteAdminCriteria.model';
import {EmployeDto} from 'src/app/shared/model/commun/Employe.model';
import {EmployeManagerService} from 'src/app/shared/service/manager/commun/EmployeManager.service';
@Component({
  selector: 'app-entite-admin-create-manager',
  templateUrl: './entite-admin-create-manager.component.html'
})
export class EntiteAdminCreateManagerComponent extends AbstractCreateController<EntiteAdminDto, EntiteAdminCriteria, EntiteAdminManagerService>  implements OnInit {

    private _employeElement = new EmployeDto();


   private _validEntiteAdminCode = true;
   private _validEntiteAdminLibelle = true;
    private _validEmployeNom = true;
    private _validEmployePrenom = true;

    constructor( private entiteAdminService: EntiteAdminManagerService , private employeService: EmployeManagerService) {
        super(entiteAdminService);
    }

    ngOnInit(): void {
    }



    validateEmploye(){
        this.errorMessages = new Array();
        this.validateEmployeNom();
        this.validateEmployePrenom();
    }


    public override setValidation(value: boolean){
        this.validEntiteAdminCode = value;
        this.validEntiteAdminLibelle = value;
        this.validEmployeNom = value;
        this.validEmployePrenom = value;
    }

    public addEmploye() {
        if( this.item.employe == null )
            this.item.employe = new Array<EmployeDto>();
       this.validateEmploye();
       if (this.errorMessages.length === 0) {
              this.item.employe.push({... this.employeElement});
              this.employeElement = new EmployeDto();
       }else{
            this.messageService.add({severity: 'error',summary: 'Erreurs',detail: 'Merci de corrigé les erreurs suivant : ' + this.errorMessages});
       }
    }


    public deleteemploye(p: EmployeDto) {
        this.item.employe.forEach((element, index) => {
            if (element === p) { this.item.employe.splice(index, 1); }
        });
    }

    public editemploye(p: EmployeDto) {
        this.employeElement = {... p};
        this.activeTab = 0;
    }


    public override validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateEntiteAdminCode();
        this.validateEntiteAdminLibelle();
    }

    public validateEntiteAdminCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validEntiteAdminCode = false;
        } else {
            this.validEntiteAdminCode = true;
        }
    }
    public validateEntiteAdminLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validEntiteAdminLibelle = false;
        } else {
            this.validEntiteAdminLibelle = true;
        }
    }

    public validateEmployeNom(){
        if (this.employeElement.nom == null) {
            this.errorMessages.push('Nom de la employe est  invalide');
            this.validEmployeNom = false;
        } else {
            this.validEmployeNom = true;
        }
    }
    public validateEmployePrenom(){
        if (this.employeElement.prenom == null) {
            this.errorMessages.push('Prenom de la employe est  invalide');
            this.validEmployePrenom = false;
        } else {
            this.validEmployePrenom = true;
        }
    }





    get validEntiteAdminCode(): boolean {
        return this._validEntiteAdminCode;
    }

    set validEntiteAdminCode(value: boolean) {
         this._validEntiteAdminCode = value;
    }
    get validEntiteAdminLibelle(): boolean {
        return this._validEntiteAdminLibelle;
    }

    set validEntiteAdminLibelle(value: boolean) {
         this._validEntiteAdminLibelle = value;
    }

    get validEmployeNom(): boolean {
        return this._validEmployeNom;
    }
    set validEmployeNom(value: boolean) {
        this._validEmployeNom = value;
    }
    get validEmployePrenom(): boolean {
        return this._validEmployePrenom;
    }
    set validEmployePrenom(value: boolean) {
        this._validEmployePrenom = value;
    }

    get employeElement(): EmployeDto {
        if( this._employeElement == null )
            this._employeElement = new EmployeDto();
        return this._employeElement;
    }

    set employeElement(value: EmployeDto) {
        this._employeElement = value;
    }

}
