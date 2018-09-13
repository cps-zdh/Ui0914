package test;

import org.testng.annotations.Test;

import listeners.ShotListener;
import pages.tuangou.TGHomePage;
import pages.tuangou.TGLoginPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class JFSCTest {
	
	private TGLoginPage tgLoginPage = null;
	private TGHomePage tgHomePage = null;
	@BeforeClass
	public void beforeClass() {
		tgLoginPage = new TGLoginPage();
		tgHomePage = new TGHomePage();
		ShotListener.driver = tgLoginPage.driver;
		try {
			tgLoginPage.tgLogin();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Test(description="积分商城下单(全)",priority=1)
	public void testOrder001() throws InterruptedException {
		tgHomePage.toJFSC();
		tgHomePage.selectClassOfAll();
		tgHomePage.buyOrder();
	}
	@Test(description="积分商城下单(纸箱集市)",priority=2)
	public void testOrder002() throws InterruptedException {
		tgHomePage.toJFSC();
		tgHomePage.selectClassOfZXJS();
		tgHomePage.buyOrder();
	}
	@Test(description="积分商城下单(包装辅料)",priority=3)
	public void testOrder003() throws InterruptedException {
		tgHomePage.toJFSC();
		tgHomePage.selectClassOfBZFL();
		tgHomePage.buyOrder();
	}
	@Test(description="积分商城下单(辅料)",priority=4)
	public void testOrder004() throws InterruptedException {
		tgHomePage.toJFSC();
		tgHomePage.selectClassOfFL();
		tgHomePage.buyOrder();
	}
	@Test(description="积分商城下单(生活好礼)",priority=5)
	public void testOrder005() throws InterruptedException {
		tgHomePage.toJFSC();
		tgHomePage.selectClassOfSSHL();
		tgHomePage.buyOrder();
	}
	@Test(description="积分商城下单(生产物资)",priority=6)
	public void testOrder006() throws InterruptedException {
		tgHomePage.toJFSC();
		tgHomePage.selectClassOfSCWZ();
		tgHomePage.buyOrder();
	}
	@Test(description="积分商城下单(充值卡券)",priority=7)
	public void testOrder007() throws InterruptedException {
		tgHomePage.toJFSC();
		tgHomePage.selectClassOfSCWZ();
		tgHomePage.buyOrder();
	}
	@AfterClass
	public void afterClass() {
		tgLoginPage.quit();
		
	}
	
	

}
