
package com.meringuesoft.bucketlist.domain;

import java.util.Date;

public class BucketList {
	int number;
	String object;
	Date register_date;
	Date achieve_date;
	String is_achieved;
	String is_marked;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public Date getRegister_date() {
		return register_date;
	}
	public void setRegister_date(Date register_date) {
		this.register_date = register_date;
	}
	public Date getAchieve_date() {
		return achieve_date;
	}
	public void setAchieve_date(Date achieve_date) {
		this.achieve_date = achieve_date;
	}
	public String getIs_achieved() {
		return is_achieved;
	}
	public void setIs_achieved(String is_achieved) {
		this.is_achieved = is_achieved;
	}
	public String getIs_marked() {
		return is_marked;
	}
	public void setIs_marked(String is_marked) {
		this.is_marked = is_marked;
	}
	
	@Override
	public String toString() {
		return "BucketList [number=" + number + ", object=" + object + ", register_date=" + register_date
				+ ", achieve_date=" + achieve_date + ", is_achieved=" + is_achieved + ", is_marked=" + is_marked + "]";
	}
}
