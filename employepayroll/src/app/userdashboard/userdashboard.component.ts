import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from './user';
import { UserService } from './user.service';

@Component({
  selector: 'app-userdashboard',
  templateUrl: './userdashboard.component.html',
  styleUrls: ['./userdashboard.component.css']
})
export class UserdashboardComponent implements OnInit {

     public user : any;
    formValue : FormGroup;
    userObj : User = new User();
    userData : any;
    idData: number;
    

  constructor(private formBuilder: FormBuilder,private http: HttpClient,  private router: Router, private userService: UserService) { }

  ngOnInit() {
    let dataa = localStorage.getItem('userid');
    if(dataa!=null)
     this.idData = parseInt(dataa);
     console.log(this.idData);
      this.getUser(this.idData);

      this.formValue = this.formBuilder.group({
        name:[''],
        mobile:[''],
        email:[''],
        gender:[''],
        dob:[''],
        doj:[''],
        password:[''],
        designation:[''],
        currUser: [this.idData]
  
      })
    }

  getUser(userid: number): void
  {
    this.userService.getUserById(userid).subscribe(
      (res: User[]) =>{
        this.user = res;
        console.log(this.user);
      },
      (error : HttpErrorResponse)=>{
        alert("Login First");
        this.router.navigate(['login']);
       
      }
    );
  }



  logoutSession()
  {
    console.log("in funciton");
    localStorage.setItem('userid',JSON.stringify(null));
    localStorage.setItem('empid',JSON.stringify(null));
    this.router.navigate(['login']);

  }


  

}
