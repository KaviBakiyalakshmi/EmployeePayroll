package com.example.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class EmployeePayroll {

	WebDriver wd;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\princ\\eclipse-workspace\\Phase-5\\chromedriver_win32\\chromedriver.exe");
		wd = new ChromeDriver();
		
	}

	@AfterClass
	public void afterClass() {
		wd = null;
	}
	
	@Test(priority = 1)
	public void userTest() throws InterruptedException {
		wd.get("http://localhost:4200/login");
		wd.manage().window().maximize();

		// Login Credentials
		WebElement emailRef = wd.findElement(By.id("exampleInputEmail1"));
		emailRef.sendKeys("baljeet@gmail.com");
		WebElement passwordRef = wd.findElement(By.id("exampleInputPassword1"));
		passwordRef.sendKeys("123456");
		wd.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/form/form/button")).click();
		Thread.sleep(3000);
		wd.switchTo().alert().accept();
		Thread.sleep(1000);
		
		//User Attendance
		wd.findElement(By.xpath("/html/body/app-root/app-userdashboard/div[1]/div/div[1]/div[2]/button")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/app-root/app-userdashboard/div[1]/div/div[1]/div[2]/div/button")).click();
		Thread.sleep(1000);
		
		wd.navigate().to("http://localhost:4200/userdashboard");
		
		//User salary
		wd.findElement(By.xpath("/html/body/app-root/app-userdashboard/div[1]/div/div[1]/div[3]/button")).click();
		Thread.sleep(5000);
		wd.findElement(By.xpath("/html/body/app-root/app-userdashboard/div[1]/div/div[1]/div[3]/div/button")).click();
		Thread.sleep(1000);
		wd.navigate().to("http://localhost:4200/userdashboard");
		
		//User Leave
		wd.findElement(By.xpath("/html/body/app-root/app-userdashboard/div[1]/div/div[1]/div[1]/button")).click();
		Thread.sleep(1000);
		
		
		//Apply leave
		wd.findElement(By.xpath("/html/body/app-root/app-userdashboard/div[1]/div/div[1]/div[1]/div/button[1]")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/app-root/app-apply-leave/div[2]/div/div/form/div[1]/input")).sendKeys("10/19/2022");
		wd.findElement(By.xpath("/html/body/app-root/app-apply-leave/div[2]/div/div/form/div[2]/input")).sendKeys("10/20/2022");
		wd.findElement(By.xpath("/html/body/app-root/app-apply-leave/div[2]/div/div/form/div[3]/input")).sendKeys("Marriage");
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/app-root/app-apply-leave/div[2]/div/div/form/div[4]/button[1]")).click();
		Thread.sleep(5000);
		wd.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//Leave Status
		wd.findElement(By.xpath("/html/body/app-root/app-userdashboard/div[1]/div/div[1]/div[1]/button")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/app-root/app-userdashboard/div[1]/div/div[1]/div[1]/div/button[2]")).click();
		Thread.sleep(3000);
		
		wd.findElement(By.xpath("/html/body/app-root/app-leave-status/body/button")).click();
		Thread.sleep(3000);
		
//		//Edit
//		wd.findElement(By.xpath("/html/body/app-root/app-userdashboard/div[1]/div[1]/div/div/a")).click();
//		wd.findElement(By.xpath("/html/body/app-root/app-userdashboard/div[1]/div[1]/div/div/ul/li[1]/a")).click();
//		Thread.sleep(2000);
//		wd.findElement(By.id("name")).sendKeys("Ebinesar D");
//		wd.findElement(By.id("mobile")).sendKeys("9456217853");
//		wd.findElement(By.id("email")).sendKeys("ebi@gmail.com");
//		wd.findElement(By.id("gender")).sendKeys("Male");
//		wd.findElement(By.id("dob")).sendKeys("27/11/2000");
//		wd.findElement(By.id("doj")).sendKeys("17/06/2022");
//		wd.findElement(By.id("password1")).sendKeys("ebi");
//		wd.findElement(By.id("designation")).sendKeys("UI/UX");
//		wd.findElement(By.xpath("//*[@id=\"edit\"]/div/div/div[3]/button[2]")).click();
//		Thread.sleep(3000);
//		wd.switchTo().alert().accept();
//		Thread.sleep(2000);

		//Logout
		wd.findElement(By.xpath("/html/body/app-root/app-userdashboard/div[1]/nav/div/span[2]/button")).click();
		
		Thread.sleep(2000);
			
	}
	
	
	@Test(priority = 2)
	public void adminTest() throws InterruptedException {
		wd.get("http://localhost:4200/login");
		wd.manage().window().maximize();

		// Login Credentials
		wd.findElement(By.id("exampleInputEmail1")).sendKeys("admin@gmail.com");
		wd.findElement(By.id("exampleInputPassword1")).sendKeys("admin");
		wd.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/form/form/button")).click();
		Thread.sleep(3000);
		wd.switchTo().alert().accept();
		Thread.sleep(1000);
		
		//Employee
		wd.findElement(By.xpath("/html/body/app-root/app-admin-dashboard/div[1]/div[2]/div[1]/div[1]/a")).click();
		Thread.sleep(2000);
		//Add Employee
		wd.findElement(By.xpath("/html/body/app-root/app-admin-employee/div[1]/div/div[1]/button[1]")).click();
		Thread.sleep(1000);
		wd.findElement(By.id("name")).sendKeys("Akshay");
		wd.findElement(By.id("mobile")).sendKeys("9456242153");
		wd.findElement(By.id("email")).sendKeys("akshay@gmail.com");
		wd.findElement(By.id("gender")).sendKeys("Male");
		wd.findElement(By.id("dob")).sendKeys("27/12/2000");
		wd.findElement(By.id("doj")).sendKeys("27/06/2022");
		wd.findElement(By.id("password")).sendKeys("akshay");
		wd.findElement(By.id("designation")).sendKeys("Testing");
		wd.findElement(By.id("role")).sendKeys("2");
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/form/button[2]")).click();
		Thread.sleep(3000);
		wd.switchTo().alert().accept();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/app-root/app-admin-employee/div[1]/div/div[1]/button[2]")).click();
		Thread.sleep(3000);
		
		//Leave Status
		wd.findElement(By.xpath("/html/body/app-root/app-admin-dashboard/div[1]/div[2]/div[1]/div[2]/a")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("/html/body/app-root/app-admin-leave/div[2]/div/label[2]")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("/html/body/app-root/app-admin-leave/div[2]/div/button")).click();
		
//		//Attendance
//		Thread.sleep(2000);
//		wd.findElement(By.xpath("/html/body/app-root/app-admin-dashboard/div[1]/div[2]/div[1]/div[3]/a")).click();
//		Thread.sleep(1000);
//		//Add attendance
//		wd.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/button[1]")).click();
//		Thread.sleep(1000);
//		wd.findElement(By.id("employeeid")).sendKeys("2516615");
//		wd.findElement(By.id("name")).sendKeys("Bhalavaishnavi");
//		wd.findElement(By.id("starttime")).sendKeys("9.00");
//		wd.findElement(By.id("endtime")).sendKeys("6.00");
//		wd.findElement(By.id("date")).sendKeys("18/10/2022");
//		wd.findElement(By.id("status")).sendKeys("Present");
//		wd.findElement(By.xpath("//*[@id=\"addAttendance\"]/div/div/div[2]/form/div[7]/button")).click();
//		Thread.sleep(2000);
//		wd.switchTo().alert().accept();
//		Thread.sleep(1000);
//		wd.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/button[2]")).click();
//		Thread.sleep(2000);
		
		//Salary
		wd.findElement(By.xpath("/html/body/app-root/app-admin-dashboard/div[1]/div[2]/div[1]/div[4]/a")).click();
		//Add salary
		wd.findElement(By.xpath("/html/body/app-root/app-admin-salary/div[1]/div/div[1]/button[2]")).click();
		Thread.sleep(1000);
		wd.findElement(By.id("empid")).sendKeys("2526615");
		wd.findElement(By.id("name")).sendKeys("Kaviya");
		wd.findElement(By.id("month")).sendKeys("November");
		wd.findElement(By.id("year")).sendKeys("2022");
		wd.findElement(By.id("salary")).sendKeys("30000");
		wd.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/form/button[2]")).click();
		Thread.sleep(2000);
		wd.switchTo().alert().accept();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/app-root/app-admin-salary/div[1]/div/div[1]/button[1]")).click();
		
		
		//Logout
		Thread.sleep(2000);
		wd.findElement(By.xpath("/html/body/app-root/app-admin-dashboard/div[1]/div[1]/div/div/a")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("/html/body/app-root/app-admin-dashboard/div[1]/div[1]/div/div/ul/li[2]/a")).click();
	
	}

}
