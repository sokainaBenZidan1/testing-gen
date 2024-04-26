import {RouterModule} from '@angular/router';
import {NgModule} from '@angular/core';
import {AuthGuard} from "src/app/zynerator/security/guards/auth.guard";
import {AccessComponent} from "src/app/demo/components/auth/access/access.component";
import {AppLayoutComponent} from "src/app/layout/app.layout.component";

import {LoginAdminComponent} from 'src/app/module/admin/login-admin/login-admin.component';
import {RegisterAdminComponent} from 'src/app/module/admin/register-admin/register-admin.component';
import {LoginManagerComponent} from 'src/app/module/manager/login-manager/login-manager.component';
import {RegisterManagerComponent} from 'src/app/module/manager/register-manager/register-manager.component';
@NgModule({
    imports: [
        RouterModule.forRoot(
            [
                {path: '', component: LoginAdminComponent},
            {path: 'admin/login', component: LoginAdminComponent },
            {path: 'admin/register', component: RegisterAdminComponent },
            {path: 'manager/login', component: LoginManagerComponent },
            {path: 'manager/register', component: RegisterManagerComponent },
            {
            path: 'app',
            component: AppLayoutComponent,
            children: [
                {
                    path: 'admin',
                    loadChildren: () => import( './module/admin/admin-routing.module').then(x => x.AdminRoutingModule),
                    canActivate: [AuthGuard],
                },
                {
                    path: 'manager',
                    loadChildren: () => import( './module/manager/manager-routing.module').then(x => x.ManagerRoutingModule),
                    canActivate: [AuthGuard],
                },
                    { path: 'denied', component: AccessComponent },
                ],
                canActivate: [AuthGuard]
                },
            ],
                { scrollPositionRestoration: 'enabled' }
            ),
        ],
    exports: [RouterModule],
    })
export class AppRoutingModule { }
