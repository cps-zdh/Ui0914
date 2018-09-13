package pages.chanpin;

import common.LoggerUtil;
import pages.BasePage;

/**
 * 
 * @author zhangyingkai
 *	
 * 2018年9月13日,上午10:34:41
 * 
 * 产品上架审核页面
 */
public class CPSJSHPage extends BasePage{
	

	/**
	 * 省市、合作方选项
	 */
	private String proviceInput="//*[@id=\"home\"]/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div[1]/div/div[1]/input";
	private String proviceOption="/html/body/div[2]/div/div[1]/ul/li[3]";
	private String cityInput="//*[@id=\"home\"]/div[2]/div/div/div[2]/div[1]/div[1]/div/div[2]/div/div[1]/input";
	private String cityOption="/html/body/div[3]/div/div[1]/ul/li[2]";
	private String partnerInput="//*[@id=\"home\"]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div/div[1]/input";
	private String partnerOption="/html/body/div[4]/div/div[1]/ul/li[1]";
	/**
	 * 搜索按钮
	 */
	private String searchButton="//*[@id=\"home\"]/div[2]/div/div/div[2]/div[1]/button";
	/**
	 * 审核按钮
	 */
	private String auditButton="//*[@id=\"home\"]/div[2]/div/div/div[2]/div[2]/div[1]/div[4]/div[2]/table/tbody/tr[1]/td[9]/div/button/span";
	private String saveAuditButton="//*[@id=\"home\"]/div[2]/div/div/div[3]/div[1]/div/div[2]/div[2]/div[2]/button[2]";
	
	
	
	/**
	 * 选择省市合作方，并搜索
	 * @throws InterruptedException 
	 */
	public void selectOptions() throws InterruptedException {
		LoggerUtil.info("开始选择省市合作方选项");
		sleep(3000);
		click(getElement(proviceInput, "x"));
		click(getElement(proviceOption, "x"));
		click(getElement(cityInput, "x"));
		click(getElement(cityOption, "x"));
		click(getElement(partnerInput, "x"));
		click(getElement(partnerOption, "x"));
		sleep(2000);
		click(getElement(searchButton,"x"));
	}
	
	/**
	 * 审核产品上架申请
	 * @throws InterruptedException 
	 */
	public void auditProduct() throws InterruptedException {
		LoggerUtil.info("开始审核产品上架...");
		sleep(3000);
		click(getElement(auditButton,"x"));
		sleep(2000);
		click(getElement(saveAuditButton, "x"));
		LoggerUtil.info("审核通过");
	}
}
