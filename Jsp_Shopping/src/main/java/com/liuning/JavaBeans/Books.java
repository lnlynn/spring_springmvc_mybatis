package com.liuning.JavaBeans;

public class Books {

	private int id;
	private String name;
	private String author;
	private String publishHouse;
	private int price;
	private int nums;
	
	private int shoppingNumber = 1;//购买的数量
	
	
	public int getShoppingNumber() {
		return shoppingNumber;
	}
	public void setShoppingNumber(int shoppingNumber) {
		this.shoppingNumber = shoppingNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishHouse() {
		return publishHouse;
	}
	public void setPublishHouse(String publishHouse) {
		this.publishHouse = publishHouse;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
	}
	
	
	
}
