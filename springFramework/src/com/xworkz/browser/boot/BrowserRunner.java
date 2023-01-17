package com.xworkz.browser.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.browser.bean.Chrome;
import com.xworkz.browser.bean.FireBox;
import com.xworkz.browser.configuration.BrowserConfiguration;

public class BrowserRunner {
public static void main(String[] args) {
	ApplicationContext container = new AnnotationConfigApplicationContext(BrowserConfiguration.class);
	container.getBean(Chrome.class).browse();
	container.getBean(FireBox.class).browse();

}
}
