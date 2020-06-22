package io.miniproject.restaurant.data.process;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restaurant {
	@Id
	int rId;
	String rName;
	long rPhone;
	String rCity;
	String rState;
	int rZip;
	String rCountry;

	public Restaurant() {

	}

	public Restaurant(int rId, String rName, long rPhone, String rCity, String rState, int rZip, String rCountry) {

		this.rId = rId;
		this.rName = rName;
		this.rPhone = rPhone;
		this.rCity = rCity;
		this.rState = rState;
		this.rZip = rZip;
		this.rCountry = rCountry;
	}

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public long getrPhone() {
		return rPhone;
	}

	public void setrPhone(long rPhone) {
		this.rPhone = rPhone;
	}

	public String getrCity() {
		return rCity;
	}

	public void setrCity(String rCity) {
		this.rCity = rCity;
	}

	public String getrState() {
		return rState;
	}

	public void setrState(String rState) {
		this.rState = rState;
	}

	public int getrZip() {
		return rZip;
	}

	public void setrZip(int rZip) {
		this.rZip = rZip;
	}

	public String getrCountry() {
		return rCountry;
	}

	public void setrCountry(String rCountry) {
		this.rCountry = rCountry;
	}

}
