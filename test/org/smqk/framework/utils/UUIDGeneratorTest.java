package org.smqk.framework.utils;

import org.junit.Test;

/**
 * UUIDGeneratorTest  
 * @author 编程改变世界
 * @time 2014-11-23 下午3:35:11
 */
public class UUIDGeneratorTest {
	
	@Test
	public void generateUUidTest(){
		String uuid=UUIDGenerator.generateUUid();
		int length=uuid.length();
		System.out.println("UUID:"+uuid+" ,length:"+length);
	}
	
	@Test
	public void listUUid(){
		for (int i = 0; i < 10; i++) {
			System.out.println(UUIDGenerator.generateUUid());
		}
	}
}
