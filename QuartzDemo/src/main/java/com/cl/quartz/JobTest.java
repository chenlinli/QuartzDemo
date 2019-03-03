package com.cl.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JobTest {

	public void doJob(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh：mm:ss");
		System.out.println("北京时间："+sdf.format(new Date()));
	}
}
