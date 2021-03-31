package com.OrangeHRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.OrangeHRM.BaseMethods.BaseMethods;

public class AddUserPage extends BaseMethods {
	
	public AddUserPage selectrole(String role) {
		WebElement uType= driver.findElementById("systemUser_userType");
		Select type = new Select(uType);
		type.selectByVisibleText(role);
		return this;
		
	}
	
	public AddUserPage entername(String empname) {
		driver.findElementById("systemUser_employeeName_empName").sendKeys(empname);
		return this;
		
	}
	
	public AddUserPage enteruname(String uname) {
		driver.findElementById("systemUser_userName").sendKeys(uname);
		return this;
	}
	
	public AddUserPage selectstatus(String status) {
		WebElement stat= driver.findElementById("systemUser_status");
		Select st = new Select (stat);
		st.selectByVisibleText(status);
		return this;
	}	
	
		public AdminPage btnsave() {
			driver.findElementById("btnSave").click();
			return new AdminPage();
		}
		
	}
