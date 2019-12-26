package zipy_elements;

public class Elements {

	
	// login and sign-up:
	public static final String Zipy_site_heb = "https://www.zipy.co.il/";	
	public static final String Username = "vikos120989@yandex.com";	
	public static final String Password = "123456";	
	public static final String SignUp_button = "/html//div[@id='topbar']/div[@class='default']/div[4]/div[1]/span/span[@class='topbar__menu-item-link--dotted']";
	public static final String Popup_welcome_close = "//button[@title='Close']";
	public static final String Login_button = "//span[@data-user-form='popup_signin']";
	public static final String LoginFrame_close ="/html//div[@id='topbar']/div[@class='default']/div[4]/div[3]//span[@class='ico ico--cross']";
	public static final String Login_close ="//span[@class='topbar__forms-close']";
	public static final String TempUsername = "zipi01@4tmail.com";	//zipi02@4tmail.com , zipi03@4tmail.com  from:https://temp-mail.org/en/
	public static final String Discounts_checkVi = "/html//form[@id='registerForm']/fieldset[@class='user-form__fields']/div[@class='field field--submit']/div[1]/label/u[@class='m--big']/span[@class='ico ico--check']";
	public static final String Discounts_uncheckVi = "/html//form[@id='registerForm']/fieldset[@class='user-form__fields']/div[@class='field field--submit']/div[1]/label/u[@class='m--big']";
	public static final String Terms_uncheckedVi = "/html//form[@id='registerForm']/fieldset[@class='user-form__fields']/div[@class='field field--submit']/div[2]/label/u[@class='m--big']";
	public static final String Terms_checkedVi = "/html//form[@id='registerForm']/fieldset[@class='user-form__fields']/div[@class='field field--submit']/div[2]/label/u[@class='m--big']/span[@class='ico ico--check']";
	public static final String UserTopBar_close = "//span[@class='topbar__forms-close']";
	public static final String UserTopBar = "/html//div[@id='topbar']/div[@class='default']//span[@class='topbar__user-link-no-name']";
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
	public static final String Temp_phoneNumber_pressEnter = "/html//form[@id='phoneNumberForm']//button[@type='submit']";
	public static final String Temp_phoneNumber_fieldCode ="/html//input[@id='i_sign-code']";
	public static final String SignUp_phone_messageExist = "/html//form[@id='phoneNumberForm']//p[.='מספר זה כבר קיים במערכת']";
	
	public static final String Temp_phoneNumber = "+97253-9821817"; //from https://miracletele.com/sms/receive/IL/972539822586
	public static final String Temp_phoneNumber_short = "+97253-98218"; 
	public static final String Temp_phoneNumber_long = "+97253-98218171234"; 
	public static final String Temp_phoneNumber_letters = "+97a53-9821817";
	public static final String Temp_phoneNumber_letterF = "a53-9821817";
	public static final String Temp_phoneNumber_signF = "$53-9821817"; 
	public static final String Temp_phoneNumber_emptySpace = "          ";
	public static final String Temp_phoneNumber_wiredPhone = "+9728-6438123"; 
	public static final String Temp_phoneNumber_wiredIllegal = "012345678"; 
	public static final String Temp_phoneNumber_mobileIllegal = "0111111111"; 

	public static final String emailIllegal_domain_withoutAt = "testmail.com";
	public static final String emailIllegal_domain_illegal = "test@111.com";
	public static final String emailIllegal_domain_empty = "test@      .com";
	public static final String emailIllegal_ending_withoutDot = "test@mailcom";	
	public static final String emailIllegal_ending_empty = "test@111.   ";	
	public static final String emailIllegal_ending_illegal = "test@mail.111";
	public static final String emailIllegal_name_startWithSign = "'test@mail.com";
	public static final String emailIllegal_name_withSpace = "t est@mail.com";
	public static final String emailIllegal_name_empty = "@mail.com";
	public static final String emailIllegal_domain_oneSignOnly = "t est@mail.com";
	public static final String emailIllegal_ending_oneSignOnly = "t est@mail.com";
	public static final String emailIllegal_moreThan254signs = "a12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345@mail.com";
	
	public static final String passwordIllegal_short = "123";
	public static final String passwordIllegal_moreThan100signs = "12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901";


	
////////////
	
	//buying - Web Elements:
	public static final String SearchItem =	"rez-micro-usb-cable-usb-charging-cord-mobile-phone-nylon-xiaomi-android-samsung-for-hua-wei";
	public static final String SearchItem_thumb ="//div[@data-id='32995752928'][@data-position='1']";
	public static final String Dropbox_color ="/html/body/div[@role='dialog']/div[@class='featherlight-close-layer']/div[@class='featherlight-content quick-view']/div[@class='featherlight-content-wrap']/div/section//div[@class='buy-options']/table[@class='product__params']/tbody/tr[1]/td/div[@class='product__params-selection']/div[@class='field__field']/div[@class='select type-variations']/div[1]/div[@class='selectric']//span[@class='selectric-option-text']";
	public static final String Dropbox_color_black ="/html/body/div[@role='dialog']/div[@class='featherlight-close-layer']//div[@class='featherlight-content-wrap']//section//div[@class='buy-options']/table[@class='product__params']/tbody/tr[1]/td/div[@class='product__params-selection']/div[@class='field__field']/div[@class='select type-variations']/div[1]/div[@class='selectric-items']/div/ul/li[2]//span[@class='selectric-option-text']";
	public static final String Dropbox_length ="/html/body/div[@role='dialog']/div[@class='featherlight-close-layer']/div[@class='featherlight-content quick-view']/div[@class='featherlight-content-wrap']/div/section//div[@class='buy-options']/table[@class='product__params']/tbody/tr[2]/td/div[@class='product__params-selection']/div[@class='field__field']/div[@class='select type-variations']/div[1]/div[@class='selectric']//span[@class='selectric-option-text']";
	public static final String Dropbox_length_1m = "/html/body/div[@role='dialog']/div[@class='featherlight-close-layer']//div[@class='featherlight-content-wrap']//section//div[@class='buy-options']/table[@class='product__params']/tbody/tr[2]/td/div[@class='product__params-selection']/div[@class='field__field']/div[@class='select type-variations']/div[1]/div[@class='selectric-items']/div/ul/li[4]//span[@class='selectric-option-text']";
	public static final String Checkout_button = "/html/body/div[@role='dialog']/div[@class='featherlight-close-layer']/div[@class='featherlight-content quick-view']/div[@class='featherlight-content-wrap']//section//div[@class='product__buy']/div[@class='product__buy-buttons']/div[@class='product__buy-buttons-buy-now']/a[2]//span[@class='button__inner']";
	public static final String Buy_button = "/html//form[@id='paymentBalanceForm']//button[@type='submit']";
	public static final String BackToMain_button = "/html//div[@id='wrapper']/div[@class='pay']/div[@class='pay__main']/div[2]//div[@class='pay__step-success']/div[1]/div[@class='pay__step-success-finish']/a[@href='https://www.zipy.co.il/']";
	public static final String Thanks_box = "/html//div[@id='wrapper']/div[@class='pay']/div[@class='pay__main']/div[2]//div[@class='pay__step-success']/div[1]/p[1]";

////////////
	
	//heb strings
	public static final String ThanksForBuying_heb = "תודה על ההזמנה";
	public static final String SignedIn_ezorIshi = "אזור אישי";

	
	

}
