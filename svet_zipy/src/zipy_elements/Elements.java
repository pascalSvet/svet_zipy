package zipy_elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elements {

////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	// login and sign-up Elements:
	public static final String Zipy_il = "https://www.zipy.co.il/";	
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

	public static final String Password_short = "123";
	public static final String Password_moreThan100signs = "12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901";
	public static final String Password_empty = "  ";


	
////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//buying - Elements:
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
	
	public static final String Product_addToCart = "/html//div[@id='wrapper']/div[@class='product__page']//section/div[@class='product__body']//div[@class='product__buy-buttons']/a/span[@class='button__inner']";	
	public static final String Product_addedToCart = "/html//div[@id='wrapper']/div[3]//section/div[@class='product__body']/div[@class='product__main']//div[@class='product__buy-buttons-buy-now']/a[2]";
	public static final String Product_openCart = "/html//div[@id='topbar']//span[@class='ico ico--cart']";
	public static final String Product_closeCart = "/html//div[@id='topbar']//span[@class='ico ico--cart']";
	public static final String Product_cartFrame = "/html/body/div[1]/div[3]/div/div[2]";
	public static final String Product_cartRemove = "/html/body/div[1]/div[3]/div/div[2]//div[@class='user-goods-list']/div[1]/div[1]//span[@class='ico']";
	public static final String Product_cartRemove2 = "/html/body/div[1]/div[3]/div/div[2]//div[@class='user-goods-list']/div[1]/div[2]//span[@class='ico']";
	public static final String Product_cartRemove3 = "/html/body/div[1]/div[3]/div/div[2]//div[@class='user-goods-list']/div[1]/div[3]//span[@class='ico']";
	public static final String Product_cart_moveToFavorites = "/html/body/div[1]/div[3]/div/div[2]//div[@class='user-goods-list']/div[1]/div[1]//span[@class='ico ico--pin']";	
	public static final String Product_cart_returnToCart = "/html/body/div[1]/div[3]/div/div[2]//div[@class='user-goods-list']/div[1]/div[1]//div[@class='restore']/a";	
	public static final String Product_cartPay = "/html/body/div[1]/div[3]/div/div[2]//a[@href='/payment/']";
	public static final String Product_cartIsEmpty = "/html/body/div[1]/div[3]/div/div[2]//strong[.='הסל שלך ריק.']";
	public static final String Product_cart_finalSum = "/html/body/div[1]/div[3]/div/div[2]//span[@class='sum__price']";
	public static final String Product_cart_oldPrice = "/html/body/div[1]/div[3]/div/div[2]//div[@class='user-goods-list']/div[1]/div[2]//span[@class='price__old']";
	public static final String Product_cart_newPrice = "/html/body/div[1]/div[3]/div/div[2]//div[@class='user-goods-list']/div[1]/div[1]//span[@class='price__current']";
	
	public static final String Product_favoritesButton = "/html//div[@id='topbar']/div[@class='default']/div[5]/span[1]";
	public static final String Product_favoritesFrame = "/html/body/div[1]/div[3]/div/div[1]//div[@class='user-goods-list']/div/div[1]//div[@class='text']";
	public static final String Product_favoritesRemove = "/html/body/div[1]/div[3]/div/div[1]//div[@class='user-goods-list']/div/div[1]//span[@class='ico']";
	public static final String Product_closeFavorites = "/html//div[@id='topbar']/div[@class='default']/div[5]/span[1]/strong[@class='topbar__items-link-count']";
	public static final String Product_openFavorites = "/html//div[@id='topbar']/div[@class='default']/div[5]/span[1]/strong[@class='topbar__items-link-count']";
	public static final String Product_favoritesTitle = "/html/body/div[1]/div[3]/div/div[1]//ul[@class='user-goods-list-heading']/li[@class='title']";
	
	public static final String Product_variationsColor ="/html//div[@id='wrapper']/div[@class='product__page']//section/div[@class='product__body']/div[@class='product__main']/div[@class='sell-wrap']/div[@class='buy-options']/table[@class='product__params']//div[@class='selectric']//span[@class='selectric-option-text']";
	public static final String Product_variationsColorAgain = "/html//div[@id='wrapper']/div[3]//section/div[@class='product__body']/div[@class='product__main']/div[@class='sell-wrap']/div[@class='buy-options']/table[@class='product__params']//div[@class='selectric']//span[@class='selectric-option-text']";
	public static final String Product_variationsColor_1 = "/html//div[@id='wrapper']/div[@class='product__page']//section//div[@class='buy-options']/table[@class='product__params']//div[@class='select type-variations']/div[1]/div[@class='selectric-items']/div/ul/li[2]/span[@class='selectric-option']";
	public static final String Product_variationsColor_2 = "/html//div[@id='wrapper']//section//div[@class='buy-options']/table[@class='product__params']/tbody/tr[1]/td//div[@class='select type-variations']/div[1]/div[@class='selectric-items']/div/ul/li[3]/span[@class='selectric-option']";
	public static final String Product_variationsColor_3 = "/html//div[@id='wrapper']/div[3]//section//div[@class='buy-options']/table[@class='product__params']/tbody/tr[1]/td//div[@class='select type-variations']/div[1]/div[@class='selectric-items']/div/ul/li[4]//span[@class='selectric-option-text']";
	public static final String Product_variationsLength ="/html//div[@id='wrapper']/div[@class='product__page']//section/div[@class='product__body']/div[@class='product__main']/div[@class='sell-wrap']//table[@class='product__params']//div[@class='product__params-selection']/div[@class='field__field']/div[@class='select type-variations']/div[1]/div[@class='selectric']//span[@class='selectric-option-text']";
	public static final String Product_variationsLengthAgain ="/html//div[@id='wrapper']/div[3]//section/div[@class='product__body']/div[@class='product__main']//div[@class='buy-options']/table[@class='product__params']//div[@class='product__params-selection']/div[@class='field__field']/div[@class='select type-variations']/div[1]/div[@class='selectric']/span[@class='ico ico--arrow-triangle-down']";
	public static final String Product_variationsLength_1 = "/html//div[@id='wrapper']/div[@class='product__page']//section/div[@class='product__body']//div[@class='buy-options']/table[@class='product__params']/tbody/tr[2]/td/div[@class='product__params-selection']/div[@class='field__field']/div[@class='select type-variations']/div[1]/div[@class='selectric-items']/div/ul/li[2]//span[@class='selectric-option-text']";
	public static final String Product_variationsLength_2 = "/html//div[@id='wrapper']/div[3]//section//div[@class='buy-options']/table[@class='product__params']//div[@class='product__params-selection']/div[@class='field__field']/div[@class='select type-variations']/div[1]/div[@class='selectric-items']/div/ul/li[3]/span[@class='selectric-option']";
	public static final String Product_plusOne = "/html//div[@id='wrapper']/div[3]//section/div[@class='product__body']//div[@class='product__buy-buttons-buy-now']/a[1]/span[@class='button-buy-amount-text']";
	public static final String Product_quantityPlus = "/html//div[@id='wrapper']/div[@class='product__page']//section/div[@class='product__body']/div[@class='product__main']//div[@class='buy-options']/table[@class='product__params']//button[.='+']";
	public static final String Product_quantityPlusAgain = "/html//div[@id='wrapper']/div[3]//section/div[@class='product__body']/div[@class='product__main']//div[@class='buy-options']/table[@class='product__params']//button[.='+']";
	public static final String Product_quantity = "/html/body/div[1]/div[3]/div/div[2]//div[@class='user-goods-list']/div[1]/div[1]//input";
	public static final String Product_titleFromPicture = "//img[@class='product__specs-image']";
	public static final String Product_heron = "//div[@id='wrapper']//main[@role='main']/section[@class='notfound']//div[@class='notfound__text-title']";
	public static final String Product_price = "/html//div[@id='wrapper']/div[@class='product__page']//section/div[@class='product__body']//div[@class='product__table-wrapper']/table[@class='product__params']//td[@class='product__params-sale']/span/span[@class='value']";
	public static final String Product_discount = "/html//div[@id='wrapper']/div[3]//section/div[@class='product__body']//div[@class='product__table-wrapper']/table[@class='product__params']/thead/tr[2]/td[@class='product__params-sale']/span/span[@class='value']";
	public static final String Product_delivery = "/html//div[@id='wrapper']/div[@class='product__page']//section/div[@class='product__body']//div[@class='product__table-wrapper']/table[@class='product__params']//span[@class='shipping-price']/span[@class='value']";

	public static final String Product_noVariations = "https://www.zipy.co.il/p/%D7%90%D7%9C%D7%99%D7%90%D7%A7%D7%A1%D7%A4%D7%A8%D7%A1/computer-gaming-pc-desktop-onebot-ssd-intel-4gb-ddr4-celeron-ak22-3865u-all-in-one-16-9/32843889521/";
	public static final String Product_noVariations2 = "https://www.zipy.co.il/p/%D7%90%D7%9C%D7%99%D7%90%D7%A7%D7%A1%D7%A4%D7%A8%D7%A1/onebot-g32-31-5-inch-curved-led-gaming-monitor-144hz-1920-1080p-dvi-hd-ports-displayport-1800r-immersive-curvature/32887298148/";
	public static final String Product_noVariationsAmazon = "https://www.zipy.co.il/p/amazon/sidetrak-portable-usb-monitor-12-5-screen-attaches-to-your-laptop-for-easy-travel-efficient-usb-power-compatible-with-mac-pc-chromebook-13-17-laptops-hd-ips-display-patent-pending/B07RJYQN9K/";
	public static final String Product_oneVariation = "https://www.zipy.co.il/p/%D7%90%D7%9C%D7%99%D7%90%D7%A7%D7%A1%D7%A4%D7%A8%D7%A1/A/32958346076";
	public static final String Product_twoVariations = "https://www.zipy.co.il/p/%D7%90%D7%9C%D7%99%D7%90%D7%A7%D7%A1%D7%A4%D7%A8%D7%A1/rez-micro-usb-cable-usb-charging-cord-mobile-phone-nylon-xiaomi-android-samsung-for-hua-wei/32995752928/";
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//heb strings
	public static final String ThanksForBuying_heb = "תודה על ההזמנה";
	public static final String SignedIn_ezorIshi = "אזור אישי";

	
	

}
