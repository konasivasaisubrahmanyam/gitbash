package com.model;

public class Book {
	private int bookid;
	private String name;
	private int price;
	private int authorid;
	private int pages;
	public Book(int bookid, String name, int price, int authorid, int pages) {
		super();
		this.bookid = bookid;
		this.name = name;
		this.price = price;
		this.authorid = authorid;
		this.pages = pages;
	}
	public Book() {}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	

}
