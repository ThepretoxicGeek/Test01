package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import entities.DigibankEntity;

@ManagedBean(name = "digibank")
@SessionScoped
public class Digibank {

	private String name;
	private String sourcePassport;
	private String destinationPassport;
	private String destinationBank;
	private String destinationCountry;
	private int accountNumber;
	private double amount;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long transactionCode;
	
	public Long getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(Long transactionCode) {
		this.transactionCode = transactionCode;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourcePassport() {
		return sourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}
	public String getDestinationPassport() {
		return destinationPassport;
	}
	public void setDestinationPassport(String destinationPassport) {
		this.destinationPassport = destinationPassport;
	}
	public String getDestinationBank() {
		return destinationBank;
	}
	public void setDestinationBank(String destinationBank) {
		this.destinationBank = destinationBank;
	}
	public String getDestinationCountry() {
		return destinationCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public DigibankEntity getEntity()
	{
		DigibankEntity digibankEntity = new DigibankEntity();
		digibankEntity.setAccountNumber(accountNumber);
		digibankEntity.setName(name);
		digibankEntity.setAmount(amount);
		digibankEntity.setDestinationBank(destinationBank);
		digibankEntity.setDestinationCountry(destinationCountry);
		digibankEntity.setDestinationPassport(destinationPassport);
		digibankEntity.setSourcePassport(sourcePassport);
		digibankEntity.setTransactionCode(transactionCode);
		return digibankEntity;
	}
}
