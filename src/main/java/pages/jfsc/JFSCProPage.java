package pages.jfsc;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import common.LoggerUtil;
import pages.crmrk.CrmHomePage;

/**
 * 积分商城-添加商品Page
 * @author fs
 * @date 2018年9月13日
 * @description
 */
public class JFSCProPage extends CrmHomePage{
	/**
	 * 数据准备
	 */
	private String cx = "1.08";
	private String dy = "1.08";
	private String yj1 = "1.58";
	private String pname = "自动化-fs-积分商城";
	
	private String add_btn = "//*[@id=\"commodity_all\"]/div[2]/div[1]/button[1]";
	private String add_qr_btn = "/html/body/div[2]/div/div[3]/button[2]";
	
	/**
	 * 分类
	 */
	private String choose_input = "//*[@id=\"classification\"]/span[3]/span";
	private String choose1 = "/html/body/div[3]/ul/li[1]";
	private String choose2 = "/html/body/div[3]/ul[2]/li[1]";
	private String choose3 = "/html/body/div[3]/ul[3]/li[1]";
	
	private String proname = "//*[@id=\"commodity_add\"]/div[2]/div[1]/form/div[1]/div/div/input";
	/**
	 * 发货类型默认第一个
	 */
	private String fh_type1 = "";
	
	/**
	 * 销售信息
	 */
	private String cx_price = "//*[@id=\"quotes\"]/table/tr[2]/td[1]/div/input";
	private String dy_price = "//*[@id=\"quotes\"]/table/tr[2]/td[2]/div/input";
	private String yj = "//*[@id=\"quotes\"]/table/tr[2]/td[3]/div/input";
	
	/**
	 * 图片
	 */
	private String zt_input = "//*[@id=\"commodity_add\"]/div[2]/div[1]/form/div[7]/div[1]/div/div[1]/div/input";
	private String xqt_input = "//*[@id=\"commodity_add\"]/div[2]/div[1]/form/div[7]/div[2]/div/div[1]/div/input";
	/**
	 * 保存并上交
	 */
	private String bc_btn = "//*[@id=\"commodity_add\"]/div[2]/div[2]/button[3]";
	
	/**
	 * 列表:商品名称
	 */
	private String spmc = "//*[@id=\"commodity_all\"]/div[2]/div[2]/div/div[3]/table/tbody/tr[1]/td[4]/div";

	
	/**
	 * 新增积分商城商品
	 * @throws InterruptedException 
	 */
	public void add_jfscPro() throws InterruptedException {
		toJFSC();
		click(getAdd_btn());
		LoggerUtil.info("点击新增");
		click(getAdd_qr_btn());
		LoggerUtil.info("点击确认新增");
		LoggerUtil.info("验证是否跳转到新增页面");
		containUrl("/commodity_add");
		LoggerUtil.info("进入新增页面");
		sleep(3000);
		click(getChoose_input());
		sleep(1000);
		click(getChoose1());
		sleep(1000);
		click(getChoose2());
		sleep(1000);
		click(getChoose3());
		LoggerUtil.info("选择三级分类");
		sendKeys(getProname(), pname);
		LoggerUtil.info("输入商品名称");
		LoggerUtil.info("选择发货类型-仓库发货类");
		sendKeys(getCx_price(), cx);
		sleep(1000);
		LoggerUtil.info("输入促销价格:"+cx);
		sleep(2000);
		//sendKeys(getDy_price(), dy);
		click(getDy_price());
		LoggerUtil.info("输入积分最高抵用金额："+dy);
		sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		sleep(5000);
		js.executeScript("document.getElementsByClassName(\"el-upload__input\")[0].style.display=\"block\"");
		js.executeScript("document.getElementsByClassName(\"el-upload__input\")[1].style.display=\"block\"");
		
		LoggerUtil.info("显示图片输入框");
		sendKeys(getYj(), yj1);
		LoggerUtil.info("输入原价："+yj1);
		addPicOrFile("image/mainpic.jpg", getZt_input());
		sleep(7000);
		LoggerUtil.info("上传主图图片");
		addPicOrFile("image/xq.png", getXqt_input());
		sleep(6000);
		LoggerUtil.info("上传商品详情页");
		click(getBc_btn());
		LoggerUtil.info("点击保存");
		sleep(2000);
		LoggerUtil.info("跳转回全部商品页面");
		LoggerUtil.info("验证商品是否添加成功");
		checkText(getSpmc(), pname);
		LoggerUtil.info("积分商城产品添加成功");
	}
	
	
	public WebElement getAdd_btn() {
		return getElement(add_btn, "x");
	}

	public WebElement getAdd_qr_btn() {
		return getElement(add_qr_btn, "x");
	}

	public WebElement getChoose_input() {
		return getElement(choose_input, "x");
	}

	public WebElement getChoose1() {
		return getElement(choose1, "x");
	}

	public WebElement getChoose2() {
		return getElement(choose2, "x");
	}

	public WebElement getChoose3() {
		return getElement(choose3, "x");
	}

	public WebElement getProname() {
		return getElement(proname, "x");
	}

	public WebElement getFh_type1() {
		return getElement(fh_type1, "x");
	}

	public WebElement getCx_price() {
		return getElement(cx_price, "x");
	}

	public WebElement getDy_price() {
		return getElement(dy_price, "x");
	}

	public WebElement getYj() {
		return getElement(yj, "x");
	}

	public WebElement getZt_input() {
		return getElement(zt_input, "x");
	}

	public WebElement getXqt_input() {
		return getElement(xqt_input, "x");
	}

	public WebElement getBc_btn() {
		return getElement(bc_btn, "x");
	}

	public WebElement getSpmc() {
		return getElement(spmc, "x");
	}

	
}
