package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.LoggerUtil;
import listeners.ShotListener;
import pages.tuangou.TGHomePage;
import pages.tuangou.TGLoginPage;

/**
 * 
 * @description 团购平台测试脚本：用于接口测试订单管理有关订单操作的数据准备
 * @author fs
 * @2018年8月16日
 *
 */
public class TGTest extends BaseTest{
	private TGLoginPage tgLoginPage = new TGLoginPage();
	private TGHomePage tgHomePage = new TGHomePage();
	
	
	@BeforeClass
	public void init() {
		ShotListener.driver = tgLoginPage.driver;
		try {
			tgLoginPage.tgLogin();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	@Test(description="纸板团购EBC商品下单",priority=0)
	public void zbtg_xiadan() {
		try {
			tgHomePage.buy_ZBTG();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test(description="团购下单-将上个ui新增的订单再下一单",invocationCount=2,priority=1)
	public void tuangou_xiadan() {
		begin();
		LoggerUtil.info("团购再下一单脚本开始");
		try {
			tgHomePage.toDDAgain();
			tgHomePage.dd_again();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}end();
	}
	
	
	@AfterClass
	public void destory() {
		tgHomePage.quit();
	}

}
