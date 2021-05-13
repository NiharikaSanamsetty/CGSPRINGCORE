package com.websystique;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AppMa {
	
	public static void main(String args[]){
		AbstractApplicationContext  context = new AnnotationConfigApplicationContext(AppCon.class);
		FileService service = (FileService) context.getBean("fileService");
		
		service.readValues();
		context.close();
	}
	
}
