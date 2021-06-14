package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By User = By.id("menuUserLink");
	public By newAccount = By.xpath("/html/body/login-modal/div/div/div[3]/a[2]");
	public By UserName = By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/input");
	public By email = By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[2]/div/input");
	public By password = By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/input");
	public By confirmPassword = By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/input");
	public By firstName = By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[1]/div/input");
	public By lastName = By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[2]/div/input");
	public By phone = By.xpath("//*[@id=\"formCover\"]/div[2]/div[2]/sec-view/div/input");
	public By country = By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[1]/div/select");
	public By city = By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[2]/div/input");
	public By address = By.xpath("//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[1]/div/input");
	public By state = By.xpath("//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[2]/div/input");
	public By postal = By.xpath("//*[@id=\"formCover\"]/div[3]/div[3]/sec-view/div/input");
	public By btnRegister = By.id("register_btnundefined");
	public By agree = By.xpath("//*[@id=\"formCover\"]/sec-view/div/input");
	public By adv = By.xpath("/html/body/header/nav/div/a/span[1]");
	
	public By usernome = By.name("username");
	public By senha = By.name("password");
	public By login = By.id("sign_in_btnundefined");
	
}
