import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { AdminLeaveComponent } from './admin-leave/admin-leave.component';
import { ApplyLeaveComponent } from './apply-leave/apply-leave.component';
import { LeaveStatusComponent } from './leave-status/leave-status.component';
import { LoginComponent } from './login/login.component';
import { SalaryDashboardComponent } from './salary-dashboard/salary-dashboard.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { UserAttendanceComponent } from './user-attendance/user-attendance.component';
import { UserdashboardComponent } from './userdashboard/userdashboard.component';

const routes: Routes = 
[
  {path: '', redirectTo: 'login', pathMatch:'full'},
  {path: 'login', component:LoginComponent},
  {path: 'userdashboard', component:UserdashboardComponent},
  {path: "applyleave", component:ApplyLeaveComponent},
  {path: "leavestatus", component:LeaveStatusComponent},
  {path: "sign-up", component:SignUpComponent},
  {path: "salary", component:SalaryDashboardComponent},
  {path: "admindashboard", component:AdminDashboardComponent},
  {path: "adminleave", component:AdminLeaveComponent},
  {path: "attendance", component:UserAttendanceComponent}
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
