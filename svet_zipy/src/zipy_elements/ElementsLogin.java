package zipy_elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsLogin {
	
	// login and sign-up Elements:
	public static final String Popup_welcome_close = "//button[@title='Close']";	

	public static final String UserTopBar_close = "//span[@class='topbar__forms-close']";
	public static final String UserTopBar = "/html//div[@id='topbar']/div[@class='default']//span[@class='topbar__user-link-no-name']";
	
	public static final String Username = "vikos120989@yandex.com";	
	public static final String Password = "123456";	

	public static final String Login_button = "/html//div[@id='topbar']/div[@class='default']/div[4]/div[2]/span[@class='topbar__menu-item-link']/span[@class='topbar__menu-item-link--dotted']";
	public static final String Logedin_button = "/html//div[@id='topbar']/div[@class='default']//span[@class='topbar__user-link-no-name']";
	public static final String Login_disconnect = "/html//form[@id='profileForm']//a[@href='/user/logout']/span[@class='topbar__user-dropdown-logout-anchor']";
	public static final String Login_usernameField = "/html//input[@id='i_signin-email']";
	public static final String LoginFrame_close ="/html//div[@id='topbar']/div[@class='default']/div[4]/div[3]//span[@class='ico ico--cross']";
	public static final String Login_close ="//span[@class='topbar__forms-close']";
	public static final String Login_TempUsername = "zipi01@4tmail.com";	//zipi02@4tmail.com , zipi03@4tmail.com  from:https://temp-mail.org/en/
	public static final String Login_discounts_checkVi = "/html//form[@id='registerForm']/fieldset[@class='user-form__fields']/div[@class='field field--submit']/div[1]/label/u[@class='m--big']/span[@class='ico ico--check']";
	public static final String Login_discounts_uncheckVi = "/html//form[@id='registerForm']/fieldset[@class='user-form__fields']/div[@class='field field--submit']/div[1]/label/u[@class='m--big']";
	public static final String Login_terms_uncheckedVi = "/html//form[@id='registerForm']/fieldset[@class='user-form__fields']/div[@class='field field--submit']/div[2]/label/u[@class='m--big']";
	public static final String Login_terms_checkedVi = "/html//form[@id='registerForm']/fieldset[@class='user-form__fields']/div[@class='field field--submit']/div[2]/label/u[@class='m--big']/span[@class='ico ico--check']";


	public static final String SignUp_button = "/html//div[@id='topbar']/div[@class='default']/div[4]/div[1]/span/span[@class='topbar__menu-item-link--dotted']";
	public static final String SignUp_field_email = "i_signup-email";
	public static final String SignUp_button_confirm = "/html//form[@id='registerForm']//button[@type='submit']";
	public static final String SignUp_PasswordShown = "/html//form[@id='registerForm']/fieldset/div[3]/div[@class='field__field']/div//span[@class='ico ico--eye']";
	public static final String SignUp_PasswordHiden = "/html//form[@id='registerForm']/fieldset/div[3]/div[@class='field__field']/div//span[@class='ico ico--eye-hide']";
	public static final String SignUp_phone_button = "/html//form[@id='registerForm']//div[@class='button m--fill m--h40 social-phone']/span[@class='button-text']/span[@class='hidden-lte-m']";
	public static final String SignUp_phoneNumber = "/html//input[@id='i_sign-phone']";
	public static final String SignUp_phoneNumber_toSignIn = "/html//form[@id='phoneNumberForm']//a[@class='field__signin-link']";
	public static final String SignIn_phoneNumber_toSignUp = "/html//form[@id='phoneNumberForm']//span[@class='field__signup']/a[@class='field__signup-link']";
	public static final String SignUp_google_button = "/html//form[@id='registerForm']//div[@class='button m--fill m--h40 social-gplus']/span[@class='button-text']/span[@class='hidden-lte-m']";
	public static final String SignUp_google_field = "/html//input[@id='identifierId']";
	public static final String SignUp_googlePassword_field = "/html//div[@id='password']//input[@name='password']";
	public static final String SignUp_fb_button = "/html//form[@id='registerForm']//div[@class='button m--fill m--h40 social-facebook']/span[@class='button-text']/span[@class='hidden-lte-m']";
	public static final String SignUp_fb_field = "//html[@id='facebook']//input[@id='email']";
	public static final String SignUp_fbPassword_field = "//html[@id='facebook']//input[@id='pass']";	
	public static final String SignUp_fb_zipyLogo = "//html[@id='facebook']//form[@id='platformDialogForm']/div[@class='_5l58']/div[@class='_5uz8']/div[@class='_16l6 _396- _3crb']//img";
	public static final String SignUp_fb_userAccept = "//html[@id='facebook']//form[@id='platformDialogForm']//div[@class='_5uz8']//button[@name='__CONFIRM__']";
	public static final String SignUp_phone_pressEnter = "/html//form[@id='phoneNumberForm']//button[@type='submit']";
	public static final String SignUp_phone_fieldCode ="/html//input[@id='i_sign-code']";
	public static final String SignUp_phone_messageExist = "/html//form[@id='phoneNumberForm']//p[.='מספר זה כבר קיים במערכת']";

	// phone and mail parameters:
	public static final String PhoneNumber = "+97253-9821817"; //from https://miracletele.com/sms/receive/IL/972539822586
	public static final String PhoneNumber_short = "+97253-98218"; 
	public static final String PhoneNumber_long = "+97253-98218171234"; 
	public static final String PhoneNumber_letters = "+97a53-9821817";
	public static final String PhoneNumber_letterF = "a53-9821817";
	public static final String PhoneNumber_signF = "$53-9821817"; 
	public static final String PhoneNumber_emptySpace = "          ";
	public static final String PhoneNumber_wiredPhone = "+9728-6438123"; 
	public static final String PhoneNumber_wiredIllegal = "012345678"; 
	public static final String PhoneNumber_mobileIllegal = "0111111111"; 

	public static final String Email = "test@mail.com";
	public static final String Email_zipy = "testzipy1@gmail.com";
	public static final String Email_zipy_password = "testzipy1testzipy1";
	public static final String Email_empty = "  ";
	public static final String Email_domain_withoutAt = "testmail.com";
	public static final String Email_domain_illegal = "test@1#1.com";
	public static final String Email_domain_empty = "test@      .com";
	public static final String Email_ending_withoutDot = "test@mailcom";	
	public static final String Email_ending_empty = "test@111.   ";	
	public static final String Email_ending_illegal = "test@mail.111";
	public static final String Email_name_startWithSign = "'test@mail.com";
	public static final String Email_name_withSpace = "t est@mail.com";
	public static final String Email_name_empty = "@mail.com";
	public static final String Email_domain_oneSignOnly = "t est@mail.com";
	public static final String Email_ending_oneSignOnly = "t est@mail.com";
	public static final String Email_moreThan254signs = "a12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345@mail.com";
	public static final String Email_noGoogle = "test@qwer.com";
	public static final String Email_phone = "050-6000000";

	public static final String Password_short = "123";
	public static final String Password_moreThan100signs = "12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901";
	public static final String Password_empty = "  ";

	public static final String Zipy_il = "https://www.zipy.co.il/";			//Israel
	public static final String Zipy_ilRu = "https://ru.zipy.co.il/";		//Israel russian
	public static final String Zipy_gr = "https://www.zipy.gr/";			//Greece
	public static final String Zipy_cy = "https://www.zipy.com.cy/";		//Cypress
	public static final String Zipy_ro = "https://www.zipy.ro/";			//Romania
	public static final String Zipy_it = "https://www.zipy.it/";			//Italy
	public static final String Zipy_py = "https://www.zipy.pt/";			//Portugal


}
