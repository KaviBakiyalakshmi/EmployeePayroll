import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {


  apiServerUrl = 'http://localhost:8080/user';


  constructor(private http: HttpClient){ }

  //  public getUser(): Observable<User[]>{
  //      return this.http.get<User[]>(`${this.apiServerUrl}/all`);
  //  }

  public getUserById(userid: number): Observable<User[]>{
      return this.http.get<User[]>(`${this.apiServerUrl}/getid/${userid}`);
  }

  public addAadhars(aadhars: User): Observable<User>{
      return this.http.post<User>(`${this.apiServerUrl}/add`, aadhars);
  }

  public updateAadhars(aadhars: User): Observable<User>{
      return this.http.put<User>(`${this.apiServerUrl}/update`, aadhars);
  }

  public deleteAadhars(aadharid: number): Observable<void>{
      return this.http.delete<void>(`${this.apiServerUrl}/delete/${aadharid}`);
  }



}
