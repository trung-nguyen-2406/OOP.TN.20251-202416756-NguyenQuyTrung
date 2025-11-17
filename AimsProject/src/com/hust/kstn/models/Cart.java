package com.hust.kstn.models;

import java.util.Arrays;
import java.util.Comparator;

public class Cart {
	private static final int MAX_NUMBER_ORDERED = 20;
	private static final double SHIPPING_RATE = 0.5;
	private static final double VAT_RATE = 0.1;
	private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered = 0;
	
	public boolean addDVD(DigitalVideoDisc disc) {
		if (qtyOrdered >= MAX_NUMBER_ORDERED) {
			System.out.println("The cart is almost full");
			return false;
		}
		itemsInCart[qtyOrdered] = disc;
		qtyOrdered ++;
		System.out.println("The disc has been added successfully");
		return true;
	}

	public boolean addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		if (qtyOrdered + 2 > MAX_NUMBER_ORDERED) {
			System.out.println("The cart is almost full");
			return false;
		}
		itemsInCart[qtyOrdered] = disc1;
		qtyOrdered ++;
		itemsInCart[qtyOrdered] = disc2;
		qtyOrdered ++;
		System.out.println("The 2 discs have been added successfully");
		return true;
	}

	public boolean addDVD(DigitalVideoDisc[] discs) {
		if (qtyOrdered + discs.length > MAX_NUMBER_ORDERED) {
			System.out.println("The cart is almost full");
			return false;
		}
		for (DigitalVideoDisc disc : discs) {
			itemsInCart[qtyOrdered] = disc;
			qtyOrdered ++;
		}
		System.out.println("The discs have been added successfully");
		return true;
	}

	


	public boolean removeDVD(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("The cart is empty");
			return false;
		}
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsInCart[i] == disc) {
				for (int j = i; j < qtyOrdered - 1; j++) {
	                itemsInCart[j] = itemsInCart[j + 1];
	            }
				itemsInCart[qtyOrdered - 1] = null;
				qtyOrdered --;
				System.out.println("The disc has been removed successfully");
				return true;
			}
		}
		System.out.println("The disc does not exist");
	    return false;
	}
	
	public DigitalVideoDisc[] sortByTitle() {
		DigitalVideoDisc[] itemsInCart2 = new DigitalVideoDisc[itemsInCart.length];
		System.arraycopy(itemsInCart2, 0, itemsInCart, 0, MAX_NUMBER_ORDERED);
		Arrays.sort(itemsInCart2, new Comparator<DigitalVideoDisc> () {
			@Override
			public int compare(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
				return dvd1.getTitle().compareTo(dvd2.getTitle());
			}
		});
		return itemsInCart2;
	}
	
	public DigitalVideoDisc[] sortByPrice() {
		DigitalVideoDisc[] itemsInCart2 = new DigitalVideoDisc[itemsInCart.length];
		System.arraycopy(itemsInCart2, 0, itemsInCart, 0, MAX_NUMBER_ORDERED);
		Arrays.sort(itemsInCart2, new Comparator<DigitalVideoDisc> () {
			@Override
			public int compare(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
				return (int) (dvd1.getCost() - dvd2.getCost());
			}
		});
		return itemsInCart2;
	}
	
	public DigitalVideoDisc[] findDVD(String id) {
	    DigitalVideoDisc[] result = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	    int counter = 0;
	    for (int i = 0; i < qtyOrdered; i++) {
	        DigitalVideoDisc d = itemsInCart[i];
	        if (d != null && id.equals(d.getID())) {
	            result[counter++] = d;
	        }
	    }
	    if (counter == 0) {
	        System.out.println("No match for id: " + id);
	    }
	    return result;
	}
	
	public DigitalVideoDisc[] findTitle(String title) {
		DigitalVideoDisc[] result = new DigitalVideoDisc[MAX_NUMBER_ORDERED];;
		int counter = 0;
		for (int i = 0; i < qtyOrdered; i++) {
	        DigitalVideoDisc d = itemsInCart[i];
	        if (d != null && title.equals(d.getTitle())) {
	            result[counter++] = d;
	        }
	    }
		if (counter == 0) {
			System.out.println("No match for id: " + title);
		}
		return result;
	}
	
	public double calculateShippingFee() {
	    double sum = 0.0;
	    for (int i = 0; i < qtyOrdered; i++) {
	        sum += itemsInCart[i].getWeight();
	    }
	    return sum * SHIPPING_RATE;
	}
	
	public void printList(DigitalVideoDisc[] list) {
		for (DigitalVideoDisc d : list) {
			System.out.println("Title: " + d.getTitle() + " - price: " + d.getCost());
		}
	}
	
	public void printReceipt() {
		System.out.println("=== Your Receipt ===");
	    print();
	    double cost = calculateTotalCost();
	    System.out.println("Total (before VAT): " + cost);
		System.out.println("Total: " + (1 + VAT_RATE) * cost);
		System.out.println("Shipping fee: " + calculateShippingFee());
		System.out.println("=========");
	}
	
	public double calculateTotalCost() {
	    double totalCost = 0.0;
	    for (int i = 0; i < qtyOrdered; i++) {
	        totalCost += itemsInCart[i].getCost();
	    }
	    return totalCost;
	}

	
	public void print() {
		System.out.println("=== Total items in cart: " + qtyOrdered + "===");
		System.out.println("=== All items in cart ===");
		for (int i = 0; i < qtyOrdered; i++) {
	        DigitalVideoDisc d = itemsInCart[i];
	        System.out.println("Title: " + d.getTitle() + " - price: " + d.getCost());
	    }
	}
	
	
}
