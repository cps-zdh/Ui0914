package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import listeners.ShotListener;
import pages.crmrk.CrmLoginPage;
import pages.jfsc.JFSCProPage;

/**
 * crm-积分商城测试类-新增积分商品
 * @author fs
 * @date 2018年9月13日
 * @description
 */
public class CrmJFSCTest {
	
	CrmLoginPage loginPage=null;
	JFSCProPage jfscProPage = null;
	@BeforeClass
	public void init() throws InterruptedException {
		loginPage = new CrmLoginPage();
		jfscProPage = new JFSCProPage();
		ShotListener.driver = loginPage.driver;
		loginPage.login();
	}
	
	@Test(description="积分商城添加上架产品",priority=0)
	public void jfsc_addPro() {
		try {
			jfscProPage.add_jfscPro();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
