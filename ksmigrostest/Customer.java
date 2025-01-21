package com.mycompany;

public final class Customer {

	private String name;
	private String street;
	private int zip;
	private boolean gold;
    private String isim;

	Customer(String name, String street, int zip, boolean gold) {
		this.name = name;
		this.street = street;
		this.zip = zip;
		this.gold = gold;
	}

	public String getName() {
		return name;
	}

	public String getStreet() {
		return street;
	}

	public int getZip() {
		return zip;
	}

	public boolean isGold() {
		return gold;
	}

	public String summary(String test) {
		return test + " at " + street + " (" + zip + ") is " + (gold ? "gold" : "silver") + " customer";
	}
}