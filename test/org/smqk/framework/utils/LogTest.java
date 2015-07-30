package org.smqk.framework.utils;

import org.apache.log4j.Logger;

public class LogTest {
	public static Logger log=Logger.getLogger(LogTest.class);
	
	public static void main(String[] args) {
		log.debug("测试log4j 。。。。。");
	}
}
