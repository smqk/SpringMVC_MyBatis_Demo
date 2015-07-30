package org.smqk.framework.utils;

import java.util.UUID;

/**
 * UUIDGenerator  UUID生成器
 * @author 编程改变世界
 * @time 2014-11-23 下午3:35:35
 */
public class UUIDGenerator {
	
	/**
	 * 生成uuid	
	 * @return	32位的UUID值
	 */
	public static String generateUUid(){
		StringBuilder uuid=new StringBuilder(UUID.randomUUID().toString());
		uuid.deleteCharAt(8);		uuid.deleteCharAt(12);
		uuid.deleteCharAt(16);		uuid.deleteCharAt(20);
		
		return new String(uuid);
	}
}
