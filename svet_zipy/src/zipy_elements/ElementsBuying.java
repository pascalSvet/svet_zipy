package zipy_elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsBuying {
	
	//buying - Elements:
	public static final String SearchItem =	"rez-micro-usb-cable-usb-charging-cord-mobile-phone-nylon-xiaomi-android-samsung-for-hua-wei";
	public static final String SearchItem_thumb ="//div[@data-id='32995752928'][@data-position='1']";
	public static final String SearchItem_link ="https://www.zipy.co.il/p/%D7%90%D7%9C%D7%99%D7%90%D7%A7%D7%A1%D7%A4%D7%A8%D7%A1/rez-micro-usb-cable-usb-charging-cord-mobile-phone-nylon-xiaomi-android-samsung-hua-wei/32995752928/";
	public static final String ProductFramed_color ="/html/body/div[@role='dialog']/div[@class='featherlight-close-layer']/div[@class='featherlight-content quick-view']/div[@class='featherlight-content-wrap']/div/section//div[@class='buy-options']/table[@class='product__params']/tbody/tr[1]/td/div[@class='product__params-selection']/div[@class='field__field']/div[@class='select type-variations']/div[1]/div[@class='selectric']//span[@class='selectric-option-text']";
	public static final String ProductFramed_color_1 ="/html/body/div[@role='dialog']/div[@class='featherlight-close-layer']//div[@class='featherlight-content-wrap']//section//div[@class='buy-options']/table[@class='product__params']/tbody/tr[1]/td/div[@class='product__params-selection']/div[@class='field__field']/div[@class='select type-variations']/div[1]/div[@class='selectric-items']/div/ul/li[2]//span[@class='selectric-option-text']";
	public static final String ProductFramed_length ="/html/body/div[@role='dialog']/div[@class='featherlight-close-layer']/div[@class='featherlight-content quick-view']/div[@class='featherlight-content-wrap']/div/section//div[@class='buy-options']/table[@class='product__params']/tbody/tr[2]/td/div[@class='product__params-selection']/div[@class='field__field']/div[@class='select type-variations']/div[1]/div[@class='selectric']//span[@class='selectric-option-text']";
	public static final String ProductFramed_length_1 = "/html/body/div[@role='dialog']/div[@class='featherlight-close-layer']//div[@class='featherlight-content-wrap']//section//div[@class='buy-options']/table[@class='product__params']/tbody/tr[2]/td/div[@class='product__params-selection']/div[@class='field__field']/div[@class='select type-variations']/div[1]/div[@class='selectric-items']/div/ul/li[4]//span[@class='selectric-option-text']";
	public static final String Checkout_button = "/html/body/div[@role='dialog']/div[@class='featherlight-close-layer']/div[@class='featherlight-content quick-view']/div[@class='featherlight-content-wrap']//section//div[@class='product__buy']/div[@class='product__buy-buttons']/div[@class='product__buy-buttons-buy-now']/a[2]//span[@class='button__inner']";
	public static final String FinalBuy_button = "/html//form[@id='paymentBalanceForm']//button[@type='submit']";
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

	public static final String Product_notFound = "//div[@id='wrapper']//main[@role='main']/section[@class='notfound']//div[@class='notfound__text-title']";
			
	public static final String Product_noVariations = "https://www.zipy.co.il/p/%D7%90%D7%9C%D7%99%D7%90%D7%A7%D7%A1%D7%A4%D7%A8%D7%A1/computer-gaming-pc-desktop-onebot-ssd-intel-4gb-ddr4-celeron-ak22-3865u-all-in-one-16-9/32843889521/";
	public static final String Product_noVariations2 = "https://www.zipy.co.il/p/%D7%90%D7%9C%D7%99%D7%90%D7%A7%D7%A1%D7%A4%D7%A8%D7%A1/onebot-g32-31-5-inch-curved-led-gaming-monitor-144hz-1920-1080p-dvi-hd-ports-displayport-1800r-immersive-curvature/32887298148/";
	public static final String Product_noVariationsAmazon = "https://www.zipy.co.il/p/amazon/sidetrak-portable-usb-monitor-12-5-screen-attaches-to-your-laptop-for-easy-travel-efficient-usb-power-compatible-with-mac-pc-chromebook-13-17-laptops-hd-ips-display-patent-pending/B07RJYQN9K/";
	public static final String Product_oneVariation = "https://www.zipy.co.il/p/%D7%90%D7%9C%D7%99%D7%90%D7%A7%D7%A1%D7%A4%D7%A8%D7%A1/A/32958346076";
	public static final String Product_twoVariations = "https://www.zipy.co.il/p/%D7%90%D7%9C%D7%99%D7%90%D7%A7%D7%A1%D7%A4%D7%A8%D7%A1/rez-micro-usb-cable-usb-charging-cord-mobile-phone-nylon-xiaomi-android-samsung-for-hua-wei/32995752928/";
	public static final String lessThan5_Open ="/html/body/div[@class='wrap wrap_with_mehes']//ul[@class='stores']//a[@alt='פחות מ-5 ₪ בעברית']/span[.='פחות מ-5 ₪']";
	public static final String lessThan5_dealThumbnail1 = "//*[@id=\"wrapper\"]/div[2]/main/section[2]/div[2]/div[1]/a";


}
