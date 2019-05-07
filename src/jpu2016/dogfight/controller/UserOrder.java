package jpu2016.dogfight.controller;

import java.util.ArrayList;
import java.util.List;

public class UserOrder implements IUserOrder {
	private int player() {
		return 0;
	};
	
	private List<Order> order = new ArrayList<Order>();
	public UserOrder(int player, Order order) {
	
	}; 
	
	public Order getOrder() {
		return null; 
	};
	
	public int getPlayer() { 
	    return 0; 
    };
    
}