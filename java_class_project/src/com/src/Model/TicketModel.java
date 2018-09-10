package com.src.Model;

public class TicketModel {
	private String ttype;
	private int mmno;
	private int tsold;
	private int trem;
	private int price;
	public String getTtype() {
		return ttype;
	}
	public void setTtype(String ttype) {
		this.ttype = ttype;
	}
	public int getMmno() {
		return mmno;
	}
	public void setMmno(int mmno) {
		this.mmno = mmno;
	}
	public int getTsold() {
		return tsold;
	}
	public void setTsold(int tsold) {
		this.tsold = tsold;
	}
	public int getTrem() {
		return trem;
	}
	public void setTrem(int trem) {
		this.trem = trem;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
