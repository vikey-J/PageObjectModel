package com.runner_Class;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.base_Class.Adress_Page;
import com.base_Class.Base_Class;
import com.base_Class.Cart_page;
import com.base_Class.HomePage;
import com.base_Class.New_Acc;
import com.base_Class.Payment_Page;
import com.base_Class.Shiping_Page;
import com.base_Class.Singin_Page;
import com.base_Class.Summary;

public class Test_Runner extends Base_Class {
	public static WebDriver driver=getBrowser("chrome");
	public static HomePage hp=new HomePage(driver);
	public static Cart_page cp=new Cart_page(driver);
	public static Summary sum=new Summary(driver);
	public static Singin_Page singin=new Singin_Page(driver);
	public static New_Acc np=new New_Acc(driver);
	public static Adress_Page ap=new Adress_Page(driver);
	public static Shiping_Page sp=new Shiping_Page(driver);
	public static Payment_Page pp=new Payment_Page(driver);
	public static void main(String[] args) {
		url("http://automationpractice.com/index.php");
		
		click(hp.getDresses());
        implicitWait(30, TimeUnit.SECONDS);
        click(hp.getCasual_Dresses());
		implicitWait(30, TimeUnit.SECONDS);
		
		// move the mouse to instock
		moveToElement(driver, cp.getInstock());
		click(cp.getAddcart());
		implicitWait(30, TimeUnit.SECONDS);
		click(cp.getCheckout1());

		// 1.summary
		javaScriptExecutor();
		implicitWait(30, TimeUnit.SECONDS);
		
		// click the + button for 6 times
        click(sum.getPlusclick1());
        click(sum.getPlusclick2());
        click(sum.getPlusclick3());
        click(sum.getPlusclick4());
        click(sum.getPlusclick5());
        click(sum.getPlusclick6());
        implicitWait(30, TimeUnit.SECONDS);
		click(sum.getCheckout2());

		// 2.Signin
        implicitWait(30, TimeUnit.SECONDS);
		sendkeys(singin.getEmail(),"vikey11@gmail.com");
		click(singin.getCreate_Acc());
		implicitWait(30, TimeUnit.SECONDS);
		
		//create an account page
		click(np.getMr());
		sendkeys(np.getFirstname(), "viknesh");
		sendkeys(np.getLastname(),"kumar");
		sendkeys(np.getPassword(),"vikey@123");
		sendkeys(np.getAdress_Fn(),"viknesh");
		sendkeys(np.getAdress_Ln(),"kumar" );
		sendkeys(np.getAdress_Company(),"DLF");
		sendkeys(np.getAddress(),"7,DLF road");
		sendkeys(np.getCity(),"Chennai");
		dropdown(np.getState(), "14");
		sendkeys(np.getPost(),"00000");
		sendkeys(np.getPhoneno(),"9876543210");
		click(np.getRegister());
		implicitWait(30, TimeUnit.SECONDS);
		
		//3.address
		implicitWait(30, TimeUnit.SECONDS);
        click(ap.getCheckout3());
        
		// 4.Shipping
        implicitWait(30, TimeUnit.SECONDS);
		click(sp.getAgree());
		click(sp.getCheckout4());

		// 5.Payment
		implicitWait(30, TimeUnit.SECONDS);
		click(pp.getBank());
		click(pp.getConfirm());
		javaScriptExecutor();

	}
}



