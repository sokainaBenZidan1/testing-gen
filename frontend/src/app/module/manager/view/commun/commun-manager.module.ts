import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import {ToastModule} from 'primeng/toast';
import {ToolbarModule} from 'primeng/toolbar';
import {TableModule} from 'primeng/table';
import {DropdownModule} from 'primeng/dropdown';
import {InputSwitchModule} from 'primeng/inputswitch';
import {InputTextareaModule} from 'primeng/inputtextarea';

import { ConfirmDialogModule } from 'primeng/confirmdialog';
import { DialogModule } from 'primeng/dialog';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {CalendarModule} from 'primeng/calendar';
import {PanelModule} from 'primeng/panel';
import {InputNumberModule} from 'primeng/inputnumber';
import {BadgeModule} from 'primeng/badge';
import { MultiSelectModule } from 'primeng/multiselect';
import {TranslateModule} from '@ngx-translate/core';
import {FileUploadModule} from 'primeng/fileupload';
import {FullCalendarModule} from '@fullcalendar/angular';
import {CardModule} from "primeng/card";

import { EmployeCreateManagerComponent } from './employe/create/employe-create-manager.component';
import { EmployeEditManagerComponent } from './employe/edit/employe-edit-manager.component';
import { EmployeViewManagerComponent } from './employe/view/employe-view-manager.component';
import { EmployeListManagerComponent } from './employe/list/employe-list-manager.component';
import { EntiteAdminCreateManagerComponent } from './entite-admin/create/entite-admin-create-manager.component';
import { EntiteAdminEditManagerComponent } from './entite-admin/edit/entite-admin-edit-manager.component';
import { EntiteAdminViewManagerComponent } from './entite-admin/view/entite-admin-view-manager.component';
import { EntiteAdminListManagerComponent } from './entite-admin/list/entite-admin-list-manager.component';

import { PasswordModule } from 'primeng/password';
import { InputTextModule } from 'primeng/inputtext';
import {ButtonModule} from 'primeng/button';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import {TabViewModule} from 'primeng/tabview';
import { SplitButtonModule } from 'primeng/splitbutton';
import { MessageModule } from 'primeng/message';
import {MessagesModule} from 'primeng/messages';
import {PaginatorModule} from 'primeng/paginator';



@NgModule({
  declarations: [

    EmployeCreateManagerComponent,
    EmployeListManagerComponent,
    EmployeViewManagerComponent,
    EmployeEditManagerComponent,
    EntiteAdminCreateManagerComponent,
    EntiteAdminListManagerComponent,
    EntiteAdminViewManagerComponent,
    EntiteAdminEditManagerComponent,
  ],
  imports: [
    CommonModule,
    ToastModule,
    ToolbarModule,
    TableModule,
    ConfirmDialogModule,
    DialogModule,
    PasswordModule,
    InputTextModule,
    ButtonModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    SplitButtonModule,
    BrowserAnimationsModule,
    DropdownModule,
    TabViewModule,
    InputSwitchModule,
    InputTextareaModule,
    CalendarModule,
    PanelModule,
    MessageModule,
    MessagesModule,
    InputNumberModule,
    BadgeModule,
    MultiSelectModule,
    PaginatorModule,
    TranslateModule,
    FileUploadModule,
    FullCalendarModule,
    CardModule,

  ],
  exports: [
  EmployeCreateManagerComponent,
  EmployeListManagerComponent,
  EmployeViewManagerComponent,
  EmployeEditManagerComponent,
  EntiteAdminCreateManagerComponent,
  EntiteAdminListManagerComponent,
  EntiteAdminViewManagerComponent,
  EntiteAdminEditManagerComponent,
  ],
})
export class CommunManagerModule { }
