package project.ordermodule;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	private String dateOfPurchase;
	private double total;
	private String customer;
	private String paymentMode;
	private Integer shopId;
	
	public Order(){
		super();
	}


	public Order(Integer id, String dateOfPurchase, double total, String customer, String paymentMode, Integer shopId) {
		super();
		this.id = id;
		this.dateOfPurchase = dateOfPurchase;
		this.total = total;
		this.customer = customer;
		this.paymentMode = paymentMode;
		this.shopId = shopId;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", dateOfPurchase=" + dateOfPurchase + ", total=" + total + ", customer=" + customer
				+ ", paymentMode=" + paymentMode + ", shopId=" + shopId + "]";
	}
	

}
