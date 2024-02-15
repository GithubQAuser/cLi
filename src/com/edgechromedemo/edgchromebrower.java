package com.edgechromedemo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class edgchromebrower {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		
		//
		System.setProperty("webdriver.edge.driver","E:\\SeleniumDec23batch\\edgechrome1091518\\msedgedriver.exe");
		
		
		//
		
		WebDriver driver = new EdgeDriver();
		
		//
		
		driver.get("http://seleniumhq.org/");

	}

}
