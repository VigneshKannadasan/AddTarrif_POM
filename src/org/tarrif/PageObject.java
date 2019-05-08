package org.tarrif;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject extends Base {
	public PageObject() {
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()='Add Tariff Plan']")
	private WebElement AddTariff;
	
	@FindBy(id="rental1")
	private WebElement Monthly_rent;
	
	@FindBy(id="local_minutes")
	private WebElement Free_loc_min;
	
	@FindBy(id="inter_minutes")
	private WebElement Inter_min;
	
	@FindBy(id="sms_pack")
	private WebElement Sms_pack;
	
	@FindBy(id="minutes_charges")
	private WebElement loc_per_min_chrg;
	

	@FindBy(id="inter_charges")
	private WebElement inter_per_min_chrg;
	

	@FindBy(id="sms_charges")
	private WebElement sms_per_chrg;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement BtnSubmit;

	//Getters
	public WebElement getAddTariff() {
		return AddTariff;
	}

	public WebElement getMonthly_rent() {
		return Monthly_rent;
	}

	public WebElement getFree_loc_min() {
		return Free_loc_min;
	}

	public WebElement getInter_min() {
		return Inter_min;
	}

	public WebElement getSms_pack() {
		return Sms_pack;
	}

	public WebElement getLoc_per_min_chrg() {
		return loc_per_min_chrg;
	}

	public WebElement getInter_per_min_chrg() {
		return inter_per_min_chrg;
	}

	public WebElement getSms_per_chrg() {
		return sms_per_chrg;
	}

	public WebElement getSubmit() {
		return  BtnSubmit;
	}

	
	}
