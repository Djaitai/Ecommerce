package com.tranza.ecommerce.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "orders")
public class Orders implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ORDER_ID")
	private int orderId;

	@OneToMany(mappedBy = "orders", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@PrimaryKeyJoinColumn(name = "ORDER_ITEM_ID")
	private Set<OrderItem> orderItems;

	@Column(name = "GRAND_TOTAL")
	private int grandTotal;

	@Column(name = "NO_OF_ORDER_ITEMS")
	private int numberOfOrderItems;

	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;

	@Column(name = "PAYMENT_MODE")
	private String paymentMode;

	@OneToOne(mappedBy = "orders", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	private OrderAddress orderAddress;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public int getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(int grandTotal) {
		this.grandTotal = grandTotal;
	}

	public int getNumberOfOrderItems() {
		return numberOfOrderItems;
	}

	public void setNumberOfOrderItems(int numberOfOrderItems) {
		this.numberOfOrderItems = numberOfOrderItems;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public OrderAddress getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(OrderAddress orderAddress) {
		this.orderAddress = orderAddress;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderItems=" + orderItems + ", grandTotal=" + grandTotal
				+ ", numberOfOrderItems=" + numberOfOrderItems + ", user=" + user + ", paymentMode=" + paymentMode
				+ ", orderAddress=" + orderAddress + "]";
	}
	
	
	
	

}
