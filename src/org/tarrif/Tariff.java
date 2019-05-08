package org.tarrif;

import org.openqa.selenium.WebDriver;

public class Tariff extends Base {
	public static void main(String[] args) {
		WebDriver driver=getDriver();
		getUrl("http://demo.guru99.com/telecom/");
		PageObject page=new PageObject();
		Click(page.getAddTariff());
		type(page.getMonthly_rent(),"1000");
		type(page.getFree_loc_min(),"100");
		type(page.getInter_min(),"200");
		type(page.getSms_pack(),"20");
		type(page.getLoc_per_min_chrg(),"500");
		type(page.getInter_per_min_chrg(),"100");
		type(page.getSms_per_chrg(),"600");
		Click(page.BtnSubmit);
		
		quitBrowser();
		
	}

}