package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;


public class EmployeePayroll {
	WebDriver wd;
  @Test
public void signinTest() {
	  wd.get("file:///C:/Users/Vaishnavi/Downloads/login.component.html");
	  wd.manage().window().maximize();
	  
	  // Login Credentials
	  
	  WebElement emailRef = wd.findElement(By.id("exampleInputEmail1"));
	  emailRef.sendKeys("vaishusrajan@gmail.com");
	  WebElement passwordRef = wd.findElement(By.id("exampleInputPassword1"));
	  passwordRef.sendKeys("Vaishu18");
	  WebElement loginRef = wd.findElement(By.xpath("/html/body/div/div/div/div/form/button"));
	  loginRef.click();
	  
	  
  }
  @Test
  public void RegisterPageTest() {
		  wd.get("file:///C:/Users/Vaishnavi/Downloads/sign-up.component.html");
		  wd.manage().window().maximize();
		  
		  // Registration Details
		  
		  WebElement nameRef = wd.findElement(By.id("exampleInputPassword1"));
		  nameRef.sendKeys("Vaishnavi");
		  WebElement mobileRef = wd.findElement(By.id("exampleInputPassword2"));
		  mobileRef.sendKeys("6383899702");
		  WebElement emailRef = wd.findElement(By.id("exampleInputEmail3"));
		  emailRef.sendKeys("vaishusrajan@gmail.com");
		  WebElement genderRef = wd.findElement(By.id("exampleInputPassword4"));
		  genderRef.sendKeys("Female");
		  WebElement dobRef = wd.findElement(By.id("exampleInputPassword4"));
		  dobRef.sendKeys("05/04/2001");
		  WebElement dojRef = wd.findElement(By.id("exampleInputPassword4"));
		  dojRef.sendKeys("17/06/2022");
		  WebElement passwordRef = wd.findElement(By.id("exampleInputPassword4"));
		  passwordRef.sendKeys("Vaishu18");
		  WebElement designationRef = wd.findElement(By.id("exampleInputPassword4"));
		  designationRef.sendKeys("Developer");
		  
		  //sign up
		  
		  WebElement signupRef = wd.findElement(By.xpath("/html/body/div/div/div/div/form/button"));
		  signupRef.click();
	  
  }
  @Test
  public void Edit() {
	  wd.get("file:///C:/Users/Vaishnavi/Downloads/edit.component.html");
	  wd.manage().window().maximize();
  }
  @Test
  public void userdashboard() {
  wd.get("file:///C:/Users/Vaishnavi/Downloads/userdashboard.component.html");
  wd.manage().window().maximize();
  
  // Update Profile
  
  WebElement nameRef = wd.findElement(By.id("name"));
  nameRef.sendKeys("Vaishnavi");
  WebElement mobileRef = wd.findElement(By.id("mobile"));
  mobileRef.sendKeys("6383899702");
  WebElement emailRef = wd.findElement(By.id("email"));
  emailRef.sendKeys("vaishusrajan@gmail.com");
  WebElement genderRef = wd.findElement(By.id("gender"));
  genderRef.sendKeys("Female");
  WebElement dobRef = wd.findElement(By.id("dob"));
  dobRef.sendKeys("05/04/2001");
  WebElement dojRef = wd.findElement(By.id("doj"));
  dojRef.sendKeys("17/06/2022");
  WebElement passwordRef = wd.findElement(By.id("password1"));
  passwordRef.sendKeys("Vaishu18");
  WebElement designationRef = wd.findElement(By.id("designation"));
  designationRef.sendKeys("Developer");
   
  //Cancel,Update
  
  WebElement cancelRef = wd.findElement(By.id("cancel1"));
  cancelRef.click();
  WebElement updateRef = wd.findElement(By.xpath("//*[@id=\"edit\"]/div/div/div[3]/button[2]"));
  updateRef.click();
  }
  @Test
  public void userattendance() {
	  wd.get("file:///C:/Users/Vaishnavi/Downloads/user-attendance.component.html");
	  wd.manage().window().maximize();
	  
	  //Add Employee Attendance Details
	  
	  WebElement idRef = wd.findElement(By.id("id"));
	  idRef.sendKeys("01");
	  WebElement EmployeeidRef = wd.findElement(By.id("employeeid"));
	  EmployeeidRef.sendKeys("2516615");
	  WebElement nameRef = wd.findElement(By.id("name"));
	  nameRef.sendKeys("Bhalavaishnavi");
	  WebElement StartTimeRef = wd.findElement(By.id("starttime"));
	  StartTimeRef.sendKeys("9.00");
	  WebElement EndTimeRef = wd.findElement(By.id("endtime"));
	  EndTimeRef.sendKeys("6.00");
	  WebElement DateRef = wd.findElement(By.id("date"));
	  DateRef.sendKeys("18/10/2022");
	  WebElement StatusRef = wd.findElement(By.id("status"));
	  StatusRef.sendKeys("Present");
	  WebElement AddEmployeeRef = wd.findElement(By.xpath("//*[@id=\"addAttendance\"]/div/div/div[2]/form/div[8]/button[2]"));
	  AddEmployeeRef.click();
	  WebElement CloseRef = wd.findElement(By.xpath("//*[@id=\"addAttendance\"]/div/div/div[2]/form/div[8]/button[1]"));
	  CloseRef.click();
	  
	  //Update Attendance Details
	  
	  WebElement IDRef = wd.findElement(By.xpath("//*[@id=\"id\"]"));
	  IDRef.sendKeys("01");
	  WebElement EmployeeIDRef = wd.findElement(By.xpath("//*[@id=\"employeeid\"]"));
	  EmployeeIDRef.sendKeys("2516615");
	  WebElement NAMERef = wd.findElement(By.xpath("//*[@id=\"name\"]"));
	  NAMERef.sendKeys("Bhalavaishnavi");
	  WebElement STARTTIMERef = wd.findElement(By.xpath("//*[@id=\"starttime\"]"));
	  STARTTIMERef.sendKeys("9.00");
	  WebElement ENDTIMERef = wd.findElement(By.xpath("//*[@id=\"endtime\"]"));
	  ENDTIMERef.sendKeys("1.00");
	  WebElement DATERef = wd.findElement(By.xpath("//*[@id=\"date\"]"));
	  DATERef.sendKeys("18/10/2022");
	  WebElement STATUSRef = wd.findElement(By.xpath("//*[@id=\"status\"]"));
	  STATUSRef.sendKeys("Halfday");
	  WebElement UpdateRef = wd.findElement(By.xpath("//*[@id=\"editAttendance\"]/div/div/div[2]/form/div[8]/button[2]"));
	  UpdateRef.click();
	  WebElement CLOSERef = wd.findElement(By.xpath("//*[@id=\"editAttendance\"]/div/div/div[2]/form/div[8]/button[1]"));
	  CLOSERef.click();
	  
  }
  
  
  @Test
  public void SalaryDashboard() {
	  wd.get("file:///C:/Users/Vaishnavi/Downloads/salary-dashboard.component.html");
	  wd.manage().window().maximize();
	  }
  
  
  @Test
  public void LeaveStatus() {
	  wd.get("file:///C:/Users/Vaishnavi/Downloads/leave-status.component.html");
	  wd.manage().window().maximize();
	  WebElement BackRef = wd.findElement(By.xpath("/html/body/button"));
	  BackRef.click();
	 }
  
  
  @Test
  public void ApplyLeave() {
	  wd.get("file:///C:/Users/Vaishnavi/Downloads/apply-leave.component.html");
	  wd.manage().window().maximize();
	  
	  //Leave Details
	  
	  WebElement StartDateRef = wd.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/input"));
	  StartDateRef.sendKeys("19-10-2022");
	  WebElement EndDateRef = wd.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/input"));
	  EndDateRef.sendKeys("20-10-2022");
	  WebElement ReasonRef = wd.findElement(By.xpath("/html/body/div[2]/div/div/form/div[3]/input"));
	  ReasonRef.sendKeys("Health issues");
	  WebElement ApplyRef = wd.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/button[1]"));
	  ApplyRef.click();
	  WebElement CancelRef = wd.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/button[2]"));
	  CancelRef.click();
 }
  
  @Test
  public void AdminSalaryDashboard() {
	  wd.get("file:///C:/Users/Vaishnavi/Downloads/admin-salary.component.html");
	  wd.manage().window().maximize();
	  
	  //Add New Data, Edit, Delete 
	  
	  WebElement AddNewDataRef = wd.findElement(By.xpath("/html/body/div[1]/div/div[1]/button[2]"));
	  AddNewDataRef.click();
	  WebElement EditRef = wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/table/tbody/tr/td[6]/button[1]"));
	  EditRef.click();
	  WebElement DeleteRef = wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/table/tbody/tr/td[6]/button[2]"));
	  DeleteRef.click();
	  
	  //Add New Data
	  
	  WebElement EmployeeIDRef = wd.findElement(By.id("empid"));
	  EmployeeIDRef.sendKeys("2526615");
	  WebElement NameRef = wd.findElement(By.id("name"));
	  NameRef.sendKeys("Kaviya");
	  WebElement MONTHRef = wd.findElement(By.id("month"));
	  MONTHRef.sendKeys("November");
	  WebElement YEARRef = wd.findElement(By.id("year"));
	  YEARRef.sendKeys("2022");
	  WebElement SalaryRef = wd.findElement(By.id("salary"));
	  SalaryRef.sendKeys("30000");
	  
	  //Cancel, Save
	  
	  WebElement SaveRef = wd.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/form/button[2]"));
	  SaveRef.click();
	  WebElement CancelRef = wd.findElement(By.xpath("//*[@id=\"cancel\"]"));
	  CancelRef.click();
	  
	  //Update Salary
	  
	  WebElement SALARYRef = wd.findElement(By.xpath("//*[@id=\"salary\"]"));
	  SALARYRef.sendKeys("30000");
	  WebElement UpdateRef = wd.findElement(By.xpath("//*[@id=\"exampleModal1\"]/div/div/div[2]/form/button[2]"));
	  UpdateRef.click();
	 }
  
  @Test
  public void AdminLeaveDashboard() {
	  // Launching the browser
	  wd.get("file:///C:/Users/Vaishnavi/Downloads/admin-leave.component.html");
	  wd.manage().window().maximize();
	  
	  //Action
	  WebElement ApproveRef = wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/table/tbody/tr/td[6]/button[1]"));
	  ApproveRef.click();
	  WebElement RejectRef = wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/table/tbody/tr/td[6]/button[2]"));
	  RejectRef.click();
	 }
  
  @Test
  public void AdminEmployeeDashboard() {
	  wd.get("file:///C:/Users/Vaishnavi/Downloads/admin-employee.component.html");
	  wd.manage().window().maximize();
	  
	  //Add New Employee
	  
	  WebElement AddNewEmployeeRef = wd.findElement(By.xpath("/html/body/div[1]/div/div[1]/button[1]"));
	  AddNewEmployeeRef.click();
	  
	  //Edit, Delete, Back
	  
	  WebElement EditRef = wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/table/tbody/tr/td[12]/button[1]"));
	  EditRef.click();
	  WebElement DeleteRef = wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/table/tbody/tr/td[12]/button[2]"));
	  DeleteRef.click();
	  WebElement BackRef = wd.findElement(By.xpath("/html/body/div[1]/div/div[1]/button[2]"));
	  BackRef.click();
	  
	  //Add Data
	  
	  
	  
	  WebElement nameRef = wd.findElement(By.id("name"));
	  nameRef.sendKeys("Vaishnavi");
	  WebElement mobileRef = wd.findElement(By.id("mobile"));
	  mobileRef.sendKeys("6383899702");
	  WebElement emailRef = wd.findElement(By.id("email"));
	  emailRef.sendKeys("vaishusrajan@gmail.com");
	  WebElement genderRef = wd.findElement(By.id("gender"));
	  genderRef.sendKeys("Female");
	  WebElement dobRef = wd.findElement(By.id("dob"));
	  dobRef.sendKeys("05/04/2001");
	  WebElement dojRef = wd.findElement(By.id("doj"));
	  dojRef.sendKeys("17/06/2022");
	  WebElement passwordRef = wd.findElement(By.id("password"));
	  passwordRef.sendKeys("Vaishu18");
	  WebElement designationRef = wd.findElement(By.id("designation"));
	  designationRef.sendKeys("Developer");
	  WebElement RoleRef = wd.findElement(By.id("role"));
	  RoleRef.sendKeys("Admin");
	  
	  //Cancel,Save,Update
	  WebElement cancelRef = wd.findElement(By.id("cancel"));
	  cancelRef.click();
	  WebElement SaveRef = wd.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/form/button[2]"));
	  SaveRef.click();
	  WebElement UpdateRef = wd.findElement(By.xpath("//*[@id=\"exampleModal1\"]/div/div/div[2]/form/button[2]"));
	  UpdateRef.click();
  }
  
  @Test
  public void AdminAttendanceDashboard() {
	  wd.get("file:///C:/Users/Vaishnavi/Downloads/admin-attendance.component.html");
	  wd.manage().window().maximize();
	  
	  //Add Attendance
	  
	  WebElement AddAttendanceRef = wd.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/button[1]"));
	  AddAttendanceRef.click();
	
	  WebElement EmployeeidRef = wd.findElement(By.id("employeeid"));
	  EmployeeidRef.sendKeys("2516615");
	  WebElement nameRef = wd.findElement(By.id("name"));
	  nameRef.sendKeys("Bhalavaishnavi");
	  WebElement StartTimeRef = wd.findElement(By.id("starttime"));
	  StartTimeRef.sendKeys("9.00");
	  WebElement EndTimeRef = wd.findElement(By.id("endtime"));
	  EndTimeRef.sendKeys("6.00");
	  WebElement DateRef = wd.findElement(By.id("date"));
	  DateRef.sendKeys("18/10/2022");
	  WebElement StatusRef = wd.findElement(By.id("status"));
	  StatusRef.sendKeys("Present");
	  WebElement ADDATTENDANCERef = wd.findElement(By.xpath("//*[@id=\"addAttendance\"]/div/div/div[2]/form/div[7]/button"));
	  ADDATTENDANCERef.click();
	  WebElement UpdateRef = wd.findElement(By.xpath("//*[@id=\"editAttendance\"]/div/div/div[2]/form/div[7]/button[2]"));
	  UpdateRef.click();
	  
	  //Edit, Delete, Back
	  
	  WebElement EditRef = wd.findElement(By.xpath("/html/body/div/table/tbody/tr/td[7]/button[1]"));
	  EditRef.click();
	  WebElement DeleteRef = wd.findElement(By.xpath("/html/body/div/table/tbody/tr/td[7]/button[2]"));
	  DeleteRef.click();
	  WebElement BackRef = wd.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/button[2]"));
	  BackRef.click();
  }
  
  
  @Test
  public void AdminDashboard() {
	  wd.get("file:///C:/Users/Vaishnavi/Downloads/admin-dashboard.component.html");
	  wd.manage().window().maximize();
	  
	   //Update Profile
	  
	  WebElement nameRef = wd.findElement(By.id("name"));
	  nameRef.sendKeys("Vaishnavi");
	  WebElement mobileRef = wd.findElement(By.id("mobile"));
	  mobileRef.sendKeys("6383899702");
	  WebElement emailRef = wd.findElement(By.id("email"));
	  emailRef.sendKeys("vaishusrajan@gmail.com");
	  WebElement genderRef = wd.findElement(By.id("gender"));
	  genderRef.sendKeys("Female");
	  WebElement dobRef = wd.findElement(By.id("dob"));
	  dobRef.sendKeys("05/04/2001");
	  WebElement dojRef = wd.findElement(By.id("doj"));
	  dojRef.sendKeys("17/06/2022");
	  WebElement passwordRef = wd.findElement(By.id("password1"));
	  passwordRef.sendKeys("Vaishu18");
	  WebElement designationRef = wd.findElement(By.id("designation"));
	  designationRef.sendKeys("Developer");
	  
	  //Cancel,Update
	  
	  WebElement cancelRef = wd.findElement(By.xpath("//*[@id=\"cancel1\"]"));
	  cancelRef.click();
	  WebElement updateRef = wd.findElement(By.xpath("//*[@id=\"edit\"]/div/div/div[3]/button[2]"));
	  updateRef.click();
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
	  
	  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vaishnavi\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		wd = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  //wd.close();
  }

}
