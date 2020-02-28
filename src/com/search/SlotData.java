package com.search;

public class SlotData {
	int s;
	String no;
	int r;
	int flag;
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public SlotData(int s, String no, int r, int flag) {
		super();
		this.s = s;
		this.no = no;
		this.r = r;
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "SlotData [s=" + s + ", no=" + no + ", r=" + r + ", flag=" + flag + "]";
	}
	

}
