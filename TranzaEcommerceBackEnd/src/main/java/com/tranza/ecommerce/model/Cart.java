package com.tranza.ecommerce.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "cart")
public class Cart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CART_ID")
	private int cartId;

	@OneToMany(mappedBy = "cart", fetch = FetchType.EAGER)
	@PrimaryKeyJoinColumn(name = "CART_ITEM_ID")
	private Set<CartItem> cartItems;

	@Column(name = "GRAND_TOTAL")
	private int grandTotal;

	@Column(name = "NO_OF_CART_ITEMS")
	private int numberOfCartItems;

	@OneToOne
	@JoinColumn(name = "USER_ID")
	private User user;

	/*
	 * Filtering CartItems
	 * 
	 * CHECK LATER
	 */
	/*public Set<CartItem> getAcctualCartItem(Set<CartItem> cartItems) {
		Set<CartItem> acctualCartItems = cartItems;
		Set<CartItem> items = new HashSet<>();
		for (CartItem item : acctualCartItems) {
			if (item.isWishList() == false) {
				items.add(item);
			}
		}
		return items;
	}*/

}
