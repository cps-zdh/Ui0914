package pages.tuangou;

import java.util.List;

import org.openqa.selenium.WebElement;

import common.AssertUtil;
import common.LoggerUtil;
import pages.BasePage;

/**
 * 
 * @description 团购主页
 * @author fs
 * @2018年8月16日
 *
 */
public class TGHomePage extends BasePage{
	/**
	 * 数据准备
	 */
	private String len_input = "200";
	private String wid_input = "199";
	private String num_input = "90";
	
	/*
	 * 个人中心-再下一单过程
	 */
	private String zbtg_btn = "/html/body/div[1]/div[1]/div/div[1]/div[2]/ul/li[2]/a";
	private String personal = "/html/body/div[1]/div[1]/div/div[2]/div[2]/div[2]/div[1]/span[2]";
	private String zbtg_dd = "/html/body/div[2]/div/div[1]/ul/li[1]/ul/li[1]/a";
	private String dd_again = "/html/body/div[2]/div[5]/div[1]/div/div[2]/ul[2]/li[6]/a[2]";
	private String dd_all = "/html/body/div[2]/div[1]/ul/li[1]/a";
	
	private String check_did = "/html/body/div[2]/div[5]/div[1]/div/div[1]/p[1]/span[2]";
	
	/**
	 * 选择商品-下单过程
	 */
	private String zbtg_choice = "/html/body/div[1]/div[1]/div/div[1]/div[2]/ul/li[2]";
	private String change_city = "/html/body/div[2]/div[1]/span[2]";
	private String wz_city = "//*[@id=\"groupContent\"]/div[1]/span[12]";
	private String EBC_btn = "//*[@id=\"groupContent\"]/div[3]/ul/li[8]/a";
	private String productName = "//*[@id=\"akaroaAll\"]/div[1]/div[2]/div[2]/p";
	private String buy_btn = "//*[@id=\"akaroaAll\"]/div[1]/div[2]/div[4]/button";
	/**
	 * 详情页的商品名称
	 */
	private String xq_proname = "/html/body/div[2]/div[1]/div[2]/div[2]";
	private String xd_btn = "/html/body/div[2]/div[1]/div[2]/div[6]/a";
	private String length = "body > div.box > div.content > div.box-size > div.no-line-size.hide > input.input-total-l";
	private String width = "body > div.box > div.content > div.box-size > div.no-line-size.hide > input.input-total-w";
	private String num = "/html/body/div[2]/div[1]/div[5]/div/div[1]/input";
	/**
	 * 立即购买
	 */
	private String ljgm_btn = "/html/body/div[2]/div[4]/a[2]";
	
	/**
	 * 抢购,断言产品详情页
	 */
	private String tj_btn = "//*[@id=\"submidOrder\"]";
	private String qrfk_btn = "//*[@id=\"paymentBtn\"]";
	/**
	 * 支付
	 */
	private String ddbh = "//*[@id=\"orderId\"]";
	/**
	 * 订单详情
	 */
	private String ddxq_btn = "//*[@id=\"successful\"]/div[4]/a[1]";
	private String ddxq_ddbh = "/html/body/div[2]/div[5]/div[1]/div/div[1]/p[1]/span[2]";
	
	
	
	
	/**
	 * 订单页面
	 */
	private String pro_name = "/html/body/div[2]/h2/span";
	private String buy = "/html/body/div[2]/div[4]/a[2]";
	private String submit_dd = "//*[@id=\"submidOrder\"]";
	/**
	 * 支付订单
	 */
	private String pay_title = "//*[@id=\"pay\"]/div[1]/div[1]/p";
	private String fin_qr = "//*[@id=\"paymentBtn\"]";
	private String payPwd1 = "//*[@id=\"paymentPassword\"]/div[1]/div[1]/input";
	private String payPwd2 = "//*[@id=\"paymentPassword\"]/div[1]/div[2]/input";
	private String payPwd3 = "//*[@id=\"paymentPassword\"]/div[1]/div[3]/input";
	private String payPwd4 = "//*[@id=\"paymentPassword\"]/div[1]/div[4]/input";
	private String payPwd5 = "//*[@id=\"paymentPassword\"]/div[1]/div[5]/input";
	private String payPwd6 = "//*[@id=\"paymentPassword\"]/div[1]/div[6]/input";
	private String[] pwd_inputs = {payPwd1,payPwd2,payPwd3,payPwd4,payPwd5,payPwd6};
	private String pay_submit = "//*[@id=\"paymentPassword\"]/div[3]/button[2]";
	private String pay_success = "//*[@id=\"successful\"]/p";
	
	
	/**
	   * 积分商城下单
	   */
	  private String paypwd1 = "//*[@id=\"layui-layer2\"]/div[2]/div/div[1]/div[1]/input";
	  private String paypwd2 = "//*[@id=\"layui-layer2\"]/div[2]/div/div[1]/div[2]/input";
	  private String paypwd3 = "//*[@id=\"layui-layer2\"]/div[2]/div/div[1]/div[3]/input";
	  private String paypwd4 = "//*[@id=\"layui-layer2\"]/div[2]/div/div[1]/div[4]/input";
	  private String paypwd5 = "//*[@id=\"layui-layer2\"]/div[2]/div/div[1]/div[5]/input";
	  private String paypwd6 = "//*[@id=\"layui-layer2\"]/div[2]/div/div[1]/div[6]/input";
	  private String[] pwdInputs = {paypwd1,paypwd2,paypwd3,paypwd4,paypwd5,paypwd6};
	  private String quedingButton="//*[@id=\"layui-layer2\"]/div[2]/div/div[3]/input[2]";
	  private String orderMsg="//*[@id=\"payment-success-layer\"]/p";
	
	  /**
	   * 积分商城菜单
	   */
	  private String jfscMenu="/html/body/div[1]/div[1]/div/div[1]/div[2]/ul/li[3]/a";
	  private String allProduct="/html/body/div[2]/div[3]/a[1]";
	  private String firstProduct="//*[@id=\"list-con\"]/li[1]/div/a/img";
	  private String bugNowButton="/html/body/div[5]/div[2]/div[3]/input[1]";
	  private String payButton="//*[@id=\"pay-btn\"]";
	
	/**
	 * 用户名密码等，后期从外部读入
	 */
	private String[] payPwd = {"1","2","1","2","1","2"};
	/**
	 * 积分商城左侧列表
	 */
	private String zxjs="/html/body/div[3]/div[1]/div[2]/div/div[1]/h3/a";
	private String bzfl="/html/body/div[3]/div[1]/div[2]/div/div[2]/h3/a";
	private String fl="/html/body/div[3]/div[1]/div[2]/div/div[3]/h3/a";
	private String shhl="/html/body/div[3]/div[1]/div[2]/div/div[4]/h3/a";
	private String scwz="/html/body/div[3]/div[1]/div[2]/div/div[5]/h3/a";
	private String czkj="/html/body/div[3]/div[1]/div[2]/div/div[6]/h3/a";

	/**
	 * 进入纸板团购，选择销售地区及产品
	 * @throws InterruptedException 
	 */
	public void toZBTG() throws InterruptedException {
		driver.navigate().refresh();
		click(getZbtg_btn());
		LoggerUtil.info("点击纸板团购");
		containUrl("/grouponHome.html");
		LoggerUtil.info("进入纸板团购产品选购页面");
		click(getChange_city());
		click(getWz_city());
		LoggerUtil.info("选择销售区域为-温州");
		sleep(2000);
		click(getEBC_btn());
		sleep(8000);
		LoggerUtil.info("进入EBC瓦销售产品选择菜单");
		
		
	}
	
	/**
	 * 纸板团购下单
	 * @throws InterruptedException 
	 */
	public void buy_ZBTG() throws InterruptedException {
		toZBTG();
		LoggerUtil.info("选择菜单列表下第一条产品-限量抢购");
		click(getBuy_btn());
		LoggerUtil.info("点击立即抢购");
		sleep(5000);
		LoggerUtil.info("确认页面是否跳转到产品详情页");
		/**
		 * 获取句柄
		 * 
		 */
		switchToCurrentWindowHandle();
		switchToCurrentWindowHandle();
		//跳转到另一个
		//checkText(getProductName(), getXq_proname().getText());
		containUrl("productDetails.html");
		LoggerUtil.info("页面成功跳转到详情页");
		click(getXd_btn());
		LoggerUtil.info("点击立即下单");
		LoggerUtil.info("确认是否到达下单页面");
		sleep(3000);
		containUrl("orderDetailsIndex.html");
		LoggerUtil.info("进入下单-订单填写页面");
		driver.switchTo().frame("view-ifr");
		sleep(2000);
		sendKeys(getLength(), len_input);
		LoggerUtil.info("输入总长："+len_input);	
		sendKeys(getWidth(), wid_input);
		LoggerUtil.info("输入总宽:"+wid_input);	
		sendKeys(getNum(), num_input);
		LoggerUtil.info("输入购买数量："+num_input);
		LoggerUtil.info("点击立即购买");
		click(getLjgm_btn());
		LoggerUtil.info("确认是否跳转到订单明细页面");
		sleep(2000);
		containUrl("submitOrder.html");
		LoggerUtil.info("进入订单明细");
		click(getTj_btn());
		LoggerUtil.info("点击提交订单");
		sleep(3000);
		LoggerUtil.info("确认是否进入支付页面");
		sleep(2000);
		containUrl("payOrder.html");
		LoggerUtil.info("进入支付页面");
		//保存id用于下方验证
		String did = getDdbh().getText();
		sleep(2000);
		click(getQrfk_btn());
		LoggerUtil.info("点击确认付款");
		LoggerUtil.info("打开支付界面");
		sleep(2000);
		sendKeys(getPwd_inputs(), payPwd);
		click(getPay_submit());
		LoggerUtil.info("输入支付密码："+pwd_inputs.toString());
		LoggerUtil.info("点击确定");
		driver.navigate().to("http://192.168.10.202/personalCenter.html#!paperboardOrder");
		LoggerUtil.info("进入订单详情页面");
		/**
		 * 切换iframe
		 */
		driver.switchTo().frame("ifram");
		sleep(2000);
		LoggerUtil.info("确认订单是否成功下单");
		checkText(getDdxq_ddbh(), "订单号："+did);
		LoggerUtil.info("团购下单成功");
	}
	
	/**
	 * 去再下一单的地方
	 * @throws InterruptedException 
	 */
	public void toDDAgain() throws InterruptedException {
		driver.navigate().refresh();
		click(getPersonal());
		checkUrl("http://192.168.10.202/personalCenter.html");
		LoggerUtil.info("进入我的中心页面");
		click(getZbtg_dd());
		checkUrl("http://192.168.10.202/personalCenter.html#!paperboardOrder");
		LoggerUtil.info("进入纸板团购订单页面");
		sleep(2000);
		//click(getDd_all());
		LoggerUtil.info("进入纸板团购全部订单页面");
	}
	
	/**
	 * 在下一单
	 * @throws InterruptedException 
	 */
	public void dd_again() throws InterruptedException {
		sleep(2000);
		//切换frame
		driver.switchTo().frame("ifram");
		click(getDd_again());
		sleep(2000);
		//driver.switchTo().defaultContent();
		sleep(2000);
		LoggerUtil.info("进入订单详情页面");
		
		driver.switchTo().frame(0);
		//checkText(getPro_name(), "方舒一日游");
		containUrl("/orderDetailsIndex.html");
		LoggerUtil.info("进入再下一单界面");
		click(getBuy());
		sleep(3000);
		containUrl("http://192.168.10.202/group/submitOrder.html?type=edit");
		LoggerUtil.info("进入确认订单信息页面");
		click(getSubmit_dd());
		sleep(5000);
		checkText(getPay_title(), "支付订单");
		LoggerUtil.info("进入订单支付页面");
		click(getFin_qr());
		LoggerUtil.info("打开支付界面");
		//保存订单编号
		String did = getElement("//*[@id=\"orderId\"]", "x").getText();
		sendKeys(getPwd_inputs(), payPwd);
		LoggerUtil.info("支付密码填写成功");
		click(getPay_submit());
		//checkText(getPay_success(), "支付成功");
		driver.get("http://192.168.10.202/personalCenter.html#!paperboardOrder");
		LoggerUtil.info("回到团购订单页面");
		driver.switchTo().frame("ifram");
		sleep(3000);
		checkText(getCheck_did(), "订单号："+did);
		LoggerUtil.info("团购再下一单成功");
	}
	
	/**
	   * 去积分商城页面
	   */
	  public void toJFSC() {
		LoggerUtil.info("访问积分商城");
		open("http://192.168.10.202/IntegralMall/index.html");
	    click(getElement(jfscMenu, "x"));
	  }
	  
	  /**
	   * 选择积分商城产品分类(全部)
	 * @throws InterruptedException 
	   */
	  public void selectClassOfAll() throws InterruptedException {
		  	LoggerUtil.info("点击标签下的全部");
		    sleep(2000);
		    click(getElement(allProduct, "x"));
	  }
	  /**
	   * 选择积分商城产品分类(纸箱集市)
	 * @throws InterruptedException 
	   */
	  public void selectClassOfZXJS() throws InterruptedException {
		  	LoggerUtil.info("点击左侧标签下的纸箱集市");
		    sleep(2000);
		    click(getElement(zxjs, "x"));
	  }
	  /**
	   * 选择积分商城产品分类(包装辅料)
	 * @throws InterruptedException 
	   */
	  public void selectClassOfBZFL() throws InterruptedException {
		  	LoggerUtil.info("点击左侧标签下的包装辅料");
		    sleep(2000);
		    click(getElement(bzfl, "x"));
	  }
	  /**
	   * 选择积分商城产品分类(辅料)
	 * @throws InterruptedException 
	   */
	  public void selectClassOfFL() throws InterruptedException {
		  	LoggerUtil.info("点击左侧标签下的辅料");
		    sleep(2000);
		    click(getElement(fl, "x"));
	  }
	  /**
	   * 选择积分商城产品分类(生活好礼)
	 * @throws InterruptedException 
	   */
	  public void selectClassOfSSHL() throws InterruptedException {
		  	LoggerUtil.info("点击左侧标签下的生活好礼");
		    sleep(2000);
		    click(getElement(shhl, "x"));
	  }
	  /**
	   * 选择积分商城产品分类(生产物资)
	 * @throws InterruptedException 
	   */
	  public void selectClassOfSCWZ() throws InterruptedException {
		  	LoggerUtil.info("点击左侧标签下的生产物资");
		    sleep(2000);
		    click(getElement(scwz, "x"));
	  }
	  /**
	   * 选择积分商城产品分类(充值卡券)
	 * @throws InterruptedException 
	   */
	  public void selectClassOfCZKJ() throws InterruptedException {
		  	LoggerUtil.info("点击左侧标签下的充值卡券");
		    sleep(2000);
		    click(getElement(czkj, "x"));
	  }
	  /**
	   * 积分商城下单
	   * @throws InterruptedException 
	   */
	  
	  public void buyOrder() throws InterruptedException {
		LoggerUtil.info("积分商城开始下单...");
	    sleep(2000);
	    LoggerUtil.info("点击第一个产品");
	    click(getElement(firstProduct, "x"));
	    sleep(2000);
	    switchToCurrentWindowHandle();
	    sleep(5000);
	    LoggerUtil.info("点击立即购买按钮");
	    click(getElement(bugNowButton, "x"));
	    sleep(3000);
	    LoggerUtil.info("点击支付按钮");
	    click(getElement(payButton, "x"));
	    sleep(2000);
	    LoggerUtil.info("输入密码");
	    sendKeys(getSortsElement(pwdInputs, "x"),payPwd );
	    LoggerUtil.info("点击确定按钮");
	    click(getElement(quedingButton, "x"));
	    sleep(10000);
	    AssertUtil.assertEquals(getElement(orderMsg, "x").getText(), "支付成功", "");
	    
	  }
	public WebElement getZbtg_btn() {
		return getElement(zbtg_btn, "x");
	}
	public WebElement getPersonal() {
		return getElement(personal, "x");
	}
	public WebElement getZbtg_dd() {
		return getElement(zbtg_dd, "x");
	}
	public WebElement getDd_again() {
		return getElement(dd_again, "x");
	}
	public WebElement getDd_all() {
		return getElement(dd_all, "x");
	}

	
	/**
	 * 订单相关
	 */
	
	
	public WebElement getPro_name() {
		return getElement(pro_name, "x");
	}

	public WebElement getBuy() {
		return getElement(buy, "x");
	}

	public WebElement getSubmit_dd() {
		return getElement(submit_dd, "x");
	}

	public WebElement getPay_title() {
		return getElement(pay_title, "x");
	}

	public WebElement getFin_qr() {
		return getElement(fin_qr, "x");
	}

	public List<WebElement> getPwd_inputs() {
		return getSortsElement(pwd_inputs, "x");
	}

	public WebElement getPay_submit() {
		return getElement(pay_submit, "x");
	}

	public WebElement getPay_success() {
		return getElement(pay_success, "x");
	}

	public WebElement getCheck_did() {
		return getElement(check_did, "x");
	}

	public WebElement getZbtg_choice() {
		return getElement(zbtg_choice, "x");
	}

	
	public WebElement getChange_city() {
		return getElement(change_city, "x");
	}

	

	public WebElement getWz_city() {
		return getElement(wz_city, "x");
	}

	
	public WebElement getEBC_btn() {
		return getElement(EBC_btn, "x");
	}


	public WebElement getProductName() {
		return getElement(productName, "x");
	}

	

	public WebElement getBuy_btn() {
		return getElement(buy_btn, "x");
	}

	

	public WebElement getXq_proname() {
		return getElement(xq_proname, "x");
	}

	public WebElement getXd_btn() {
		return getElement(xd_btn, "x");
	}

	
	public WebElement getLength() {
		return getElement(length, "css");
	}

	

	public WebElement getWidth() {
		return getElement(width, "css");
	}



	public WebElement getNum() {
		return getElement(num, "x");
	}

	

	public WebElement getDdbh() {
		return getElement(ddbh, "x");
	}


	public WebElement getDdxq_btn() {
		return getElement(ddxq_btn, "x");
	}

	
	public WebElement getDdxq_ddbh() {
		return getElement(ddxq_ddbh, "x");
	}

	public WebElement getLjgm_btn() {
		return getElement(ljgm_btn, "x");
	}

	

	public WebElement getTj_btn() {
		return getElement(tj_btn, "x");
	}



	public WebElement getQrfk_btn() {
		return getElement(qrfk_btn, "x");
	}

	
}

	
	



	

	


