package com.tranza.ecommerce.model;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;;

@Entity
@Component
@Table(name="order_items")
public class OrderItem implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * Private Fields
	 */

	@Id
	@Column(name = "ITEM_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderItemId;

	@OneToOne
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;

	@Column(name = "ITEM_QUANTITY")
	private int quantity;

	@Column(name = "ITEM_PRICE")
	private int itemPrice;

	@Column(name = "ITEM_TOTAL")
	private int totalPrice;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "ORDER_ID")
	private Orders orders;

	/*
	 * Getter And Setters / Accessors And Mutators
	 */

	
	
	

	public Product getProduct() {
		return product;
	}

	public int getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}


	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "OrderItem [orderItemId=" + orderItemId + ", product=" + product + ", quantity=" + quantity
				+ ", itemPrice=" + itemPrice + ", totalPrice=" + totalPrice + ", orders=" + orders + "]";
	}
	
	

}
