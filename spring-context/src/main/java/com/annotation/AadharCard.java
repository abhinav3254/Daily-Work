package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AadharCard {
	@Autowired
	private Citizen citizen;
	private boolean haszBiometrics=false;
	public Citizen getCitizen() {
		return citizen;
	}
	public boolean isHaszBiometrics() {
		return haszBiometrics;
	}
	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}
	public void setHaszBiometrics(boolean haszBiometrics) {
		this.haszBiometrics = haszBiometrics;
	}
	public AadharCard(Citizen citizen, boolean haszBiometrics) {
		super();
		this.citizen = citizen;
		this.haszBiometrics = haszBiometrics;
	}
	public AadharCard() {
		super();
	}
	@Override
	public String toString() {
		return "AadharCard [citizen=" + citizen + ", haszBiometrics=" + haszBiometrics + "]";
	}
}
