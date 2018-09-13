package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.LoggerUtil;
import listeners.ShotListener;
import pages.chanpin.CPGLPage;
import pages.chanpin.CPSJSHPage;
import pages.chanpin.JGFASHPage;
import pages.chanpin.XZJGFAPage;
import pages.crmrk.CrmHomePage;
import pages.crmrk.CrmLoginPage;

public class ProductTest{
	
	CrmLoginPage loginPage = null;
	CrmHomePage homePage = null;
	CPGLPage cpglPage=null;
	CPSJSHPage cpsjshPage=null;
	XZJGFAPage xzjgfaPage=null;
	JGFASHPage jgfashPage=null;
	
	@BeforeClass
	public void init() throws InterruptedException {
		
		loginPage=new CrmLoginPage();
		ShotListener.driver = loginPage.driver;
		homePage = new CrmHomePage();
		cpglPage = new CPGLPage();
		cpsjshPage=new CPSJSHPage();
		xzjgfaPage=new XZJGFAPage();
		jgfashPage=new JGFASHPage();
		//登入系统
		loginPage.login();
	}
	@Test(description="CRM团购新增产品脚本",priority=1,enabled=true)
	public void testAddProduct() throws InterruptedException {
		LoggerUtil.info("CRM团购新增产品脚本开始");
		homePage.toCPGL();
		homePage.toSubCPGL();
		cpglPage.selectOptions();
		cpglPage.addProduct();
	}
	@Test(description="CRM团购修改产品脚本",priority=2)
	public void testUpdateProduct() throws InterruptedException {
		LoggerUtil.info("CRM团购修改产品脚本开始");
		homePage.toCPGL();
		homePage.toSubCPGL();
		cpglPage.selectOptions();
		cpglPage.updateProduct();
	}
	@Test(description="CRM团购删除产品脚本",priority=3)
	public void testDelectProduct() throws InterruptedException {
		LoggerUtil.info("CRM团购删除产品脚本开始");
		homePage.toCPGL();
		homePage.toSubCPGL();
		cpglPage.selectOptions();
		cpglPage.deleteProduct();
	}
	@Test(description="CRM团购新增并申请上架产品脚本",priority=4,enabled=true)
	public void testAddAndShelvesProduct() throws InterruptedException {
		LoggerUtil.info("CRM团购新增并上架产品脚本开始");
		homePage.toCPGL();
		homePage.toSubCPGL();
		cpglPage.selectOptions();
		cpglPage.addAndShelvesProduct();
		
		
	}
	@Test(description="CRM团购审核上架产品脚本",priority=5,enabled=true)
	public void testAuditShelvesProduct() throws InterruptedException {
		LoggerUtil.info("CRM团购审核上架产品脚本开始");
		homePage.toProductShelfAudit();
		cpsjshPage.selectOptions();
		cpsjshPage.auditProduct();
		
	}
	@Test(description="CRM新增并申请审核价格方案产品脚本",priority=6,enabled=true)
	public void testAddPriceProgram() throws InterruptedException {
		LoggerUtil.info("CRM新增并申请审核价格方案产品脚本开始");
		homePage.toChoosePriceProgram();
		xzjgfaPage.selectOptions();
		xzjgfaPage.addAndAuditPriceProgram();
	}
	@Test(description="CRM审核价格方案产品脚本",priority=7,enabled=true)
	public void testAuditPriceProgram() throws InterruptedException {
		LoggerUtil.info("CRM审核价格方案产品脚本开始...");
		homePage.toPriceProgramAudit();
		jgfashPage.selectOptions();
		jgfashPage.auditPriceProgram();
	}
	@Test(description="CRM生效价格方案脚本",priority=8,enabled=true)
	public void testEffectPriceProgram() throws InterruptedException {
		LoggerUtil.info("CRM生效价格方案脚本开始...");
		homePage.toCPGL();
		homePage.toChoosePriceProgram();
		xzjgfaPage.selectOptions();
		xzjgfaPage.effectPriceProgram();
		
	}
	@AfterClass
	public void destory() {
		//loginPage.quit();
	}
}
