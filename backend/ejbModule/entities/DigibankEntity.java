package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="digibank_tbl")
public class DigibankEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long transactionCode;
	
	private String name;
	private String sourcePassport;
	private String destinationPassport;
	private String destinationBank;
	private String destinationCountry;
	private int accountNumber;
	private double amount;
	
	/*@GeneratedValue
	@Column(name="transactionCode")
	private int transactionCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
*/
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

	public Long getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(Long transactionCode) {
		this.transactionCode = transactionCode;
	}
	
	
}
