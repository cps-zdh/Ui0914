package common;

import org.testng.Assert;

import exceptions.AssertZDYError;
import listeners.ShotListener;

/**
 * 
 * @description 断言方法
 * @author fs
 * @2018年8月14日
 *
 */
public class AssertUtil {
	
	/**
	 * 验证为真assertEquals
	 * @param assertObj
	 * @param expect
	 * @param format
	 */
	public static void assertEquals(Object assertObj,Object expect,String format) {
		LoggerUtil.info(String.format("断言验证：验证页面元素实际值：%s与期望值：%s相同", assertObj.toString(),expect.toString()));
		Assert.assertEquals(assertObj, expect, format);
	}
	
	public static void assertNotEquals(Object assertObj,Object expect,String format) {
		LoggerUtil.info(String.format("断言验证：验证页面元素实际值：%s与期望值：%s相同", assertObj.toString(),expect.toString()));
		Assert.assertNotEquals(assertObj, expect, format);
	}
	
	
	/**
	 * 包含断言
	 * @param assertObj
	 * @param expect
	 */
	public static void assertContains(Object assertObj,Object expect) {
		LoggerUtil.info(String.format("断言验证：验证页面元素实际值：%s是否包含期望值：%s", assertObj,expect));
		if(!((String)assertObj).contains(expect.toString().trim())) {
			throw new AssertionError();
		}
	}

}
